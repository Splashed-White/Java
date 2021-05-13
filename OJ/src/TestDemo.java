import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-05-01
 * Time: 10:16
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        int[] nums = {1,2,6,3,5,6};
        ListNode head = new ListNode(nums);
        System.err.println(head);

        int[] num1 = {1,2,4};
        int[] num2 = {1,3,4};
        ListNode head1 = new ListNode(num1);
        ListNode head2 = new ListNode(num2);
        System.err.println(head1);
        System.err.println(head2);
//
//        int[] num3 = {3,6,5,3,2,1,8};
//        ListNode head3 = new ListNode(num3);
//        System.err.println(head3);
//        ListNode res5 = (new MyLinkedList().Partition(head3,4));
//        System.out.println("res5 = " + res5);


//        int[] num4 = {1,1,1,3,4,4,5};
//        ListNode head4 = new ListNode(num4);
//        System.err.println(head4);
//        ListNode res6 = (new MyLinkedList().Delete(head4));
//        System.out.println("res6 = " + res6);

//        int[] num5 = {1,2,3,4,2,1};
//        ListNode head5 = new ListNode(num5);
//        System.err.println(head5);
//        boolean res7 = (new MyLinkedList().check(head5));
//        System.out.println("res7 = " + res7);

//        //单链表长度
//        int count = (new MyLinkedList().size(head));
//        System.out.println("单链表长度 = " + count);  //6
//
//        ListNode res1 = (new MyLinkedList().removeElements(head, 6));
//        System.err.println(res1);
//
//          ListNode res2 = (new MyLinkedList().ReverseList(head));
//          System.err.println(res2);
//
//        int ret = (new MyLinkedList().middleNode2(head));
//        System.out.println("中间节点val = " + ret);  //3
//
//        ListNode res3 = (new MyLinkedList().FindK2(head,2));
//        System.out.println(res3);
//
        ListNode res4 = (new MyLinkedList().MergeList(head1,head2));
        System.out.println("res4 = " + res4);

    }
}
