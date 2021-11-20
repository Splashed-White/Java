/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-14
 * Time: 10:32
 */
public class HomeWork {
    /**
     * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
     * 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
     * @param arr
     */
    public static void transform(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        transform(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");;
        }
    }

    /**
     * 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
     * @param args
     */
    public static void main4(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值
     * @param arr
     */
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main3(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8,9,10};
        printArray(arr);
    }
    /**
     * 实现一个方法 sum, 以数组为参数, 求数组所有元素之和
     * @param arr
     */
    public static int Sum(int[] arr){
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
        }
        return ret;
    }
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ret = Sum(arr);
        System.out.println(ret);
    }

    /**
     * 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
     * @param arr
     */
    public static double Average(int[] arr){
        double ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
        }
        ret = ret/arr.length;
        return ret;
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        double ret = Average(arr);
        System.out.println(ret);
    }
}
