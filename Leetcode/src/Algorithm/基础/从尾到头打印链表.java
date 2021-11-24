package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-27
 * Time: 9:16
 */
import Node.ListNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 法一.stack
 */
//public class 从尾到头打印链表 {
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        Stack<Integer> stack = new Stack<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        ListNode cur = listNode;
//        while(cur != null){
//            stack.push(cur.val);
//            cur = cur.next;
//        }
//        while(!stack.isEmpty()){
//            int temp = stack.pop();
//            list.add(temp);
//        }
//        return list;
//    }
//}

/**
 * 法二.数组逆置
 */
//public class 从尾到头打印链表 {
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ListNode cur = listNode;
//        while(cur != null){
//            list.add(cur.val);
//            cur = cur.next;
//        }
//        int i = 0;
//        int j = list.size() - 1;
//        while(i <= j){
//            Integer temp = list.get(i);
//            //set(int index, E element) 方法用于替换动态数组中指定索引的元素。
//            list.set(i,list.get(j));
//            list.set(j,temp);
//            i++;
//            j--;
//        }
//        return list;
//    }
//}

/**
 * 法三.递归
 */
public class 从尾到头打印链表 {
    public void helper(ArrayList<Integer> list, ListNode listNode){
        if(listNode == null){
            return;
        }
        helper(list,listNode.next);
        list.add(listNode.val);
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,listNode);
        return list;
    }
}