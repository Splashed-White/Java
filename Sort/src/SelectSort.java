import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-28
 * Time: 17:05
 */
public class SelectSort {
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

    public static void main(String[] args) {
        //选择排序
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
