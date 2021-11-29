package Algorithm.回溯;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-01
 * Time: 10:59
 */

/**
 * 全排列：将问题想象成一颗多叉树，实际上是求多叉树的满足条件的某些路径
 * 1. 穷举所有的可能性
 * 2. 根据特定的条件，进行剪枝
 * 3. 排列这颗多叉树的路径
 *
 * 字典序列：对于一个字符串序列，从左向右比较，ASCII小的排在前面。
 */
public class 字符串全排列 {
    public void Swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    public boolean IsExist(ArrayList<String> result, char[] str){
        return result.contains(String.valueOf(str));
    }
    public void PermutationHelper(char[] str, int start, ArrayList<String> result){
        if(start == str.length - 1){
            if(!IsExist(result, str)){  //去重
                result.add(new String(str));
            }
            return;
        }
        for(int i = start; i < str.length; i++){
            Swap(str, start, i);
            PermutationHelper(str, start+1, result);
            Swap(str, start, i);
        }
    }
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if(str != null && str.length() > 0){
            PermutationHelper(str.toCharArray(), 0, result);
            Collections.sort(result);
        }
        return result;
    }
}
