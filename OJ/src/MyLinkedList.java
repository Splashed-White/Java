import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-05-01
 * Time: 10:14
 */

public class MyLinkedList {
    /**
     * 找到两个链表相交的起始节点
     * @param head1
     * @return
     */
//    public ListNode GetInter(ListNode head1,ListNode head2){
//
//    }
    /**
     * 判断链表是否为回文结构
     * @param head
     * @return
     */
    public boolean check(ListNode head) {
        int count = size(head) / 2;
        ListNode cur = head;
        while (count != 0) {
            cur = cur.next;
            count--;
        }
        ListNode mid = cur;
        ListNode pre = null;
        while (mid != null) {
            ListNode temp = mid.next;
            mid.next = pre;
            pre = mid;
            mid = temp;  //pre
        }
        while(head!=null){
            if(head.val!=pre.val) return false;
            head = head.next;
            pre = pre.next;
        }
        return true;
    }

    /** ❌
     * 删除有序链表中的重复节点
     * @param head
     * @return
     */
    public ListNode Delete(ListNode head)
    {
        if(head == null || head.next == null){
            return head;
        }
        ListNode del = new ListNode(-1);
        del.next = head;
        ListNode pre = del;
        ListNode cur = del.next;
        while(cur != null){
            if(cur.next!=null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                pre.next = cur.next;
            }else{
                pre = pre.next;
            }
            cur = cur.next;
        }
        return del.next;
    }


    /**
     * 给一定值x，编写一段代码将所有小于x的结点排在其余结点之前，且不能改变原来的数据顺序
     * @param head
     * @return
     */
    public ListNode Partition(ListNode head,int x){
        if (head == null || head.next == null) return head;

        ListNode minHead = new ListNode(-1);
        ListNode maxHead = new ListNode(-1);
        ListNode min = minHead, max = maxHead;
        for (ListNode curNode = head; curNode != null; curNode = curNode.next) {
            if (curNode.val < x) {
                min.next = curNode;
                min = min.next;
            } else {
                max.next = curNode;
                max = curNode;
            }
        }
        max.next = null;
        min.next =maxHead.next;

        return minHead.next;
    }

    /**
     * 合并两个有序链表
     * @param head1
     * @param head2
     * @return
     */
    public ListNode MergeList(ListNode head1,ListNode head2){
        ListNode cur = new ListNode(-1);//创建一个头指针
        ListNode pre1 = head1;
        ListNode pre2 = head2;
        ListNode merge = cur;

        //其中一个为空链表
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        while(pre1 != null && pre2 != null) {
            if (pre1.val <= pre2.val) {
                cur.next = pre1;
                pre1 = pre1.next;
            } else {
                cur.next = pre2;
                pre2 = pre2.next;
            }
            cur = cur.next;
        }
        if(pre1 != null){
            cur.next = pre1;
        }else{
            cur.next = pre2;
        }
        return merge.next;
    }

    /**
     * 链表倒数第k个结点
     * @param head
     * @return
     */
    public ListNode FindK1(ListNode head,int k){
        int len = size(head);
        //合法判断
        if(k < 0 || k > len){
            return null;
        }
        ListNode cur = head;
        int count = len - k;
        while(count != 0){
            cur = cur.next;
            count--;
        }
        cur.next = null;
        return cur;
    }

    public ListNode FindK2(ListNode head,int k){
        if(k <= 0 || head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        // fast先走 k-1 步
        while(k - 1 != 0){
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else{
                return null;
            }
        }
        //一人一步走
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = null;
        return slow;
    }

    /**
     * 链表的中间节点
     * 1. 链表长度
     * @param head
     * @return
     */
    public int middleNode(ListNode head){
        ListNode cur = head;
        int len = size(head);
        int count = len / 2;
        while(count > 0){
            cur = cur.next;
            count--;
        }
        return cur.val;
    }

    /**
     * 链表的中间节点
     * 2. 快慢指针
     * fast 走完，slow 刚好走到中间
     * 偶数节点 fast.null == null
     * 奇数节点 fast == null
     * @param head
     * @return
     */
    public int middleNode2(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }



    /**
     * 反转链表
     * 1. 头插法
     * cur -> 代表当前需要反转的节点的引用
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode cur = head;
        ListNode curNext = cur.next;
        cur.next = null;
        cur = curNext;
        while(cur != null) {
            //头插
            curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }
    /**
     * 反转链表
     * 2. 多个引用
     * cur -> 代表当前需要反转的节点的引用
     * pre -> 指向cur的前驱
     * curNext -> 记录修改的下一个节点
     * @param head
     * @return
     */
    public ListNode ReverseList2(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return pre;
    }


    /**
     * 移除链表元素
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null){
            if(pre.next.val == val){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        if(head.val == val){
            head = head.next;
        }
        return head;
    }


    //求链表长度
    public int size(ListNode head){
        int count = 0;
        ListNode cur = head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
}
