package Algorithm.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-10
 * Time: 8:44
 */
public class 全排列 {
    public void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public void arraylist(int[] nums, List<Integer> list){
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
    }
    public boolean isRepeat(List<List<Integer>> result,List<Integer> list){
        String s = result.toString();
        String l = list.toString();
        return s.contains(l);
    }
    public void DFS(int[] nums,int start,List<Integer> list,List<List<Integer>> result){
        if(start == nums.length-1){
            if(!isRepeat(result,list))
                result.add(new ArrayList<Integer>(list));
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums,i,start);
            list.clear();
            arraylist(nums,list);
            DFS(nums,start+1,list,result);
            swap(nums,i,start);

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0) return result;
        if(nums.length == 1) {
            list.add(nums[0]);
            result.add(list);
            return result;
        }
        DFS(nums,0,list,result);
        return result;
    }
}
