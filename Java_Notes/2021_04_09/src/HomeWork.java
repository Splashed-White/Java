import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-10
 * Time: 16:30
 */

public class HomeWork {
    /**
     * 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3
     * ​要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
     * @param a
     */
    public static int max2(int a,int b){
        int max = a >= b ? a : b;
        return max;
    }
    public static int max3(int a,int b,int c){
         int max1 = max2(a,b);
         int max2 = max2(max1,c);
         return max2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
//        System.out.println("初始值：a = "+ a +" b = "+b);
//        int ret1 = max2(a,b);
//        System.out.println("两数中的最大值为：" + ret1);
        System.out.println("初始值：a = "+ a +" b = "+b + " c = " + c);
        int ret2 = max3(a,b,c);
        System.out.println("三数中的最大值为：" + ret2);
    }

    /**
     * 求 N 的阶乘
     * @param args
     */
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i <= N ; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
    /**
     * 求1！+2！+3！+4！+........+n!的和
     * @param n
     */
    public static int func(int n){  //求某个数的阶乘
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret = ret * i;
        }
        return ret;
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += func(i);
        }
        System.out.println(sum);

    }

    /**
     * 求斐波那契数列的第n项。(迭代实现)
     * F(1)=1，F(2)=1,
     * F(n)=F(n-1)+F(n-2)（n ≥ 3，n ∈ N*）
     * 1、1、2、3、5、8、13、21、34.....
     * @param args
     */
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();
        int f1 = 1;
        int f2 = 1;
        int sum = 0;
        if(n == 1 || n == 2){
            System.out.println(1);
        }
        for (int i = 3; i <= n; i++) {
            sum = f1 + f2;
            f2 = sum;
            f1 = f2;
        }
        System.out.println(sum);
    }

    /**
     * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
     */
    public static void main1(String[] args) {
        int[] arr = {3, 4, 5, 4, 3};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
                if (arr[i] == arr[j]) {
                    count++;
                }
            if(count == 1){
                System.out.println("只出现一次的数字是："+arr[i]);
            }
        }

    }
}
