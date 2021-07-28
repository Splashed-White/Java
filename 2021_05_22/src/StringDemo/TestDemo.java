package StringDemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:字符串：不是以\0结尾
 * User: TL
 * Date: 2021-07-12
 * Time: 16:03
 */
public class TestDemo {
    /**
     * 字节与字符串转换
     * @param args
     * @throws UnsupportedEncodingException
     * @throws UnsupportedEncodingException
     */
    public static void main(String[] args) throws UnsupportedEncodingException, UnsupportedEncodingException {
        /*byte[] bytes = {97,98,99,100};
        String str = new String(bytes,1,3);
        System.out.println(str);*/


      /*  String str2 = "abcd";
        byte[] bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes1));*/

        String str2 = "高博";
        byte[] bytes1 = str2.getBytes("utf-8");
        System.out.println(Arrays.toString(bytes1));
    }

    public static boolean isNumber3(String str) {
        for (int i = 0;i < str.length();i++) {
            char ch = str.charAt(i);
            if(ch < '0' ||  ch >'9') {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断所有字符是否是数字字符
     * @param str
     * @return
     */
    public static boolean isNumber1(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
    public static boolean isNumber2(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] < '0' || ch[i] > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main9(String[] args) {
        String str = "1a234567";
        boolean n1 = isNumber1(str);
        boolean n2 = isNumber2(str);
        System.out.println(n1);
        System.out.println(n2);
    }
    /**
     * 字符和字符串转换
     * @param args
     */
    public static void main8(String[] args) {
        //1.将字符数组中的全部内容变为字符串
        char[] ch = {'a','b','c','d','e','f'};
        String str1 = new String(ch);
        System.out.println(str1); //abc

        //2.将部分字符数组中的内容变为字符串
        String str2 = new String(ch,1,3);//count 不能过大
        System.out.println(str2); //bcd

        //3.取得指定索引位置的字符
        char c = str1.charAt(1);
        System.out.println(c); //b

        //4.将字符串变为字符数组返回
        char[] s = str1.toCharArray();
        System.out.println(Arrays.toString(s)); //[a, b, c, d, e, f]
    }
    /*
    * 低效，因为每一次拼接都会产生一个临时的对象value
    * */
    public static void main7(String[] args) {
        String str = "hello" ;
        for(int x = 0; x < 1000; x++) {
            str += x ;
        }
        System.out.println(str);
    }
    /**
     * 字符串不可变
     * @param args
     */
    public static void main6(String[] args) {
        String str = "hello" ;
        str = str + " world" ;
        str += "!!!" ;
        System.out.println(str); //hello world!!!
    }
    /**
     * intern()：手动入池，把常量池中的地址直接给str1
     * @param args
     */
    public static void main5(String[] args) {
        String str = "hello"; //存的是常量池里 的地址
        String str1 = new String("hello").intern();//存的是堆里 的地址
        System.out.println(str == str1);  //true
        //此时str和str1都指向常量池中的”hello“
    }
    /**
     * 修改str1,str2不会改变
     * 分析内存
     * @param args
     */
    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        System.out.println(str1); //hello
        System.out.println(str2); //hello
        System.out.println("============");
        str1 = "bit";
        System.out.println(str1); //bit
        System.out.println(str2); //hello
    }
    /**
     * 字符串常量池
     * 1. new 出来的对象都放在堆上。直接赋值方式创建的字符串存在字符串常量池种，所以这种情况一定不相等;
     * 2. 拼接字符串：如果两者都是字符串，那么拼接起来的字符串与原字符串变量为相同变量，公用一个地址;
     * 如果其一为变量，那么拼接时会new新的对象放在堆上，此时不等;
     * 如果其一是new的对象，此时也不等;
     * @param args
     */
    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "he"+"llo";//编译的时候这个地方就相当于String str3 = "hello"

        String str4 = "he";
        String str5 = "llo";
        String str6 = str4 + str5;
        //str4和str5运行时会new String(),存在堆上

        String str7 = "he"+ new String("llo");

        System.out.println(str1 == str2); //false
        System.out.println(str1 == str3); //true
        System.out.println(str1 == str6); //false
        System.out.println(str1 == str7); //false
    }
    /**
     * 字符串比较equals()
     * @param args
     */
    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        //String引用类型，==比较的是str1和str2的地址
        System.out.println(str1 == str2); //false
        //eauals()比较字符串的内容
        System.out.println(str1.equals(str2)); //true

        String s1 = new String("hello");
        System.out.println(s1.equals("hello"));
        System.out.println("hello".equals(s1));
        String s2 = null;
        System.out.println(s2.equals("hello")); //此时会发生空指针异常 null.**
        System.out.println("hello".equals(s2)); //所以这种写法更好

    }
    /**
     * 创建字符串
     * @param args
     */
    public static void main1(String[] args) {
        // 方式一
        String str = "Hello Bit";
        // 方式二
        String str2 = new String("Hello Bit");
        // 方式三
        char[] array = {'a', 'b', 'c'};
        String str3 = new String(array);
    }
}
