package Stack;

import Node.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-08
 * Time: 8:30
 */
public class N叉树的前序遍历 {
    List<Integer> list = new ArrayList<>();
    public void helper(Node root){
        if(root == null) return;
        list.add(root.val);
        for(Node child:root.children){
            helper(child);
        }
    }
    public List<Integer> preorder(Node root) {
        helper(root);
        return list;
    }
}
