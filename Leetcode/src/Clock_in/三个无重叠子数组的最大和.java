package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-08
 * Time: 15:18
 */

/**
 * 滑动窗口
 */
public class 三个无重叠子数组的最大和 {
    public static int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int[] ret = new int[3];
        int len = nums.length;
        int sum1 = 0,sum2 = 0,sum3 = 0; //当前窗口下的和
        int maxSum1 = 0,maxSum12 = 0,maxTotal = 0; //每个窗口的最大和
        int index1 = 0,index2 = 0,index3 = 0; //当前窗口的起始下标index1 sum1的下标 index2 更新后sum1的下标 index3 更新后素sum2的下标
        //从第三个窗口开始遍历
        //窗口1：nums[i - k * 2];
        //窗口2：nums[i - k];
        //窗口3：nums[i];
        for (int i = k * 2; i < len; i++){
            sum1 += nums[i - k * 2];
            sum2 += nums[i - k];
            sum3 += nums[i];
            //一个窗口内的k个元素已经全部累加完
            if(i >= (3 * k -1)){ //[2k,3k-1] = k个区间长度
                if(sum1 > maxSum1){  //不能改>=  结果是[1,3,5]
                    maxSum1 = sum1;
                    index1 = i - (3 * k - 1);
                }
                if(sum2 + maxSum1 > maxSum12){
                    maxSum12 = sum2 + maxSum1;
                    index2 = index1;
                    index3 = i - (2 * k - 1);
                }
                if(sum3 + maxSum12 > maxTotal){
                    maxTotal = sum3 + maxSum12;
                    ret[0] = index2;
                    ret[1] = index3;
                    ret[2] = i - (k - 1);
                }
                sum1 -= nums[i - k*3 + 1];
                sum2 -= nums[i - k*2 + 1];
                sum3 -= nums[i - k + 1];
            }
        }//for
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,6,7,5,1};
        int[] ret = maxSumOfThreeSubarrays(nums,2);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i] + " ");
        }
    }
}
