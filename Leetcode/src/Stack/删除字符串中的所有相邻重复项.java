package Stack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-12
 * Time: 10:18
 */
public class 删除字符串中的所有相邻重复项 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuffer ret = new StringBuffer();
        int len = s.length();
        stack.push(s.charAt(0));
        for(int i = 1; i < len; i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty()){
                if(stack.peek() == ch){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }//for
        while(!stack.isEmpty()){
            ret.append(stack.pop());
        }
        ret.reverse(); //逆序
        return ret.toString();
    }
}
