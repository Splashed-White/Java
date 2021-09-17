package Stack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-15
 * Time: 13:19
 */
public class 括号的最大嵌套深度 {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0; //返回栈的最大深度
        int  currentDepth = 0; //当前括号的深度
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
                currentDepth++;
                //每次操作记录当前的深度，与count相比取最大的赋值给count[最大深度]
                count = Math.max(currentDepth, count);
            }else if(ch == ')'){
                stack.pop();
                currentDepth--;
            }
        } //for
        return count;
    }
}
