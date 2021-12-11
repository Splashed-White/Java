package Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-09
 * Time: 20:52
 */

/**
 * 思路：采用滑动窗口，但是如何比较切割的字符段是否和String p互为异位？
 * 开辟两个大小为26的数组，分别存储每一次窗口移动时对应字母的个数，每次移动后判断两个数组是否相等，相等即互为异位。
 */
public class 字母异位词 {
    public static boolean check(int[] arrayp, int[] temp){
        for (int i = 0; i < 26; i++) {
            if(arrayp[i] != temp[i]){
                return false;
            }
        }
        return true;
    }
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> list = new ArrayList<>();
        int len1 = s.length();
        int len2 = p.length();
        int[] arrayp = new int[26];

        //String p 存入数组 arrayp
        for (int i = 0; i < len2; i++) {
            arrayp[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len1-len2+1; i++) {
            int[] temp = new int[26];
            for (int j = i; j < i+len2; j++) {
                char ch = s.charAt(j);
                temp[ch - 'a']++;
            }//forj
            if(check(arrayp,temp)){
                list.add(i);
            }
        }//fori
        return list;
    }

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        List<Integer> list = findAnagrams(s,p);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
