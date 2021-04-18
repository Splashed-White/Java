import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-16
 * Time: 16:19
 */
public class TestDemo {
    /**
     * 数组数字排列
     * 给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
     * @param arr
     */
    public static void transform(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        transform(arr);
        System.out.println(Arrays.toString(arr));   //[4, 2, 3, 1]
    }
    /**
     * 数组逆序：给定一个数组, 将里面的元素逆序
     * @param arr
     */
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main11(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 判断数组是否递增
     * @param arr
     */
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main10(String[] args) {
        int[] arr = {2,3,5,7,8};
        System.out.println(isSorted(arr));
    }
    /**
     * 数组的拷贝方式(浅拷贝):如果细分的话，要分基本类型和引用类型
     * 浅拷贝：修改原数组, 会影响到新数组
     * 深拷贝：修改原数组, 不会影响到新数组
     * 1. for循环进行拷贝
     * 2. copyof / copyOfRange   √
     * 3. System.arraycopy       √   更快，因为底层是C++写的，优点是速度快
     * 4. 数组名.clone()  ->产生当前数组的一个副本
     * @param args
     */
    // 4. 数组名.clone()
    public static void main9(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ret = arr.clone();
        System.out.println(Arrays.toString(ret));  //[1, 2, 3, 4, 5]
    }
    // 3. System.arraycopy
    public static void main8(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] copy1 = new int[arr.length];
        int[] copy2 = new int[arr.length];
        System.arraycopy(arr,0,copy1,0,arr.length);
        System.arraycopy(arr,1,copy2,3,2);
        System.out.println(Arrays.toString(copy1));  //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(copy2));  //[0, 0, 0, 2, 3]
    }
    // 2. copyof / copyOfRange
    public static void main7(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ret1 = Arrays.copyOf(arr,arr.length);  //拷贝arr，长度自定义
        int[] ret2 = Arrays.copyOfRange(arr,1,3);  //拷贝arr范围 [from，to)
        System.out.println(Arrays.toString(ret1));  //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(ret2));  //[2, 3]
    }
    public static void main6(String[] args) {
        int[] arr = {1,2,3,4,5};

        //1. for循环进行拷贝
        int[] copy= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));  //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(copy));
        System.out.println("===========修改============");
        copy[0] = 99;
        System.out.println(Arrays.toString(arr));  //[1, 2, 3, 4, 5]不会改变 浅拷贝
        System.out.println(Arrays.toString(copy));
    }

    /**
     * 查找数组中指定元素(二分查找) 针对有序数组
     * @param arr
     */
    public static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
                right = mid - 1;
            } else if (toFind > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main5(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,6));
    }
    /**
     * 查找数组中指定元素(顺序查找)
     * @param arr
     */
    public static int findNumIndex(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main4(String[] args) {
        int[] arr = {1,2,3,6,5,4};
        System.out.println(findNumIndex(arr,4));
    }

    /**
     * 找出数组中的最大值
     * @param arr
     */
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main3(String[] args) {
        int[] arr = {1,2,3,6,5,4};
        System.out.println(findMax(arr));
    }

    /**
     * 自定义——数组转字符串
     * @param array
     */
    public static String toString(int[] array){
        if (array == null) {
            return "null";
        }
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret = ret + array[i];
            if(i != array.length-1){
                ret = ret + ",";
            }
        }
        ret = ret + "]";
        return ret;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5};
        //int[] array1 = null; array.length 空值异常
        System.out.println(toString(array));
    }
    /**
     * 数组作为方法的返回值
     * @return
     */
    public static int[] func() {
        int a = 10;
        int b = 20;
        int[] array = {a, b};
        return array;
    }

    /**
     * 将数组扩大2倍
     * @param array
     */
    public static void func2(int[] array){  //修改原数组
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]*2;
        }
    }
    public static int[] func3(int[] array){  //创建临时数组，不会破坏原数组
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i]*2;
        }
        return temp;
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));  //[1, 2, 3, 4, 5]
        func3(array);
        System.out.println(Arrays.toString(array));  //[1, 2, 3, 4, 5]
        int[] ret = func3(array);
        System.out.println(Arrays.toString(ret));  //[2, 4, 6, 8, 10]
    }
}
