package Solution;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-05
 * Time: 15:30
 */
public class 所有路径 {
    List<String> list = new ArrayList<>();
    public void preorder(TreeNode root,String str){
        if(root == null) return;
        str += String.valueOf(root.val); //基本数据类型转化为String类型，构建str
        //叶子节点,表示已经找到一条完整路径
        if(root.left == null && root.right == null){
            list.add(str);
        }else{
            //非叶子节点,继续构建str
            str = str + "->";
            preorder(root.left,str);
            preorder(root.right,str);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        String str = "";
        preorder(root,str);
        return list;
    }
}
