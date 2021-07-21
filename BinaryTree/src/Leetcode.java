import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-21
 * Time: 1:45
 */
public class Leetcode {
    //检查两颗树是否相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q == null || p == null && q != null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    //判断是都为另一棵树的子树
    public boolean isSubTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return false;
        //判断两棵树是否相同
        if (isSameTree(p, q)) return true;
        if (isSubTree(p.left, q)) return true;
        if (isSubTree(p.right, q)) return true;
        return false;
    }

    /**
     * 给定一个二叉树，判断是否为对称二叉树（镜像）
     *
     * @param leftTree
     * @param rightTree
     * @return
     */
    public boolean isSymmetricChild(TreeNode leftTree, TreeNode rightTree) {
        if (leftTree == null && rightTree == null) return true;
        if (leftTree == null || rightTree == null) return false;
        if (leftTree.val != rightTree.val) {
            return false;
        }
        return isSymmetricChild(leftTree.left, rightTree.right) && isSymmetricChild(leftTree.right, rightTree.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricChild(root.left, root.right);
    }

    /**?
     * 判断一棵树是不是完全二叉树
     *
     * @param root
     * @return
     */
    boolean isCompleteTree(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //1.先将二叉树层序遍历存入queue中
        while(!queue.isEmpty()) {
            TreeNode top = queue.poll();
            if(top != null) {
                queue.offer(top.left);
                queue.offer(top.right);
            }else{
                break;
            }
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.peek();
            if(cur == null) {
                queue.poll();
            }else {
                return false;
            }
        }
        return true;
    }

    /**?
     * 通过先序遍历字符串 创建一棵二叉树，输出其中序遍历结果
     * 输入: abc##de#g##f###
     * 输出: c b e g d f a
     * @param str
     * @return
     */
    public static int i = 0; //由于递归，需要设置成静态变量
    public static TreeNode createTreeByString(String str){
        if(str == null) return null;
        //1. 创建一个空根节点
        TreeNode root = null;
        //2. 遍历字符串，不是#就new节点，递归左右子树；#就i++;
        if (str.charAt(i) != '#') {
            root = new TreeNode(str.charAt(i));
            i++;
            root.left = createTreeByString(str);
            root.right = createTreeByString(str);
        }else{
            i++;
        }
        return  root;
    }
    public static void inorder(TreeNode root) { //中序打印
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        String str = "abc##de#g##f###";
        TreeNode root = createTreeByString(str);
        inorder(root);
    }

    /**
     * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) {
            return root;
        }
        TreeNode leftTree = lowestCommonAncestor(root.left,p,q);
        TreeNode rightTree = lowestCommonAncestor(root.right,p,q);
        if(leftTree != null && rightTree != null) {
            return root;
        }
        //代码执行到这里，说明：一个肯定是为空的
        if(leftTree != null) {
            return leftTree;
        }
        if(rightTree != null) {
            return rightTree;
        }
        //左右都为空
        return null;//没有最近公共祖先
    }

    /**
     *二叉树搜索树转换成排序双向链表
     * @param pRootOfTree
     * @return
     */
    public TreeNode prev = null;

    public void ConvertChild(TreeNode pCur) {
        if(pCur == null) {
            return;
        }
        ConvertChild(pCur.left);
        //打印
        pCur.left = prev;
        if(prev != null) {
            prev.right = pCur;
        }
        prev = pCur;
        ConvertChild(pCur.right);
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;

        ConvertChild(pRootOfTree);

        TreeNode head = pRootOfTree;

        while(head.left != null) {
            head = head.left;
        }
        return head;
    }

    /**
     * 根据一棵树的前序遍历与中序遍历构造二叉树
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder){
    }

    /**
     * 根据一棵树的中序遍历与后序遍历构造二叉树
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder){

    }

    /**
     * 根据二叉树创建字符串
     * @param root
     * @return
     */
    public String tree2str(TreeNode root) {

    }
}
