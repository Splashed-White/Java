package Stack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-29
 * Time: 17:40
 */
public class 栈的压入弹出序列 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        // 定义i j 变量遍历两个数组
        //pushA数组下标i元素入栈
        //读取栈顶元素与popA数组下标j元素比较，相同pop,不相同继续入栈
        int j = 0;
        int len = pushA.length;
        for (int i=0;i<pushA.length;i++) {
            stack.push(pushA[i]);
            while(!stack.isEmpty() && stack.peek() == popA[j] ) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}

