package Stack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-10
 * Time: 21:59
 */
public class 删除最外层的括号 {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuffer ret = new StringBuffer();
        int start = 0,end = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else if(ch ==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }//if
            if(stack.isEmpty()){ //如果栈空了的话，就说明它是一个完整单位，就删除两侧的括号
                end = i;
                ret.append(s.substring(start + 1,end));
                end++;
                start = end;
            }
        }//for
        return ret.toString();
    }
}
