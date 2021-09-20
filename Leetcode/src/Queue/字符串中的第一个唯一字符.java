package Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-20
 * Time: 10:06
 */
public class 字符串中的第一个唯一字符 {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //判断字符的第一个索引和最后一个索引是否相等
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return i;
            }
        }
        return -1;
    }
}
