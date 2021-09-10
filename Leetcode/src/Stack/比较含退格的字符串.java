package Stack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-10
 * Time: 14:34
 */
public class 比较含退格的字符串 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        char[] str_s = s.toCharArray();
        char[] str_t = t.toCharArray();
        for (int i = 0; i < str_s.length; i++) {
            if(str_s[i] != '#'){
                s1.push(str_s[i]);
            }
            else if(!s1.isEmpty()){
                s1.pop();
            }
        }
        for (int i = 0; i < str_t.length; i++) {
            if(str_t[i] != '#'){
                s2.push(str_t[i]);
            }
            else if(!s2.isEmpty()){
                s2.pop();
            }
        }
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop() != s2.pop()){
                return false;
            }
        }
        if(s1.isEmpty() && s2.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
