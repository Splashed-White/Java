package Algorithm.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-08
 * Time: 10:41
 */

public class 组合总和 {
    //只能选一个数固定往下走
    public void DFS(int[] candidates,int target,int start,List<Integer> list,List<List<Integer>> result){
        //1. 递归退出条件
        if(start == candidates.length){
            return;
        }
        list.add(candidates[start]);
        target = target - candidates[start];
        if(target < 0) return;
        if(target == 0){
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = start; i < candidates.length; i++){
            DFS(candidates,target,i,list,result);
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>(); //结果集
        List<Integer> list = new ArrayList<>(); //待选结果集
        if(candidates.length == 0) return result;
        for(int i = 0 ;i < candidates.length; i++){
            list.clear();
            DFS(candidates,target,i,list,result);
        }
        return result;
    }
}