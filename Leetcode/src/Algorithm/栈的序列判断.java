package Algorithm;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-31
 * Time: 8:33
 */

/**
 * 模拟栈的操作过程
 * 1. 遍历入栈序列，压栈
 * 2. 只要栈不为空，查看栈顶元素是否等于出栈序列，相等就出栈，不相等继续步骤1
 */
public class 栈的序列判断 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0 ||
                pushA.length != popA.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }//for
        while (!stack.isEmpty()) {
            if (stack.peek() != popA[j]) {
                return false;
            } else {
                stack.pop();
                j++;
            }
        }//while
        return true;
    }
}
