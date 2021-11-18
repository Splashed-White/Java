import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-18
 * Time: 19:56
 */

//遍历并异或
//public class 只出现一次的数字 {
//    public static int singleNumber(int[] nums) {
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum ^= nums[i];
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {2,2,1};
//        int ret = singleNumber(nums);
//        System.out.println(ret);
//    }
//}

//集合:遍历数组放入集合，如果集合中没有就放入，如果有就把原有的删掉
public class 只出现一次的数字 {
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int result = 0;
        for (int i: set) {
            result = i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int ret = singleNumber(nums);
        System.out.println(ret);
    }
}