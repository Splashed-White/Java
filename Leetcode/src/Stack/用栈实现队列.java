package Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-29
 * Time: 16:29
 */

import java.util.Queue;
import java.util.Stack;

/**
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 * 实现 myQueue 类: stack1作入队操作，stack2作出队操作,如果stack2是空的，将stack1中的元素全部倒入stack2中，再进行出队操作；
 */
public class 用栈实现队列 {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public void myQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        //两个栈都为空
        if(empty()) return -1;
        //若stack2为空，将stack1中的元素全部倒入stack2
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int x = stack1.pop();
                stack2.push(x);
            }
        }
        //若stack2不为空，将stack2的栈顶元素弹出
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(empty()) return -1;
        //若stack2为空，将stack1中的元素全部倒入stack2
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int x = stack1.pop();
                stack2.push(x);
            }
        }
        //若stack2不为空，将stack2的栈顶元素弹出
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}
