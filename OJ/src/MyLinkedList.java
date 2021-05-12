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
     * 找到两个单链表相交的起始节点
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        //0. 分别定义一个pl和ps来指定最长和最短的链表
        //假设刚开始的时候headA最长
        ListNode pl = headA;
        ListNode ps = headB;
        //1. 分别求得两个链表的长度
        int lenA = 0;
        int lenB = 0;
        while(pl != null){
            lenA++;
            pl = pl.next;
        }
        while(ps != null){
            lenB++;
            ps = ps.next;
        }

        //2. pl指向的链表一定是最长的
        //重点：因为 为了求长度，这两个引用都是null了
        pl = headA;
        ps = headB;

        //长度差
        int len = lenA - lenB;
        if(len < 0){ //B长
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }

        //3. 让pl指向的链表走差值len步
        while(len != 0){
            pl = pl.next;
            len--;
        }

        //4. 两个链表同时走
        while(pl != ps){
            pl = pl.next;
            ps = ps.next;
        }
        //两个链表没有相交节点
        if(pl == null){
            return null;
        }
        return pl;
    }
    /**
     * 判断链表是否为回文结构
     * 快慢指针：slow 一步fast 两步， fast到最后 则slow到中间
     * @param head
     * @return
     */
    public boolean check(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //1. 找到中间节点
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //2. 翻转
        ListNode cur = slow.next;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3. head从前往后走，slow从后往前走，直到相遇即为回文结构
        //不能用fast,偶数节点情况下fast指向null
        while(head != slow){
            if(head.val != slow.val){
                return false;
            } //偶数情况
            if(head.next == slow){  //两个if不能互换
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return false;
    }

    /**
     * 删除有序链表中的重复节点
     * 当头节点不固定时，引入傀儡节点
     * @param head
     * @return
     */
    public ListNode Delete(ListNode head) {
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        ListNode cur = head;
        while(cur != null){
            if(cur.val == cur.next.val){
                while(cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
            }else{
                temp.next = cur;
                temp = temp.next;
                cur = cur.next;
            }
        }
        temp.next = null;
        return newHead.next;
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
     * newHead -> 傀儡节点
     * temp -> 用来串节点的引用
     * @return
     */
    public ListNode MergeList(ListNode head1,ListNode head2){
        ListNode newHead = new ListNode(-1);//创建一个傀儡节点,val值没有任何意义
        //傀儡节点的next值即为返回的头节点
        ListNode temp = newHead;

        //其中一个为空链表
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        //两个链表有元素
        while(head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        //判断是否有链表有空
        if(head1 != null){
            temp.next = head1;
        }else{
            temp.next = head2;
        }
        return newHead.next;
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
