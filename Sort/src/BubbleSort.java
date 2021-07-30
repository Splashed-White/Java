import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-28
 * Time: 17:05
 */
public class BubbleSort {
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

    public static void main(String[] args) {
        //冒泡排序
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        bubbleSort2(array);
        System.out.println(Arrays.toString(array));
    }
}
