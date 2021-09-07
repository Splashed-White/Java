package Stack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-07
 * Time: 10:46
 */
public class 棒球比赛 {
    public int calPoints(String[] ops) {
        Stack<Integer> stcak = new Stack<>();
        int top = 0,temp = 0,sum = 0;
        for (int i = 0; i < ops.length; i++) {
            //if(Integer.ops[i].charAt(0))
            switch(ops[i]) {
                case "+":
                    top = stcak.pop();
                    temp = top + stcak.peek();
                    stcak.push(top);
                    stcak.push(temp);
                    break;
                case "C":
                    //前一次得分无效
                    stcak.pop();
                    break;
                case "D":
                    //本次得分为前一次的两倍
                    temp = stcak.peek() * 2;
                    stcak.push(temp);
                    break;
                default:
                    // 数字
                    stcak.push(Integer.parseInt(ops[i])); //Integer.parseInt()是把()里的内容转换成整数
                    break;
                    //sum += Integer.parseInt(ops[i]);
            }//switch
        }//for
        while(!stcak.isEmpty()){
            sum += stcak.pop();
        }
        return sum;
    }
}
