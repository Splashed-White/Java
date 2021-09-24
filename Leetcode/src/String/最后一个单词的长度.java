package String;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-24
 * Time: 9:47
 */
public class 最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        String[] ret = s.split(" ") ; // 按照空格拆分
        String str = ret[ret.length-1];
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
        }
        return count;
    }
}
