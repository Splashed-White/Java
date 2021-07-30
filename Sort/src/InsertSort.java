import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-28
 * Time: 17:04
 */
public class InsertSort {
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

    public static void main(String[] args) {
        //直接插入排序
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
