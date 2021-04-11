import com.sun.javaws.IconUtil;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-11
 * Time: 9:27
 */

public class TestDemo2 {
    /**
     * 求斐波那契数列的第 N 项
     * 1、1、2、3、5、8、13、21、34……
     * @param n
     */
    //多路递归
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }


    /**
     * 写一个递归方法，输入一个非负整数，返回组成它的数字之和.
     * 例如，输入 1729, 则应该返回1+7+2+9，它的和是19
     * @param n
     */
    public static int add2(int n){
        if(n >10){
            return add2(n/10) + n%10;
        }
       return  n%10;
    }
    public static void main6(String[] args) {
        int n = 123;
        System.out.println(add2(n));
    }


    /**
     * 递归求 1 + 2 + 3 + ... + 10
     * @param n
     */
    // sum(n) = n + sum(n-1)
    public static int add(int n){
        if(n == 1){
            return 1;
        }
        return n + add(n - 1);
    }
    public static void main5(String[] args) {
        int n = 10;
        add(n);
    }

    /**
     * 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
     * @param n
     */
    public static void print(int n){
        int x = 0;
        if(n <= 9){   //一位数，终止条件
            System.out.println(n % 10);
            return;
        };
        print(n/10);
        System.out.println(n%10);
        return;
    }
    public static void main4(String[] args) {
        int n = 1234;
        print(n);
    }

    /**
     * 递归求阶乘
     * @param n
     * @return
     */
    public static int fac(int n){
        if(n == 1){
            return 1;
        }
        return n * fac(n-1);
    }
    public static void main3(String[] args) {
        System.out.println(fac(5));
    }
    /**
     * 方法递归
     * 递归的优点：代码量少
     */
    //  func(i) = dunc(i-1)
    public static void func(int i){
        if(i == 1){
            return;
        }
        func(i - 1);
    }
    public static void main2(String[] args) {
        func(2);
    }


    /**
     * 重载:
     * 1. 方法名相同
     * 2. 方法的参数列表不同（类型，个数）
     * 3. 方法的返回类型不做要求
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a,int b){  //int _sum(int_,int_)
        return a+b;
    }
//    public static double sum(int a,int b){   //返回类型不影响重载
//        return a+b;
//    }

    /**
     * 可变参数编程
     * @param array
     * @return
     */
    public static int sum(int... array){
        int ret = 0;
        for(int x:array){
            ret += x;
        }
        return ret;
    }
    public static double sum(double a,double b){  //double _sum(double_,double_)
        return a+b;
    }
    public static void main1(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println(sum(a,b));
//        double c = 12.2;
//        double d = 11.5;
//        System.out.println(sum(c,d));
        int ret =sum(1,2,3,4,5,6,7,8,9,10,11,12,13);
        System.out.println(ret);
        int ret2 = sum(1,2);
        System.out.println(ret2);
        int ret3 = sum(1,2,3);
        System.out.println(ret3);
    }
}
