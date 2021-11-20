/**
 * Created with IntelliJ IDEA.
 * Description: 链表
 * User: TL
 * Date: 2021-04-27
 * Time: 18:54
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        //myLinkedList.createList();

        //头插法
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.display();  //3 2 1

        //尾插法
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.display();   //3 2 1 4 5 6

        myLinkedList.addIndex(0,188);
        myLinkedList.display();

        boolean flag = myLinkedList.contains(78);
        System.out.println(flag);


        //单链表长度
        int count = myLinkedList.size();
        System.out.println(count);
    }
}
