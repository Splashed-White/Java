/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-30
 * Time: 14:37
 */

public class MyCircularQueue {

    private int[] elem; //数组
    private int front;// 头
    private int rear;//尾巴下标   当前可以存放元素的下标,指向当前元素的下一个元素

    public MyCircularQueue(int k) {
        //这里为什么是k+1: 题的描述指定要放k个
        this.elem = new int[k+1];
        this.rear = 0;
        this.front = 0;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        this.elem[this.rear] = value;
        this.rear = (this.rear+1)%this.elem.length;
        //this.rear = this.rear+1;
        return true;
    }
    //删除  出队
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        this.front = (this.front+1)%this.elem.length;
        return true;
    }
    //得到队头元素
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }

    //得到队尾元素  注意：当rear == 0下标的时候
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        int index = (this.rear == 0) ? this.elem.length-1 : this.rear-1;
        return this.elem[index];
    }

    public boolean isEmpty() {
        //只要他两相遇了 那么就是空的队列
        if(this.front == this.rear) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if((this.rear+1) % this.elem.length == this.front) {
            return true;
        }
        return false;
    }

}