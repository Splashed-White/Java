import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-13
 * Time: 16:05
 */
class Person {

}
//json  Gson
public class TestDemo {

    public static void main(String[] args) {
        String str = "def";
        String str2 = str.concat("gaobo"); //字符窜连接，等用于+，不入池，用的不多了解即可
        System.out.println(str2);
       /* System.out.println(str.toUpperCase());  //转大写
        System.out.println(str.toLowerCase());*/  //转小写
        /*System.out.println(str);
        System.out.println(str.trim());*/  //去除字符串左右空格
    }
    public static void main11(String[] args) {
        String str = "ababcabcdabcde";
        //[4,7)  新的对象
        System.out.println(str.substring(4,7)); //[cab) 左闭右开
    }
    public static void main10(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String ret = "";
            String str = scan.nextLine();
            String[] ss = str.split(" ");
            for(String s : ss) {
                ret += s;
            }
            System.out.println(ret);
        }
    }

    public static void main9(String[] args) {
        String str = "name=zhangsan&age=18";
        String[] strs = str.split("&");
        for (String ss : strs) {
            //System.out.println(s);  [name=zhangsan]   [age=18]
            String[] strs2 = ss.split("=");
            for (String s :strs2) {
                System.out.println(s);
            }
        }
    }

    public static void main8(String[] args) {
        String str="Java30-split#bit";
        String[] strs = str.split("-|#");
        for (String s : strs) {
            System.out.println(s);
        }
    }

    public static void main7(String[] args) {
        String str = "192\\168\\1\\1";
        String[] strs = str.split("\\\\");// \. -> .

        for (String s : strs) {
            System.out.println(s);
        }
    }

    public static void main6(String[] args) {
        String str = "192.168.1.1";
        String[] strs = str.split("\\.");// \. -> .

        for (String s : strs) {
            System.out.println(s);
        }
    }

    public static void main5(String[] args) {
        String str = "gaobo is cool";
        String[] strs = str.split(" ",5);

        for (String s : strs) {
            System.out.println(s);
        }

    }

    public static void main4(String[] args) {
        String str = "ababcabcdabcde";


        String ret = str.replaceFirst("ab","AB");

        System.out.println(ret);

        /*String ret = str.replaceAll("ab","AB");

        System.out.println(ret);

        ret = str.replace("ab","G");

        System.out.println(ret);*/



        /*boolean flg = str.endsWith("de");
        System.out.println(flg);*/
        /*boolean flg = str.startsWith("a",1);
        System.out.println(flg);*/

       /* int index2 = str.lastIndexOf("abc",8);
        System.out.println(index2);

        System.out.println("=============");
        int index = str.indexOf("abc",5);
        System.out.println(index);
        System.out.println("=============");
        boolean flg = str.contains("abc");
        System.out.println(flg);*/
    }

    public static void main3(String[] args) {
        String str = new String("hello");
        String str2 = "hello";
        String str3 = "Hello";

        System.out.println(str == str2);
        System.out.println(str2.equals(str3));//内容
        System.out.println(str2.equalsIgnoreCase(str3));//忽略大小写比较
        System.out.println(str2.compareTo(str3));
        String str4 = "高博";
        String str5 = "比特";
        System.out.println(str4.compareTo(str5));
    }

    public static void main2(String[] args) {
       /* String s = new String("1");
        String s2 = "1";
        s.intern();
        System.out.println(s == s2);
        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3 = s3.intern();
        System.out.println(s3 == s4);*//**//*
        做题  刷题  写代码
        */
        String s5 = new String("11");
        String s6 = "11";
        System.out.println(s5 == s6);
        System.out.println(s5);
    }

    public static void main1(String[] args) {
        Person person = new Person();
        System.out.println(person);
    }
}
