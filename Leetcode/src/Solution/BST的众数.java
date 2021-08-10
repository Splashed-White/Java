package Solution;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-10
 * Time: 15:30
 */
public class BST的众数 {
    List<Integer> ret = new ArrayList<>();
    //数组添加需要下标，所以采用集合添加元素更合适
    public List<Integer> inorder(TreeNode root){
        //中序遍历BST，返回升序数组，重复元素一定是连续的
        if(root == null) return ret;
        inorder(root.left);
        ret.add(root.val);
        inorder(root.right);
        return ret;
    }
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ret = inorder(root);
        int i = 0;
        int current = 0; //指向当前元素
        int count = 1; //当前元素的频率
        int max = 0; //元素的最大频率
        while(i < ret.size()-1){
            current = ret.get(i);
            if(current == ret.get(i+1)){
                count++;
                i++;
            }
            else{
                if(count == max){
                    list.add(current);
                    max = count;
                }else if(count > max){
                    list.clear();
                    list.add(current);
                    max = count;
                }
                count = 1;
                i++;
            }
        }//while
        if(count > max){
            list.clear();
            list.add(ret.get(i));
        }else if(count == max){
            list.add(ret.get(i));
        }
        //集合转数组,统一返回类型
        int[] alist = new int[list.size()];
        for(i = 0; i < list.size(); i++)
            alist[i] = list.get(i);
        return alist;
    }
}
