package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-27
 * Time: 10:07
 */

import javax.print.attribute.standard.Finishings;

/**
 * 法一：递归公式
 */
//public class 斐波那契数列 {
//    public int Fibonacci(int n) {
//        if(n == 1 || n == 2){
//            return 1;
//        }
//        return Fibonacci(n-1) + Fibonacci(n-2);
//    }
//}

/**
 * 法二：迭代
 */
public class 斐波那契数列 {
    public int Fibonacci(int n) {
        int first = 1;
        int second = 1;
        int third = first + second;
        while(n - 2 > 0){
            first = second;
            second = third;
            third = first + second;
            n--;
        }
        return second;
    }
}