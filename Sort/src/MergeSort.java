import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 递归 实现 归并排序
 * User: TL
 * Date: 2021-07-30
 * Time: 15:27
 */
public class MergeSort {

    /**
     * 时间复杂度： O(N*log n)
     * 空间复杂度：O(N)
     * 稳定性：稳定的
     * @param array
     */

    //合并的过程
    public static void merge(int[] array,int low,int mid,int high){
        int s1 = low;
        int e1 = mid;
        int s2 = mid+1;
        int e2 = high;

        int[] tmp = new int[high-low+1];
        int k = 0;//代表tmp数组的下标

        while (s1 <= e1 && s2 <= e2) {
            if(array[s1] <= array[s2]) {
                tmp[k++] = array[s1++];
                //k++;
                //s1++;
            }else {
                tmp[k++] = array[s2++];
            }
        }
        //有2种情况
        while (s1 <= e1){
            //说明第2个归并段没有了数据 把第1个归并段剩下的数据 全部拷贝过来
            tmp[k++] = array[s1++];
        }
        while (s2 <= e2) {
            //说明第1个归并段没有了数据 把第2个归并段剩下的数据 全部拷贝过来
            tmp[k++] = array[s2++];
        }
        //tmp数组当中 存储的就是当前归并好的数据

        //这样的代码是错误的
        /*for (int i = 0; i < array.length; i++) {
            array[i] = tmp[i];
        }*/
        for (int i = 0; i < tmp.length; i++) {
            array[i+low] = tmp[i];
        }
    }

    public static void mergeSortInternal(int[] array,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low + high) /2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high); //先全分完再合
        //合并的过程
        merge(array,low,mid,high);
    }
    public static void mergeSort(int[] array) { //统一接口
        mergeSortInternal(array, 0,array.length-1);
    }

    public static void main(String[] args) {
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
        //[0, 4, 5, 6, 7, 8, 9, 12, 22, 33, 34, 55, 56, 77, 89]
    }
}
