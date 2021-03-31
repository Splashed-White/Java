/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-03-30
 * Time: 18:50
 */
//Java中所有类型的字节大小和平台没有关系，所以java更容易移植
public class TestDemo1 {
    /**********************类型转换**********************************/
    public static void main(String[] args) {
        //强制类型转换：大类型给小类型的时候
        int a = 10;
        short b = (short)a;
        //隐式类型转换：
        byte c = 10;
        int d = c;

//        int a1 = 1;
//        boolean b1 = a1;  这是两个完全不同的类型，不要进行相互赋值

//        boolean f = true;
//        int c = f;    //同上
    }

    /***********************变量************************************/
    public static void main10(String[] args) {
        //局部变量在使用之前一定要初始化，否则会报错
//        int a;
//        System.out.println(a); error

        final int a = 10;
        //a = 20; // 编译出错. 提示 无法为最终变量a分配值
        //常量只能初始化一次，不能在程序运行过程中发生修改
    }
    /*********************变量的作用域*********************************/
    public static void main9(String[] args) {
        int x = 10;
        System.out.println(x); // 编译通过;
    }
    //System.out.println(x); // 编译失败, 找不到变量x

    /*********************字符串类型变量*********************************/
    public static void main8(String[] args) {
        //1. String不是基本类型，而是引用类型
        //2. 字符串中的一些特定的不太方便直接表示的字符需要进行转义

        String str1 = "abc";
        String str2 = "def";
        String str3 = str1 + str2;
        System.out.println(str3);  //abcdef

        String str = "result = ";
        int a = 10;
        int b = 20;
        String result = str + a + b;
        System.out.println(result);  //result = 1020
        //当一个 + 表达式中存在字符串的时候, 都是执行字符串拼接行为
    }

    /*********************布尔类型变量*********************************/
    public static void main7(String[] args) {
        //1. 在java中，布尔类型的值只有两个，true或者false，没有所谓的0是假，非0是真
        //2. boolean 类型有些 JVM 的实现是占 1 个字节, 有些是占 1 个比特位, 这个没有明确规定
        //3. Java 的 boolean 类型和 int 不能相互转换, 不存在 1 表示 true, 0 表示 false 这样的用法
        boolean flag1 = true;
        boolean flag2 = false;
        //boolean flag3 = 1;  //error
    }

    /*********************字节类型变量*********************************/
    public static void main6(String[] args) {
        byte value =  0;
        System.out.println(value);
        //占1个字节 对标的就是C语言中的char类型，取值范围：-128 - 127
        //byte b1 = 128; //error  赋值的时候不能给当前类型所表示的范围外

        byte b1 =  10;
        byte b2 =  20;
        //byte b3 =  b1 + b2; //error
        /*
        1.编译器再看在这行代码的时候，因为b1和b2都是变量，编译器不知道里面是多少，不知道加起来是否会超过范围，为了安全起见，报错
        2.整型提升，计算机在取数据的时候都是4个字节单位取的，为了提升速度，会将b1和b2提升为整型进行运算，两个int类型相加也是int类型，所以类型报错
         */

        byte b4 = 126;
        //byte b5 = b4 + 1;  //error 小于4个字节的时候就会整型提升来运算

        int a = 10;
        long d = 20;
        //int n = a + d; //类型提升，先将a提升为long，运算后得到的是long类型，不能赋值给int类型
    }

    /*********************字符类型变量*********************************/
    public static void main5(String[] args) {
        // 由于Java中使用Unicode表示字符. 因此一个字符占用两个字节, 表示的字符种类更多, 包括中文
        char ch1 = 'a';
        System.out.println(ch1);
        char ch2 = '高';
        System.out.println(ch2);
        // 使用javac命令出错时加上javac -encoding UTF-8 Test.java 即可

        char ch3 = 97;
        System.out.println(ch3);  //a
        //char ch4 = -10;
        //System.out.println(ch4);  //error  在java中，字符类型是不能给负数的
    }

    /*********************单精度浮点类型变量*********************************/
    public static void main4(String[] args) {
        //当不声明时，默认小数都用double来表示，所以如果要用float的话，则应该在其后加上f

        //float f = 12.5; //error
        float f = 12.5f;  //法1
        //法2：float f = (float)12.5; //强制类型转换
        System.out.println(f);

        //C语言是一个弱类型语言，对类型的检查并不严格 Warning
        //Java是一个强类型语言 Error
    }

    /*********************双精度浮点类型变量*********************************/
    public static void main3(String[] args) {
        double d = 12.5;
        System.out.println(d);

        int a = 1;
        int b = 2;
        System.out.println(a/b);  //0

        double c = 1.1;
        double f = 1.1;
        System.out.println(c*f); //1.2100000000000002
        //小数是没有精确的数字的,二进制无法精确表示0.1的值; 精度！
    }

    /*********************长整型变量*********************************/
    public static void main2(String[] args) {
        long num = 10L;  //使用10初始化也可以,但使用10L或者10l更好一些.
        System.out.println(num);

        //Java 中 long 类型占 8 个字节. 表示的数据范围 -2^63 -> 2^63-1
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }

    /*********************整型变量*********************************/
    public static void main1(String[] args) {
        int num = 10;
        System.out.println(num);
        System.out.println(Integer.MAX_VALUE); //int的最大值  -> 2147483647
        System.out.println(Integer.MIN_VALUE); //int的最小值

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue+1);  //溢出  -> -2147483648
    }
}
