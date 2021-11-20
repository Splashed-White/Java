import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-13
 * Time: 18:46
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};  //长度定死的  ，需要扩容
        int[] arr = new int[]{1, 2, 3};//长度定死的
        int[] arr3 = new int[10];
    }
    /**
     * 参数传数组类型
     *  在函数内部修改数组内容, 函数外部也发生改变
     * @param a
     */
    public static void func(int[] a) {
        a[0] = 10;
        System.out.println("a[0] = " + a[0]); //10
    }
    public static void main8(String[] args) {
        int[] arr = {1, 2, 3};
        func(arr);
        System.out.println("arr[0] = " + arr[0]);  //10
    }

    /**
     * 参数传内置类型
     * 修改形参 x 的值, 不影响实参 num 的值
     * @param args
     */
    public static void main7(String[] args) {
            int num = 0;
            func(num);
            System.out.println("num = " + num);  //0
        }
        public static void func(int x) {
            x = 10;
            System.out.println("x = " + x); //10
    }
    /**
     * 交换两个整数
     * @param a
     */
    public static void swap1(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void swap2(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main6(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr = {10,20};
        System.out.println("交换前");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        swap1(a,b);
        System.out.println("swap1交换后");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        swap2(arr);
        System.out.println("swap2交换后");
        System.out.println("a = " + arr[0]);
        System.out.println("b = " + arr[1]);

    }
    /**
     * 实现一个方法：打印一个整型数组
     * @param arr
     */
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void change(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
    }
    public static void main5(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr); //修改之前
        change(arr);
        print(arr); //修改之后

    }
    /**
     * 局部变量：{}内，在作用域的角度考虑
     * 引用变量：以数据类型划分的
     * 引用类型的0值，就是null；代表这个引用不指向任何对象
     * null.任何东西 都是报错   NullPointerException
     * @param args
     */
    public static void main4(String[] args) {
        //a 是一个局部变量，在使用之前一定要初始化
        int a;
        //System.out.println(a);//error
        //int[] arr;
        //System.out.println(arr); //error
        int[] arr = null;
        System.out.println(arr); //null
        //System.out.println(arr.length); //报错
        //null.任何东西 都是报错   NullPointerException


    }
    /**
     * 数组越界
     * @param args
     */
    public static void main3(String[] args) {
        int[] array = {10,20,30,40,50};
        System.out.println(array[1]);
        //System.out.println(array[12]);   //error 数组越界
    }
    /**
     * 遍历数组的方式：
     * 1. 数组名.length 就可以获取到数组的长度
     * 2. for-each
     * 3. 数组转字符串
     * @param args
     */
    public static void main2(String[] args) {
        int[] array = {10,20,30,40,50};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("============  for-each  ================");
        for (int x:array) {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("============  数组转换字符串  =============");
        String ret = Arrays.toString(array);
        System.out.println(ret);  //[10, 20, 30, 40, 50]
    }
    /**
     * 创建数组
     * 1. 等号=右边的[]里不可以出现数字
     * 2. 这个数组奥就是里面数据的个数
     * @param args
     */
    public static void main1(String[] args) {
        //局部变量  -->  函数内部定义的变量
        //"只要"new的就在堆上开内存
        int[] array = {10,20,30,40,50};  //定义且初始化一个数组  //省略，相当于new了
        int[] array2 = new int[10]; //定义一个数组
        int[] array3 = new int[]{1,2,3,4,5};
        //array 是一个引用，指向一个数组对象
    }
}
