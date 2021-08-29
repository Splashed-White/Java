package Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-29
 * Time: 15:12
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
 * 实现 myStack 类：不管是入栈还是出栈，都对那个不为空的栈(第一次指定为queue1)进行操作;
 */
public class 用队列实现栈 {

    public Queue<Integer> queue1;
    public Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public void myStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(queue1.isEmpty()){
            queue1.offer(x);
        }else if(queue2.isEmpty()){
            queue2.offer(x);
        }else{
            //两个队列都为空， 目前指定放到queue1中
            queue1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()) return -1;
        //1. 先找不为空的队列
        if(!queue1.isEmpty()){
            //2. 把queue1中前size-1个元素放到queue2中
            int size = queue1.size();
            for (int i = 0; i < size-1; i++) {
                int x = queue1.poll();
                queue2.offer(x);
            }
            //3. 把queue1中最后一个元素弹出
            return queue1.poll();
        }else{
            int size = queue2.size();
            for (int i = 0; i < size-1; i++) {
                int x = queue2.poll();
                queue1.offer(x);
            }
            return queue2.poll();
        }
    }

    /** Get the top element.
     * @return*/
    public int top() {
        if (empty()) return -1;
        if (queue1.isEmpty()) {
            int size = queue1.size();
            int x = -1;
            for (int i = 0; i < size; i++) {
                x = queue1.poll();
                queue2.offer(x);
            }
            return x;
        } else {
                int size = queue2.size();
                int x = -1;
                for (int i = 0; i < size; i++) {
                    x = queue2.poll();
                    queue1.offer(x);
                }
                return x;
        }
    }
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
