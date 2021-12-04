package Algorithm.贪心;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-16
 * Time: 16:44
 */

/**
 * 思路：定义一个变量 balance, 遍历字符串S, 遇到R+1,遇到L-1,每当balance = 0 时计数器 count++,count即为所求
 */
public class 分割平衡字符串 {
    public int balancedStringSplit(String s) {
        if(s.length() == 0) return 0;
        int balance = 0,count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'R'){
                balance++;
            }else if(ch == 'L'){
                balance--;
            }
            if(balance == 0)
                count++;
        }
        return count;
    }
}
