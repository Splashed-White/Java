package Algorithm.基础;

import Node.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-28
 * Time: 9:06
 */

/**
 * 1.遍历整个链表，计数器记录
 */
//public class 链表中倒数第K个节点 {
//    public int len(ListNode head){
//        if(head == null) return 0;
//        ListNode cur = head;
//        int len = 0;
//        while(cur != null){
//            len++;
//            cur = cur.next;
//        }
//        return len;
//    }
//    public ListNode FindKthToTail(ListNode head,int k) {
//        if(k > len(head)) return null;
//        int count = len(head) - k;
//        ListNode cur = head;
//        while(count > 0){
//            cur = cur.next;
//            count--;
//        }
//        return cur;
//    }
//}

/**
 * 2.快慢指针
 * fast 指针比 slow 指针先走 k-1 步
 * 遍历时两指针都一次走一步
 * 直到 fast.next == null 时, slow 所指的节点即为所求
 */
public class 链表中倒数第K个节点 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k <= 0 || head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        //fast 指针先走 k-1 步
//        while(k-1 > 0){
//            fast = fast.next;
//            k--;
//        }//while
        while(k - 1 != 0){
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else{
                //只有一个节点，k>1
                return null;
            }
        }
        while(fast.next != null){
            slow = slow.next;
            fast= fast.next;
        }
        return slow;
    }
}