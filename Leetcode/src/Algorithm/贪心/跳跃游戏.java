package Algorithm.贪心;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-16
 * Time: 17:44
 */

/**
 * 思路：遍历数组，记录当前位置所能达到的跳跃长度，遍历中，如果新位置的下标不大于最大跳跃长度，说明该位置时可以到达的，
 * 那么计算新位置的跳跃长度[下标 + num[i]]，随时更新跳跃长度值，确保其是最大跳跃长度;
 */
public class 跳跃游戏 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int max = 0; //存放当前位置的最大跳跃长度
        int index = 0; //存放下标
        for (int i = 0; i < len; i++) {
            if(i <= max){
                //max = i + nums[i]; 超过最大长度再替换，所以需要取最大值
                max = Math.max(max, i + nums[i]);
            }
            if(max >= len-1) return true;
        }
        return false;
    }
}
