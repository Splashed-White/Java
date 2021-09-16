package Stack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-14
 * Time: 21:29
 */
public class 文件夹操作日志搜集器 {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuffer ret = new StringBuffer();
        int len = s.length();
        stack.push(s.charAt(0));
        for(int i = 1; i < len; i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty()){
                char top = stack.peek();
                //ASCII码 A + 32 = a
                if(ch + 32 == top || ch - 32 == top){
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
