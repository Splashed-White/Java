package 装拆箱;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-16
 * Time: 15:16
 */
public class TestDemo {

    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b);
    }

    public static void main2(String[] args) {
        Integer a = 10;
        int i = a;//拆包
        double dd = a;
        int i2 = a.intValue();
        double d = a.doubleValue();
        byte b = a.byteValue();
    }
    public static void main1(String[] args) {
        int i = 10;
        Integer a = i;
        Integer a2 = Integer.valueOf(i);
        System.out.println(a2); //10
    }
}
