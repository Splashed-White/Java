/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-14
 * Time: 14:41
 */
public class Test2 {
    /**
     * StringBuffer、StringBuilder、String 的区别
     * 1. String的内容不可修改，StringBuffer与StringBuilder的内容可以修改
     * 2. StringBuffer与StringBuilder大部分功能是相似的
     * 3. StringBuffer采用同步处理，属于线程安全操作；
     *    而StringBuilder未采用同步处理，属于线程不安全操作
     * @param args
     */

    /**
     * String->StringBuilder
     *
     * StringBuilder->String
     *
     * @param args
     */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());
    }

    public static void main6(String[] args) {
        String str = "abc";
        for (int i = 0; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            //String变为StringBuffer:
            //          利用StringBuffer的构造方法或append()方法
            sb.append(str).append(i);
            ////StringBuffer变为String:
            //          调用toString()方法
            str = sb.toString();
        }
        System.out.println(str);
    }

    public static void main5(String[] args) {
        String str = "abc";
        for (int i = 0; i < 10; i++) {
            str+=i;
        }
        System.out.println(str);
    }

    public static void main4(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("ab");

    }
    public static void main3(String[] args) {
        String str = "abc";
        String str2 = "def";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String str3 = sb.toString();
        System.out.println(str3);
    }

    public static void main2(String[] args) {
        String str = "abc";
        String str2 = "def";
        String str3 = str+str2;
        System.out.println(str3);
    }

    public static void main1(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.reverse();
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);
        String str = "abc";
        System.out.println(str);
    }

}

