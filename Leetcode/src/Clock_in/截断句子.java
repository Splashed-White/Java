package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-06
 * Time: 9:56
 */

/**
 * 使用字符串切割方法将分割的字符串放入字符串数组str中，再从中拿出k个字符串拼接到返回字符串ret中
 */
public class 截断句子 {
    public static String truncateSentence(String s, int k) {
        if(s.length() == 0) return null;
        int i = 0;
        StringBuffer ret = new StringBuffer("");
        String[] str = s.split(" ");
        for(i = 0; i < k-1; i++){
            ret.append(str[i]);
            ret.append(" ");
        }
        ret.append(str[i]);
        return ret.toString();
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String ret = truncateSentence(s,k);
        System.out.println(ret);
    }
}
