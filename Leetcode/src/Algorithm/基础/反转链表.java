package Algorithm.基础;

import Node.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-28
 * Time: 9:32
 */

/**
 * 法一：头插法
 */
//public class 反转链表 {
//    public ListNode ReverseList(ListNode head) {
//        if(head == null) return null;
//        if(head.next == null) return head;
//        ListNode new_head = null;
//        ListNode p = new_head;
//        ListNode cur = head;
//        ListNode curNext = cur.next;
//        while(curNext != null){
//            cur.next = p;
//            p = cur;
//            cur = curNext;
//            curNext = curNext.next;
//        }
//        cur.next = p;
//        p = cur;
//        return p;
//    }
//}

/**
 * 法二：三指针法
 * 定义三个指针，整体右移，边移动，边翻转，保证不会断链
 */
public class 反转链表 {
    public ListNode ReverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode third = head.next.next;
        first.next = null;
        while(third != null){
            second.next = first;
            first = second;
            second = third;
            third = third.next;
        }
        second.next = first;
        first = second;
        return first;
    }
}