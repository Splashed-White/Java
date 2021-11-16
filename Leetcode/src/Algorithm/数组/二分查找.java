package Algorithm.数组;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-14
 * Time: 11:06
 */
public class 二分查找 {
    public int BinarySearch(int left,int right,int[] nums,int target){
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else if(nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        if(nums.length == 0) return 0;
        int left = 0;
        int right = nums.length-1;
        int index = BinarySearch(left,right,nums,target);
        return index;
    }
}
