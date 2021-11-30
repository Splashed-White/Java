package Algorithm.基础;

import Node.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-28
 * Time: 22:22
 */
public class 删除链表重复节点 {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null) return null;
        ListNode new_head = new ListNode(-1);
        ListNode p = new_head;
        ListNode slow = pHead, fast = slow.next;
        while(fast != null){
            if(slow.val != fast.val){
                p.next = slow;
                p = p.next;
                p.next = null;
                slow = fast;
                fast = fast.next;
            }else{
                while(fast != null && slow.val == fast.val){
                    fast = fast.next;
                }
                if(fast != null){
                    slow = fast;
                    fast = fast.next;
                }else{
                    slow = null;
                }
            }//else
        }//while
        p.next = slow;
        return new_head.next;
    }
}
