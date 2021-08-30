package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-30
 * Time: 16:39
 */
public class 下一个更大元素 {
    //返回nums2数组中num元素的下标
    public int ElementIndex(int[] nums2,int num){
        for (int i = 0; i < nums2.length; i++) {
            if(nums2[i] == num){
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] array = new int[len1];
        boolean flag = false;
        for (int i = 0; i < len1; i++) {
            int num = nums1[i];
            int index = ElementIndex(nums2,num);
            //此时 nums2[index] = nums1[i]
            index++;
            while (index < len2 && nums2[index] < num) {
                index++;
            }
            if (index == len2) {
                array[i] = -1;
                continue;
            }
            array[i] = nums2[index];
        }//for_i
        return array;
    }
}

