import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-14
 * Time: 10:44
 */
public class Test {
    /**
     * 给一个字符类型的数组chas和一个整数size，请把大小为size的左半区整体右移到右半区，右半区整体移动到左边。
     * 输入：3
     *      abcdefg
     * 输出：defgabc
     * @param str
     */
    public static String reverse(String str,int begin,int end) {
        if(str == null) return null;
        char[] chars = str.toCharArray();
        int i = begin;
        int j = end;
        while (i < j) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
        return new String(chars);
        //return String.valueOf(chars);
    }

    public static String reversSentence(String str,int n) {

        if(str == null) {
            return null;
        }
        str = reverse(str,0,n-1);
        str = reverse(str,n,str.length()-1);
        str = reverse(str,0,str.length()-1);

        return str;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        //String str = scan.nextLine();  error
        //nextLine()会吃掉回车
        String ret = reversSentence(str,n);
        System.out.println(ret);
    }
    /**
     *字符串逆置
     * eg: abcde ---> edcba
     * @param str
     * @return
     */
    public static String Reverse(String str){
        if(str == null){
            return null;
        }
        //字符串是不可变量，所以不可能在str上进行修改
        //所以可以把它整体转换成数组，进行数组逆置
        char[] ch = str.toCharArray();

        int i = 0;
        int j = str.length()-1;
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        //将字符数组再转换为字符串
        return new String(ch);
    }
    public static void main1(String[] args) {
        String str = "abcde";
        String ret = Reverse(str);
        System.out.println(ret);  //edcba
    }
}
