package Stack;

import Node.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-09
 * Time: 8:57
 */
public class N叉树的后序遍历 {
    List<Integer> list = new ArrayList<>();
    public void helper(Node root){
        if(root == null) return;
        for(Node child:root.children){
            helper(child);
        }
        list.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        helper(root);
        return list;
    }
}
