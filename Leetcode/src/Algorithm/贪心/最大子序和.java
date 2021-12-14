package Algorithm.贪心;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-18
 * Time: 11:35
 */
public class 最大子序和 {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int result = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            count += nums[i];
            //  [-2, 1,-3,4,-1,2,1,-5,4]
            result = Math.max(result, count); // 取区间累计的最大值（相当于不断确定最大子序终止位置）
            if (count <= 0){
                count = 0; // 相当于重置最大子序起始位置，因为遇到负数一定是拉低总和
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ret = maxSubArray(nums);
        System.out.println(ret);
    }
}