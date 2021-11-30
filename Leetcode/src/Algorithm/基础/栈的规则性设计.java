package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-29
 * Time: 10:39
 */

import java.util.Stack;

/**
 * 为了满足通用，我们使用一个辅助栈，内部保存元素的个数和数据栈完全一样，不过，辅助栈内部永远保存本次入栈的数为
 * 所有数据的最小值（注意：辅助栈内部元素可能会出现“必要性”重复）
 */
public class 栈的规则性设计 {
    private Stack<Integer> data_stack = new Stack<>();
    private Stack<Integer> min_stack = new Stack<>();
    public void push(int node) {
        data_stack.push(node);
        if(min_stack.empty() || node < min_stack.peek()){
            min_stack.push(node);
        }
        else{
//!min_stack.empty() & node >=min_stack.peek()
            min_stack.push(min_stack.peek());
        }
    }
    public void pop() {
        data_stack.pop();
        min_stack.pop();
    }
    public int top() {
        return data_stack.peek();
    }
    public int min() {
        return min_stack.peek();
    }
}
