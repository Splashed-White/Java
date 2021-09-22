package Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-22
 * Time: 9:54
 */
public class 第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //如果从后往前索引与从前往后索引的查找位置相同，说明该字符未重复
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return ch;
            }
        }
        return ' ';
    }
}
