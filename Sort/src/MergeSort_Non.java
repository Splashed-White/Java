/**
 * Created with IntelliJ IDEA.
 * Description: 非递归 实现 归并排序
 * User: TL
 * Date: 2021-07-30
 * Time: 16:18
 */
public class MergeSort_Non {

    /**
     * 非递归实现 归并排序
     * @param array
     * @param gap
     */
    public static void merge(int[] array,int gap) {
        int[] tmp = new int[array.length];
        int k = 0;

        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        //int e2 = s2+gap-1 >= array.length ? array.length-1 : s2+gap-1;
        int e2 = s2+gap-1 < array.length ?  s2+gap-1 : array.length-1;

        //保证有两个归并段
        while (s2 < array.length) {
            while (s1 <= e1 && s2 <= e2) {
                if(array[s1] <= array[s2]) {
                    tmp[k++] = array[s1++];
                }else {
                    tmp[k++] = array[s2++];
                }
            }
            while (s1 <= e1) {
                tmp[k++] = array[s1++];
            }
            while (s2 <= e2) {
                tmp[k++] = array[s2++];
            }
            //一组完了 确定新的区间的开始和结束
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 = s2+gap-1 < array.length ?  s2+gap-1 : array.length-1;
        }
        //e2 > array.length
        while (s1 <= array.length-1) {
            tmp[k++] = array[s1++];
        }

        for (int i = 0; i < tmp.length; i++) {
            array[i] = tmp[i];
        }
    }

    public static void mergeSort(int[] array) {
        for (int i = 1; i < array.length; i*=2) {
            merge(array,i);
        }
    }
}
