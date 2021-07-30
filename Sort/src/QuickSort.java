/**
 * Created with IntelliJ IDEA.
 * Description: 递归 实现 快速排序
 * User: TL
 * Date: 2021-07-30
 * Time: 15:16
 */
public class QuickSort {
    //选择基准方式一：随机取数
    /*
     *  优化
     *  选择基准方式二：三数取中法
     * 采用三数取中，速度会变快，在十万个数据的情况下效果尤为明显；若是直接partition,会栈溢出
     */
    public static void selectPivotMedianOfThree(int[] array,int start,int end,int mid) {
        //array[mid] <= array[start] <= array[end]
        if(array[mid] > array[start]) {
            swap(array,start,mid);
        }// array[mid] <= array[start]
        if(array[start] > array[end]) {
            swap(array,start,end);
        }// array[start] <= array[end]
        if(array[mid] > array[end]) {
            swap(array,start,end);
        }// array[mid] <= array[end]
    }
    //直接插入排序
    public static void insertSort(int[] array,int start,int end){
        for (int i = start+1; i <= end; i++) { //n-1
            int temp = array[i];
            int j = i-1;
            for (; j >= start ; j--) { //n-1
                if(array[j] > temp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = temp;
        }
    }
    //优化
    public static void quick(int[] array,int start,int end){
        if(start >= end) {
            return;
        }
        //优化：待排区间选一个阈值，使用直接插入排序效率更高
        if(end - start + 1 <= 100){ //判断两个下标之间相距的个数
            insertSort(array,start,end);
            return; //这里一定要return,有序以后就不用走下面的了
        }
        int mid = (start + end)/2;
        selectPivotMedianOfThree(array,start,end,mid);
        int pivot = partition1(array,start,end);
        quick(array,start,pivot-1); //递归左边
        quick(array,pivot+1,end); //递归右边
    }


    /*
    * partition1: 挖空法
    * 遍历整个待排序区间，将比基准值小的放到基准值的左边，将比基准值大的放到基准值的右边；
    * 必须先走右边，因为先左无法保证右边的数比temp小
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

    /*
     * partition2: Hoare法
     * 遍历整个待排序区间，将比基准值小的放到基准值的左边，将比基准值大的放到基准值的右边；
     */
    public static int partition2(int[] array,int low,int high){
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
    public static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
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
    /*public static void quick(int[] array,int start,int end){
        if(start >= end) {
            return;
        }
        int mid = (start + end)/2;
        int pivot = partition1(array,start,end);
        quick(array,start,pivot-1); //递归左边
        quick(array,pivot+1,end); //递归右边
    }*/
    public static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }



    //测试
    public static void main(String[] args) {
        //快速排序
        /*int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        quickSort(array);
        System.out.println(Arrays.toString(array));*/

        //Q:排序十万个数据
        /*int[] array = new int[10_0000];
        Random radom = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        quickSort(array);*/
    }
}
