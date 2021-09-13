package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-13
 * Time: 11:21
 */
public class 用栈操作构建数组 {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack = new Stack<>();
        List<String> list = new ArrayList<>();
        int len = target.length;
        int j = 0;
        for(int i = 1; i <= n; i++){ //list[1,2,3...]
            if(j < len){ //list
                if(i == target[j]){
                    stack.push(i);
                    list.add("Push");
                    j++;
                }else{
                    stack.push(i);
                    list.add("Push");
                    stack.pop();
                    list.add("Pop");
                }
            }
        }//fori
        return list;
    }
}
