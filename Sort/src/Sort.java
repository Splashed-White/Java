import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-26
 * Time: 16:37
 */
public class Sort {
    /**
     * 直接插入排序
     * 稳定性：稳定
     * 时间复杂度：
     *          最好：O(N)  前提是数据本身有序
     *          最坏：O(N^2)
     * 空间复杂度：O(1)
     * 思想：
     * 待排元素i前一位的j在从后往前走的过程中，只要比i大，就把j赋给i，
     * 一趟排完后把i的值赋给空下来的j的位置
     * 一旦j在走的过程中遇到比i小的值，直接循环结束
     *
     * 结论：当一组数据，数据量不大且趋于有序时，此时用插入排序更快。越有序越快
     *
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) { //n-1
            int temp = array[i];
            int j = i-1;
            for (; j >= 0 ; j--) { //n-1
                if(array[j] > temp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = temp;
        }
    }

    /**
     * 希尔排序
     * 稳定性：不稳定
     *       ★技巧：如果在比较过程中，没有发生跳跃式的交换，那么就是稳定的
     *        时间复杂度：不好算 gap取值不同，时间复杂度就不同
     *                  [N^1.3 ~ N^1.5之间]
     *        空间复杂度：O(1)
     * 思想：
     * 将数据按间隔gap分组，每组之间进行直接插入排序，gap间隔变少重复上述操作
     * gap越大，移的越快，越不有序；gap越大，移的越慢，但是越有序；
     * @param array
     * @param gap
     */
    public static void shell(int[] array,int gap){
        //间隔为gap的分组情况 --- 类直接插入排序
        for (int i = gap; i < array.length; i++) {
            //i = i + gap √ 因为最后gap = 1，相当于最后进行直接插入排序，最终还是有序的
            int temp = array[i];
            int j = i - gap;
            for (; j >= 0 ; j -= gap) {
                if(array[j] > temp){
                    array[j + gap] = array[j];
                }else{
                    break;
                }
            }
            array[j + gap] = temp;
        }
    }
    public static void shellSort(int[] array) {
        //处理gap --- gap互为素数，且最后一个gap须为1
        int gap = array.length;
        while(gap > 1){
            gap = gap/3 + 1; // +1 是为了保证最后一个序列是1
            //gap /= 2;
            shell(array,gap);
        }
    }

    /**
     * 选择排序
     * 稳定性：不稳定
     * 时间复杂度：
     *          最好：O(N^2)
     *          最坏：O(N^2)
     * 空间复杂度：O(1)
     * 思想：一趟排序中将待排元素与其后的每一个数比较，选择一个小的放前面，
     * 这样每经一趟排序就会多一个元素有序（从左向右）
     *
     * @param array
     */
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序
     * 稳定性：稳定
     * 时间复杂度：
     *          最好：O(N^2)
     *          最坏：O(N^2)
     * 空间复杂度：O(1)
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1 ; i++) { //排序的趟数
            for (int j = 0; j < array.length-1-i; j++) { //每一次比较都比趟数少1
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
    }

    /*优化的冒泡排序
    时间复杂度：有序的情况下为O(N)
    */
    public static void bubbleSort2(int[] array) {
        //boolean flag = false; //bug
        for (int i = 0; i < array.length - 1; i++) { //排序的趟数
            boolean flag = false;
            /*Q: 为什么每一趟都要置false？
              A: 若没有每一趟重置flag,那么
                   第一趟排完以后falg = true,在进行第二趟排序时已经有序不用进入forj的循环，
                   但在本趟结束时判断flag中，falg本应该是false，结束循环,
                   但因为上一趟的true，需要继续排序
                   ① 4 5 3 8 10
                   ② 3 4 5 8 10
                   */
            for (int j = 0; j < array.length - 1 - i; j++) { //每一次比较都比趟数少1
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) { //说明上面本趟没有发生交换，数据已经整体有序，结束排序
                break;
            }
        }
    }


    /**
     * 快速排序
     * 稳定性：不稳定
     * 时间复杂度：
     *          最好：O(N*logN) --- 均匀分割时，二叉树
     *          最坏：O(N^2) --- 数据有序时，单分支树
     * 空间复杂度：
     *          最好：O(logN) --- 均匀分割时，树的高度，保存pivot
     *          最坏：O(N) --- 数据有序时
     * 分治思想：如果能够均匀的将待排序列分割，那么就是
     * @param array
     */

    /*
    挖坑法找基准pivot -- 必须先走右边，因为先左无法保证右边的数比temp小
     */
    public static int partition1(int[] array,int low,int high){
        int temp = array[low];  //第一个位置挖空
        while(low < high){
            //右边找比temp小的，填到空坑中，右边的就空了
            while (low < high && array[high] >= temp) {
                high--;
            }
            array[low] = array[high];
            //左边找比temp大的，填到空坑中，左边的就空了
            while (low < high && array[low] <= temp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp; //直到相遇，把最开始的temp值放进来
        return low;
    }

    public static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static int partition2(int[] array,int low,int high){ //Hoare法找基准pivot
        int temp = array[low];
        while(low < high){
            //右边找比temp小的
            while (low < high && array[high] >= temp) {
                high--;
            }
            //左边找比temp大的
            while (low < high && array[low] <= temp) {
                low++;
            }
            swap(array,low,high); //两个数交换
        }
        swap(array,low,temp);
        return low;
    }

    public static void quick(int[] array,int start,int end){
        if(start >= end) {
            return;
        }
        int pivot = partition1(array,start,end);
        quick(array,start,pivot-1); //递归左边
        quick(array,pivot+1,end); //递归右边
    }
    public static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }















    public static void main(String[] args) {
        //直接插入排序
        /*int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        insertSort(array);
        System.out.println(Arrays.toString(array));*/

        //希尔排序  ---不太重要
        /*int[] array = {10,6,9,3,5};
        shellSort(array);
        System.out.println(Arrays.toString(array));*/

        //选择排序
        /*int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        selectSort(array);
        System.out.println(Arrays.toString(array));*/

        //冒泡排序
        /*int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        bubbleSort2(array);
        System.out.println(Arrays.toString(array));*/

        //快速排序
        /*int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        quickSort(array);
        System.out.println(Arrays.toString(array));*/
    }
}
