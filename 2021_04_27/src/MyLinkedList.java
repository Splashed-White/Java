/**
 * Created with IntelliJ IDEA.
 * Description:
 * Java集合当中 LinkedList 底层是一个双向链表，这里只是用了一下名字
 * User: TL
 * Date: 2021-04-27
 * Time: 19:20
 */
class ListNode {
    public int val;//值
    public ListNode next;//存储下一个节点的地址  也就是说 这个是一个引用

    public ListNode() {

    }
    public ListNode(int val) {
        this.val = val;
    }
}


public class MyLinkedList {  //无头节点 单向 非循环 链表


    public ListNode head;//标识整个链表的头


    //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    //头插法
    public void addFirst(int data) {
        // 把data封装成节点类型
        ListNode node = new ListNode(data);
        // 无需区分是否是第一次插入
        // 1. 修改Noode.next
        node.next = this.head;
        // 2. 修改head
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        // 0. 空链表 ，即第一次插入的情况
        if(this.head == null){
            this.head = node;
            return;
        }
        // 1. 找尾巴
        while(cur.next != null){
            cur = cur.next;  //此时cur指向尾节点
        }
        // 2. 修改next
        cur.next = node;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {   //假设下标 0 1 2 ...
        ListNode node = new ListNode(data);

        // 1. 判断index是否合法
        if(index < 0 || index > size()){
            System.out.println("index不合法\n");
            return;
        }
        // 2. 判断Index = 0 头插法
        if(index == 0){
            addFirst(data);
            return;
        }
        // 3. 判断Index = size() 尾插法
        if(index == size()){
            addLast(data);
            return;
        }
        //4. 找到插入位置的前一个节点的地址  ,cur 走 index - 1 步
        ListNode cur = findIndexSubOne(index); //此时cur指向index - 1 节点
        node.next = cur.next;
        cur.next = node;
    }

    /**
     * 让一个引用cur从头开始 走Index - 1 步
     * @param index
     * @return
     */
    public ListNode findIndexSubOne(int index){
        ListNode cur = this.head;
        int count = 0;
        while (count != index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key) {

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){

    }
    //链表置空
    public void clear() {
        //cur表示当前需要置空的节点
        //挨个置空
        ListNode cur = this.head;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = null;
            cur = curNext;
        }
        this.head = null;

    }

    /**
     * 穷举法，最low的方式 先建造一个链表出来，让你来感受一下
     */
//    public void createList() {
//        ListNode listNode1 = new ListNode(12);//12
//        ListNode listNode2 = new ListNode(45);
//        ListNode listNode3 = new ListNode(6);
//        ListNode listNode4 = new ListNode(8);
//        ListNode listNode5 = new ListNode(5);
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        this.head = listNode1;//head引用  引用了 listNode1引用  引用的对象
//    }

   // 遍历链表
    public void display() {
        ListNode cur = this.head;  //防止头标识变化
        //不能是this.head.next != null  这样写 最后一个节点是不能被打印的
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
