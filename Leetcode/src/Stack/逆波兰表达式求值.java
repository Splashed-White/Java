package Stack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-29
 * Time: 23:40
 */
public class 逆波兰表达式求值 {
    public int evalRPN(String[] tokens) {
        if(tokens == null) return -1;
        Stack<Integer> stack = new Stack<>();
        int len = tokens.length;
        for (int i = 0; i < len; i++) {
            //数字
            if(isNumber(tokens[i])){
                //Integer.parseInt(),括号中转化为Integer类型
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                //运算符,出栈两个元素作为当前运算符的两个运算数
                int num2 = stack.pop();
                int num1 = stack.pop();
                String s = tokens[i];
                switch(s){
                    case "-":
                        stack.push(num1-num2);
                        break;
                    case "+":
                        stack.push(num1+num2);
                        break;
                    case "/":
                        stack.push(num1/num2);
                        break;
                    case "*":
                        stack.push(num1*num2);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public boolean isNumber(String token){
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }
}