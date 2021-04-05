/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-02
 * Time: 18:38
 */
public class TestDemo {
    /*********************作业2：给定三个 int 变量, 求其中的最大值和最小值*********************************/
    public static void main8(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        int min1 = a < b ? a : b;
        int min2 = c < min1 ? c : min1;
        System.out.println(min2);
    }

    /*********************作业1：给定两个 int 变量, 交换变量的值*********************************/
    public static void main7(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    /*************************条件运算符*********************************/
    public static void main6(String[] args) {
        //布尔表达式1 ? 表达式2 : 表达式3
        //执行的逻辑：如果表达式1为真，执行表达式2，否则执行表达式3
//        int a = 10;
//        int b = 30;
//        int c = 20;
//        int max2 = a > b ? a : b;
//        int max3 = c > max2 ? c : max2;
//        System.out.println(max3);

//        int a = 10;
//        int b = 30;
//        int c = 20;
//        int max2 = a > b ? a : b;
//        int max3 = c > (a > b ? a : b) ? c : (a > b ? a : b);
//        System.out.println(max3);

        System.out.println(false == false ? (true == true ? false : true) : true);  //false


    }

    /************************移位运算符******************************/
    public static void main5(String[] args) {
        //  << 左移：相当于*2
        //  >> 右移:在左边补符号位; 相当于/2
        System.out.println(-1>>1);  //-1
        System.out.println(-1>>2);  //-1

        //  >>> 无符号右移：最右侧位不要了, 最左侧补0
        System.out.println(-1>>>1);  //0111 1111 1111 1111 1111 1111 1111 1111
        //在内存中存的是补码
    }

    /*************************位运算符*********************************/
    public static void main4(String[] args) {
        //按位与 &  ：只要对应上有0 即为0

        //按位或 |  ：只要对应上有1 即为1

        //按位异或 ^  ：相同为0，不同为1
        // !!! 0 ^ n = n

        /*
        1 3 2 3 1
        思路：1. 所有数字进行异或  0^n = n
             2. 运算符具有交换律，所以，1^1=0;0^3=3;3^3=0;0^2=2
         */
        /*
         1 3 2 3 1 4
         找到这组数据当中只出现一次的数字，已知只有两个数字出现一次
         思路：1. 将所有数字进行异或， 2^4 = 0110
              2. 以异或的结果，进行一个规则的划分
              0010 ^ 0100 = 0110
              假设我们以从左往右数第二位的1来进行划分堆，能得到1，就说明异或的两个操作数一定一个1一个0，
              然后我们就可以划分出两个堆，一个第二位位1，一个第二位为0，
              再将原数据按照其对应位划分到两个堆中，得到① 1  1  4  ②  2  3  3
              再在两个堆内分别进行异或，就可以得到2和4
              关键点在于分出2和4
         */

        //按位取反 ~
        int a = 0xf;   //0000 0000 0000 0000 0000 0000 0000 0000 1111
        System.out.printf("%x\n", ~a);  //fffffff0

        System.out.print("输出不换行");
        System.out.println("输出换行");
    }

    /*********************逻辑运算符*********************************/
    public static void main3(String[] args) {
       //   && 逻辑与/短路与： 布尔表达式1 && 布尔表达式2  只要有一个表达式为假，整个表达式就为假
        System.out.println(10 > 20 && 10/0==0);  //False  短路求值
        //System.out.println(10 < 20 && 10/0==0);  //error

        //   || 逻辑或/短路或： 布尔表达式1 || 布尔表达式2
        //   只要有一个表达式为真，整个表达式就为真;如果表达式1为真，就不会取执行表达式2
        //System.out.println(10 > 20 || 10/0==0); //error
        System.out.println(10 < 20 || 10/0==0);  //True

        //   ! 非
        int a = 10;
        //System.out.println(!a);  //布尔表达式
        System.out.println(!false);

        // & 和 | 不推荐使用，因为不支持短路求值
        System.out.println(10 > 20 & 10 / 0 == 0); // 程序抛出异常
        System.out.println(10 < 20 | 10 / 0 == 0); // 程序抛出异常

    }

    /*********************关系运算符*********************************/
    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        //这些表达式都是Boolean表达式
        System.out.println(a == b); //False
        System.out.println(a < b);  //True
        System.out.println(a > b);  //False
        System.out.println(a != b);  //True
        System.out.println(a >= b);  //False
        System.out.println(a <= b);  //True
    }

    /************************算术运算符*******************************/
    public static void main1(String[] args) {
        //   /
        System.out.println(5/2);
        System.out.println((float)5/2);  //2.5
        System.out.println(5/(float)2);  //2.5
        System.out.println((float)(5/2));  //2.0
        //System.out.println(10/0);  //异常; 0不能作为除数

        //  % 求模
        System.out.println(10%3);  //1
        System.out.println(10%-3);  //1
        System.out.println(-10%3);  //-1
        System.out.println(-10%-3);  //-1

        System.out.println(11.5%2);  //1.5

        //复合运算符：  += -= *= /= 都会帮我们进行一次强制类型转换
        int a = 10;
        a += 2;
        System.out.println(a);

        short b = 6;
        //b = b + 2; //error  b = (short)(b + 2)
        b += 2;
        System.out.println(b);

        //自增、自减运算符
        int c = 10;
        //c++;  //11
        //++c;  //11
        int d = c++;  //10
        //int d = ++c;  //11
        System.out.println(d);
    }
}

