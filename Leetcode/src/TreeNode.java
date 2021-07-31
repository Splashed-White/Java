/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-31
 * Time: 15:15
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }

}
