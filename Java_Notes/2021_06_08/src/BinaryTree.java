/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-08
 * Time: 23:41
 */
class TreeNode {
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}
public class BinaryTree {

    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }

    // 前序遍历
    void preOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


    // 中序遍历
    void inOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    // 遍历思路-求结点个数  前序遍历
    static int size = 0;
    void getSize1(TreeNode root) {
        if(root == null) {
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }

    // 子问题思路-求结点个数
    int getSize2(TreeNode root) {
        if(root == null){
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right)+1;
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2(TreeNode root) {
        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            return 1;
        }

        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    //K 层
    int getKLevelSize(TreeNode root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1)
                + getKLevelSize(root.right,k-1);
    }

    /**
     *
     * @param root
     * @param val
     * @return
     */
    TreeNode find(TreeNode root, char val) {
        if(root == null) return null;
        if(root.val == val) return root;

        TreeNode ret = find(root.left,val);
        if(ret != null) {
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null) {
            return ret;
        }
        return null;
    }

    // 获取二叉树的高度
    int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        //return  (getHeight(root.left) >  getHeight(root.right) ? getHeight(root.left)+1 :  getHeight(root.right)+1);
        return  (leftHeight >  rightHeight ? leftHeight+1 :  rightHeight+1);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //只要有一个不为空
        if(p == null && q != null) {
            return false;
        }
        if(p != null && q == null) {
            return false;
        }
        //走到这里 还有可能2个都为空
        if(p == null && q == null) {
            return true;
        }
        //都不为空
        if(p.val != q.val) {
            return false;
        }

        //p和q不为空  且对应的值 是相同的  那么去判断两棵树的左树和右树
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }


    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return false;

        if(isSameTree(root,subRoot)) return true;

        if(isSubtree(root.left,subRoot)) return true;

        if(isSubtree(root.right,subRoot)) return true;

        return false;
    }

    /**
     求高度的时间复杂度：O(n)
     */
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return  (leftHeight > rightHeight ? leftHeight+1 : rightHeight+1);
    }
    //时间复杂度是多少？ o(n^2)
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftHeight =  maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return
                Math.abs(leftHeight-rightHeight) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    /**
     原理 就是在求高度的同时，只要某一个子树不满足就直接结束
     从下往上的方式
     */
    public int hight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = hight(root.left);
        int rightHeight =  hight(root.right);
       /*
       只要 当前根的左树 或者右树 不满足
       leftHeight == -1 || rightHeight==-1
       就不会进入if语句
        */
        if(leftHeight >= 0 && rightHeight >= 0 && Math.abs(leftHeight-rightHeight) <=1     )  {
            return Math.max(leftHeight,rightHeight)+1;
        }else{
            return -1;
        }
    }

    public boolean isBalanced2(TreeNode root) {
        return hight(root) >= 0;
    }

}
