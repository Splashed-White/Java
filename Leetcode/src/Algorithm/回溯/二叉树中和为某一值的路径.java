package Algorithm.回溯;

import Node.TreeNode;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-01
 * Time: 9:01
 */

/**
 * 回溯算法：基于二叉树或多叉树的穷举，在穷举的过程中进行吉剪枝
 */

public class 二叉树中和为某一值的路径 {
    public void DFS(TreeNode root, int expectNumber,ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
        if(root == null) return;
        //1. 添加值到待选结果中
        list.add(root.val);
        //2. 判定现有结果是否满足条件,若满足则加入结果集中
        expectNumber -= root.val;
        if(expectNumber == 0 && root.left == null && root.right == null){ //叶子节点 + 目标值相等 ==> 符合条件
            //result.add(list); //浅拷贝
            result.add(new ArrayList<Integer>(list)); //深拷贝
        }
        //3. 深度优先遍历DFS
        DFS(root.left,expectNumber,result,list);
        DFS(root.right,expectNumber,result,list);
        //4. 回溯
        list.remove(list.size()-1);
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int expectNumber) {
        //结果集
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null) return result;
        //待选结果
        //可能满足条件，也可能不满足条件;待选结果集经过筛选得到最终的结果集
        ArrayList<Integer> list = new ArrayList<>();
        DFS(root,expectNumber,result,list);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); //[1, 2, 3]

        /**
         * 浅拷贝中,当添加一个list后,如果list改变,result值也会随之发生变化，尤其注意之前已经存进去的lsit会变;
         */
        result.add(list);  //浅拷贝
        System.out.println(result); //[[1, 2, 3]]
        list.add(4);
        result.add(list);
        System.out.println(result); //[[1, 2, 3, 4], [1, 2, 3, 4]]

        //清空列表
        list.clear();
        result.clear();
        System.out.println(list);
        System.out.println(result);

        /**
         * 深拷贝中,当添加一个list后,如果list改变,result之前存储的值不会发生变化;
         */
        result.add(new ArrayList<Integer>(list));  //深拷贝
        System.out.println(result); //[[]]
        list.add(4);
        result.add(list);
        System.out.println(result); //[[], [4]]
    }
}
