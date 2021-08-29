package Test;

import java.util.Stack;
import Stack.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-29
 * Time: 0:17
 */
public class Test_stack {
    public static void main(String[] args) {
        //有效的括号
        /*String str = "()[]{}";
        有效的括号 s = new 有效的括号();
        boolean flag1 = s.isValid(str);
        System.out.println(flag1);*/

        //栈的压入弹出序列
        /*栈的压入弹出序列 s1 = new 栈的压入弹出序列();
        int [] pushA = {1,2,3};
        int [] popA = {3,1,2};
        boolean flag2 = s1.IsPopOrder(pushA,popA);
        System.out.println(flag2);*/

        //逆波兰表达式求值
        逆波兰表达式求值 s2 = new 逆波兰表达式求值();
        String[] tokens = {"4","13","5","/","+"};
        int num1 = s2.evalRPN(tokens);
        System.out.println(num1);
    }
}
