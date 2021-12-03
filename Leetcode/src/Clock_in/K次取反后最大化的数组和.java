package Clock_in;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-03
 * Time: 9:23
 */

/**
 * 法一：回溯 但是过长的 nums 数组会导致结果超出时间限制，不能AC
 */
/*public class K次取反后最大化的数组和 {
    public static void DFS(int[] nums,int start,int k,List<Integer> list,List<List<Integer>> result){
        if(k == 0){
            result.add(new ArrayList(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //nums[i] = -nums[i];
            list.set(i,-list.get(i));
            DFS(nums,i,k-1,list,result);
            //nums[i] = -nums[i];
            list.set(i,-list.get(i));
        }
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        if(nums.length == 0) return 0;
        int sum = 0,ret = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        DFS(nums,0,k,list,result);

        //System.out.println(result);
        //[[4, -2, 3], [-4, 2, 3], [-4, -2, -3], [-4, 2, 3], [4, -2, 3], [4, 2, -3], [-4, -2, -3], [4, 2, -3], [4, -2, 3]]
        for (int i = 0; i < result.size(); i++) {
            List<Integer> l = result.get(i);
            sum = 0;
            for (int j = 0; j < result.get(i).size(); j++) {
                sum += result.get(i).get(j);
            }
            ret = Math.max(sum,ret);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,3};
        int k = 1;
        int ret = largestSumAfterKNegations(nums,k);
        System.out.println(ret); //9
    }
}*/

/**
 * 法二：每次取当前数组中最小的数进行改值
 */
public class K次取反后最大化的数组和 {
    public static int findmin(int[] nums){
        int min = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
                index = i;
            }
        }
        return index;
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        if(nums.length == 0) return 0;
        int sum = 0;
        while(k!=0){
            int index = findmin(nums);
            nums[index] = -nums[index];
            k--;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2,-3,-1,5,-4};
        int k = 2;
        int ret = largestSumAfterKNegations(nums,k);
        System.out.println(ret); //13
    }
}












