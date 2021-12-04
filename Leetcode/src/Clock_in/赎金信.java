package Clock_in;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-04
 * Time: 13:23
 */

/**
 * 思路：将magazine中的字符以及对应数量存入map中
 *      遍历ransomNote，如果当前字符不在map中，return false;
 *                     如果当前字符在map中，则该字符对应的value--，如果出现value = 0，说明ransomNote中该祖父的数量比magazine多, return false；
 *                     否则 return true;
 *
 */
public class 赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(map.containsKey(ch)){
                int value = map.get(ch);
                map.put(ch,value+1);
            }else{
                map.put(ch,1);
            }
        }//for
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch)){
                int value = map.get(ch);
                if(value!= 0){
                    value--;
                    map.put(ch,value);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
