package Algorithm.贪心;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-16
 * Time: 15:37
 */
public class 选择排序 {
    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void selectSort(int[] arr){
        int len = arr.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            index = i;
            //贪心：每次从未排序数组中找最小值
            for (int j = i+1; j < len; j++) {
                if(arr[j] < arr[index])
                    index = j;
            }
            swap(arr,index,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,6,1,8,4,5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));  //[1, 2, 3, 4, 5, 6, 8]
    }
}
