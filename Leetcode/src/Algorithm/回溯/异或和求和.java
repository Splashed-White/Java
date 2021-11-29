package Algorithm.回溯;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-03
 * Time: 9:09
 */

//一个数组的 异或总和 定义为数组中所有元素按位 XOR 的结果
    //回溯
public class 异或和求和 {
    public int total = 0;
    public void DFS(int[] nums, int start,int sum){
        total += sum;
        for(int i = start; i < nums.length; i++){
            DFS(nums, i+1,nums[i]^sum);
        }
    }
    public int subsetXORSum(int[] nums) {
        if(nums.length == 0)  return 0;
        DFS(nums,0,0);
        return total;
    }
}