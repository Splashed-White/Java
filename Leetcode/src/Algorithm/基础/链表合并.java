package Algorithm.基础;

import Node.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-28
 * Time: 10:35
 */

/**
 * 法一：迭代比较
 */
//public class 链表合并 {
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        if(list1 == null) return list2;
//        if(list2 == null) return list1;
//        ListNode new_head = new ListNode(0);
//        /**
//         * ListNode p = new_head;
//         * p 保存的是 new_head 的头结点，
//         * 使用 p 向后移动不会影响到 new_head 中的数据,不会造成断链
//         */
//        ListNode p = new_head;//创建一个引用类型的变量，存储listNode的头结点。
//        while (list1 != null && list2 != null){
//            if (list1.val < list2.val){
//                p.next = list1;
//                p = p.next;
//                list1= list1.next;
//            }else{
//                p .next = list2;
//                p = p.next;
//                list2= list2.next;
//            }
//            if (list1 == null) {
//                p.next = list2;
//            }
//            if (list2 == null) {
//                p.next = list1;
//            }
//        }
//        return new_head.next;
//    }
//}

/**
 * 法二：递归
 */
public class 链表合并 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val <= list2.val){
            list1.next = Merge(list1.next,list2);
            return list1;
        }else{
            list2.next = Merge(list1,list2.next);
            return list2;
        }
    }
}