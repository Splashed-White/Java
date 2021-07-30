import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-28
 * Time: 17:05
 */
public class Shell {
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

    public static void main(String[] args) {
        //希尔排序  ---不太重要
        int[] array = {10,6,9,3,5};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
