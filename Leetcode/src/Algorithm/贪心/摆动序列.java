package Algorithm.贪心;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-18
 * Time: 11:34
 */
public class 摆动序列 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length < 2) return nums.length;
        int down=1;
        int up=1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                up=down+1;
            }else if(nums[i]<nums[i-1]){
                down=up+1;
            }
        }
        return Math.max(up,down);
    }
}
