package Clock_in;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-01
 * Time: 11:06
 */
public class 连续字符 {
    //初始化当前字符连续出现次数为conut = 1
    //array[1]开始遍历，比较array[i]和array[i-1]，相同count++,否则 count 置1
    public static int maxPower(String s) {
        if(s.length() == 0) return 0;
        int count = 1;
        int ret = 1;
        char[] array = s.toCharArray();
        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i-1]){
                count++;
                ret = Math.max(ret, count);
            }else{
                count = 1;
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int ret = maxPower(s);
        System.out.println(ret);
    }
}
