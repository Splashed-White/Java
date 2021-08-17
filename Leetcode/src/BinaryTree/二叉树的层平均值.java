package BinaryTree;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-15
 * Time: 23:14
 */
public class 二叉树的层平均值 {
    List<Double> ret = new ArrayList<>();
    public void preorder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return;
        queue.offer(root);
        while(!queue.isEmpty()){
            double sum  = 0;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode p = queue.poll();
                sum += (double)p.val;
                if(p.left != null) {
                    queue.offer(p.left);
                }
                if(p.right != null) {
                    queue.offer(p.right);
                }
            }
            ret.add(sum / len);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        preorder(root);
        return ret;
    }
}
