/**
 * Created with IntelliJ IDEA.
 * Description:双链表
 * User: TL
 * Date: 2021-05-13
 * Time: 21:38
 */
class Node{
    public int val;
    public Node pre;
    public Node next;

    public Node(int val){
        this.val = val;
    }
}
public class TestLinkedList {
    public Node head;
    public Node last;

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else{
            node.next = this.head;
            this.head.pre = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data){
        Node node  = new Node(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else{
            last.next = node;
            node.pre = last;
            last = node;
        }
    }

    public Node searchIndex(int index){
        Node cur = this.head;
        while(index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        Node node = new Node(data);
        //index合法性判断
        if(index <0 || index > size()){
            System.out.println("index位置不合法");
            return;
        }
        //头插法
        if(index == 0 ){
            addFirst(data);
            return;
        }
        //尾插法
        if(index == size() ){
            addLast(data);
            return;
        }
        Node cur = searchIndex(index);

        node.next = cur;
        cur.pre.next = node;
        node.pre = cur.pre;
        cur.pre = node;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }else{
                cur = cur.next;
            }
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        Node cur = this.head;
        while (cur != null ) {
            if (cur.val == key) {
                //说明cur所值的节点 就是要删除的节点
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.pre = null;
                } else {
                    //中间或者尾巴位置
                    cur.pre.next = cur.next;
                    if(cur.next != null){
                        cur.next.pre = cur.pre;
                        //cur.pre.next = cur.next;
                    }else{
                        //删除尾巴节点
                        //cur.pre.next = cur.next;
                        last = cur.pre;
                    }
                }
                //删完了
                return;
            } else {
                cur = cur.next;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = this.head;
        while (cur != null ) {
            if (cur.val == key) {
                //说明cur所值的节点 就是要删除的节点
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.pre = null;
                } else {
                    //中间或者尾巴位置
                    cur.pre.next = cur.next;
                    if(cur.next != null){
                        cur.next.pre = cur.pre;
                        //cur.pre.next = cur.next;
                    }else{
                        //删除尾巴节点
                        //cur.pre.next = cur.next;
                        last = cur.pre;
                    }
                }
                cur = cur.next;
            } else {
                cur = cur.next;
            }
        }
    }

    //得到单链表的长度
    public int size() {
        Node cur = head;
        int count = 0;
        while(cur != null){
            cur = cur.next;
            count++;
        }
        return count;
    }
    //打印链表
    public void display() {
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear(){
        Node cur = this.head;
        while(cur != null){
            Node curNext = cur.next;
            cur.pre = null;
            cur.next = null;
            cur = curNext;
        }
        last = null;
        head = null;
    }
}
