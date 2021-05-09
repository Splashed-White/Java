/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-05-01
 * Time: 10:52
 */

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
    //使用arr为参数，创建一个链表，当前的ListNode为链表头节点
    public ListNode(int[] arr) {
        if(arr == null || arr.length ==0 ){
            throw new IllegalArgumentException("arr can not be empty");
        }
        this.val = arr[0];
        ListNode curr = this;
        for(int i=1;i<arr.length;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode curr = this;
        while (curr != null){
            res.append(curr.val + "->");
            curr = curr.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
