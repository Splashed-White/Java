import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-11
 * Time: 11:21
 */
public class TestDemo4 {
    /**
     * 青蛙跳台阶问题(斐波那契数列)
     * 一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法
     * 1个台阶 ---> 1
     * 2个台阶 ---> 2
     * 3个台阶 ---> 3 = 2 + 1
     * 4个台阶 ---> 5 = 3 + 2
     * n个台阶 ---> (n-1) + (n-2)
     * @param n
     */
    public static int fib(int n){
        if(n == 1 || n == 0){
            return 1;
        }else{
            //return 2 * fib(n-1);
            return fib(n-2) + fib(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fib(n);
        System.out.println("该青蛙跳上一个"+ n +"级的台阶总共有 "+ fib(n)+" 种跳法");
    }
}

