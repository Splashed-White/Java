import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:二叉树的遍历
 * User: TL
 * Date: 2021-07-20
 * Time: 14:17
 */
public class Traversal {
    // 前序遍历 - 递归
    void preOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // 中序遍历 - 递归
    void inOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    // 后序遍历 - 递归
    void postOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }
    // 前序遍历 - 非递归
    void preOrderTraversalNor(TreeNode root){
        System.out.print("前序遍历- 非递归: ");
        if(root == null)  return;
        Stack<TreeNode>stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            cur = top.right;
        }//while
        //System.out.println();
    }
    // 中序遍历 - 非递归
    void inOrderTraversalNor(TreeNode root){
        System.out.print("中序遍历- 非递归: ");
        if(root == null)  return;
        Stack<TreeNode>stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            System.out.print(top.val + " ");
            cur = top.right;
        }//while
        //System.out.println();
    }
    // 后序遍历 - 非递归
    void postOrderTraversalNor(TreeNode root) {
        System.out.print("后序遍历- 非递归: ");
        if(root == null) return;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;//用来指定 上一个被打印的元素

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
           //当cur一直往左走时会遇到空，此时不能出栈顶元素，因为栈顶元素右子树还没有执行
            cur = stack.peek();
            if (cur.right == null || cur.right == pre) {
                TreeNode popNode = stack.pop();
                System.out.print(popNode.val + " ");
                pre = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
        //System.out.println();
    }

    //层序遍历
    void levelOrderTraversal(TreeNode root){
        System.out.println("层序遍历： ");
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode top = queue.poll();
            System.out.print(top.val + "");
            if(top.left != null){
                queue.offer(top.left);
            }
            if(top.right != null){
                queue.offer(top.right);
            }
        }
    }
}

