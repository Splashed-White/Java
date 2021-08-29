package Stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-29
 * Time: 0:16
 */
public class 有效的括号 {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        //1. 定义一个栈，用来存放左括号
        Stack<Character> stack = new Stack<>();
        //2. 开始遍历当前的字符串s
        for (int i = 0; i < s.length(); i++) {
            //获取当前i下标的字符
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                //右括号
                if (stack.empty()) {
                    System.out.println("2.左括号比右括号多");
                    return false;
                }
                //获取栈顶元素的括号，但是先不能出栈
                char temp = stack.peek();
                if (temp == '{' && ch == '}' || temp == '[' && ch == ']' || temp == '(' && ch == ')') {
                    System.out.println("4.匹配成功");
                    //出栈当前的左括号，说明匹配成功
                    stack.pop();
                } else {
                    System.out.println("1.左右括号不匹配");
                    return false;
                }
            }//else
        }//for
        if (!stack.empty()) {
            System.out.println("左括号比右括号多");
            return false;
        }
        return true;
    }
}
