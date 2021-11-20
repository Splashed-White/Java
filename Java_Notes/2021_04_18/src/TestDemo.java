import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-18
 * Time: 15:09
 */

public class TestDemo {
    /**
     * 不规则二维数组
     * @param args
     */
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[12];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * 二维数组的遍历
     * @param args
     */
    public static void main6(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============  for-each  ==================");
        for (int[] ret:arr) {
            for (int x:ret) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("=============  Arrays.toString  ==================");
        System.out.println(Arrays.toString(arr));   //[[I@1b6d3586, [I@4554617c] 视为一维数组存的是地址
        System.out.println(Arrays.deepToString(arr));  //[[1, 2, 3], [4, 5, 6]]
    }
    /**
     * 二维数组定义
     * @param args
     */
    public static void main5(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};  //[2][3]
        int[][] arr2 = new int[][]{{1,2,3},{4,5,6}};  //[2][3]
        //int[][] arr2 = new int[2][3]{{1,2,3},{4,5,6}};  //error
        int[][] arr3 = new int[2][3];
        //不规则二维数组
        int[][] arr4 = new int[2][]; //java中可以省略列，但不能省略行
    }
    /**
     * 方法：填充
     * Arrays.fill
     * @param args
     */
    public static void main4(String[] args) {
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));  //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Arrays.fill(arr,0,3,99);  //局部填充 左闭右开
        System.out.println(Arrays.toString(arr));  //[99, 99, 99, 0, 0, 0, 0, 0, 0, 0]
        Arrays.fill(arr,99);   //全局填充
        System.out.println(Arrays.toString(arr));  //[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]
    }
    /**
     * 方法：相同判断
     * Arrays.equals
     * @param args
     */
    public static void main3(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.equals(arr1,arr2)); //true
    }
    /**
     * 方法：二分查找
     * Arrays.binarySearch
     * @param args
     */
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.binarySearch(arr,0,3,2));
    }
    /**
     * 冒泡排序
     * @param arr
     */
    public static void BubbleSort(int[] arr){
        boolean flag;   //优化
        //用 i 来表示趟数    arr.length - 1
        for (int i = 0; i < arr.length - 1 ; i++) {
            flag = false;
            //用 j 表示
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false)
                break;
        }
    }
    public static void main1(String[] args) {
        int[] arr = {10,5,2,12,6};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));   //[2, 5, 6, 10, 12]
    }
}
