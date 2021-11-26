package Algorithm.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-08
 * Time: 9:19
 */
public class 电话号码的字母组合 {
    //字母与数组的映射数组
    String[] phoneString = {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //start指向digits的下标
    //i指向对应字符串abc的下标
    public void DFS(String digits,int start,StringBuilder str,List<String> result){
        //1. 退出递归条件
        if(start == digits.length()){
            result.add(str.toString());
            return;
        }
        //找到当前字符在 phone 电话号码 映射表中对应的字符串
        int phone_x = digits.charAt(start) - '0';
        String phone_s = phoneString[phone_x];
        //2. 尝试当下的每一种可能 / 剪枝
        for(int i = 0; i < phone_s.length(); i++) {
            str.append(phone_s.charAt(i));
            //3. 下一层DFS
            DFS(digits,start+1,str,result);
            //4. 回溯
            str.deleteCharAt(str.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>(); //结果集
        StringBuilder str = new StringBuilder(""); //待选结果集
        if(digits.length() == 0) return result;
        DFS(digits,0,str,result);
        return result;
    }
}
