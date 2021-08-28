/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-28
 * Time: 16:11
 */
import java.util.Arrays;

public class MyStack<T> {
    private int[] elem;//数组
    //private T[] elem;//数组
    private int top;//当前可以存放数据元素的下标-》栈顶指针

    public MyStack() {
        this.elem = new int[10];
        //this.elem = (T[])new Object[10];
    }

    /**
     * 入栈操作
     * @param item 入栈的元素
     */
    public void push(int item) {
        //1、判断当前栈是否是满的
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length); //扩容
        }
        //2、elem[top] = item  top++;
        this.elem[this.top++] = item;
    }

    public boolean isFull(){
        return this.elem.length == this.top;
    }

    /**
     * 出栈
     * @return 出栈的元素
     */
    public int pop() {
        if(empty()) {
            throw new UnsupportedOperationException("栈为空！");
        }
        int ret = this.elem[this.top-1];
        this.top--;//真正的改变了top的值
        return ret;
    }

    /**
     * 得到栈顶元素，但是不删除
     * @return
     */
    public int peek() {
        if(empty()) {
            throw new UnsupportedOperationException("栈为空！");
        }
        //this.top--;//真正的改变了top的值
        return this.elem[this.top-1];
    }
    public boolean empty(){
        return this.top == 0;
    }
}

