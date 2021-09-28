package String;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-28
 * Time: 9:23
 */
public class Excel表列序号 {
    // N进制转十进制
    public int titleToNumber(String columnTitle) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        int ret = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            stack.push(ch-'A'+1);
        }
        while(!stack.isEmpty()){
            ret += (int) (stack.pop() * Math.pow(26,j));
            j++;
        }
        return ret;
    }
}
