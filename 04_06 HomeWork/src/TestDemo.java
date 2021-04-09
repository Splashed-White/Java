import com.sun.javaws.IconUtil;
import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import sun.security.jgss.GSSCaller;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-07
 * Time: 15:07
 */
import java.util.Scanner;
import java.util.Random;
public class TestDemo {
    /**
     * 输出n*n的乘法口诀表，n由用户输入
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d  ",j,i,i*j);
            }
            System.out.printf("\n");
        }
    }
    /**
     * 输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
     * @param args
     */
    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        int a = 0;
        while(num!=0){
            a = num % 10;
            num = num / 10;
            System.out.println(a);
        }
    }
    /**
     * 编写代码模拟三次密码输入的场景。
     * 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输入，最多输入三次。三次均错，则提示退出程序
     * @param args
     */
    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "123";
        int count = 3;
        while(count != 0){
            System.out.println("请输入密码：");
            if(password.equals("123")){
                System.out.println("登陆成功");
                break;
            }else{
                count--;
                System.out.println("你还有"+count+"次机会");
                continue;
            }
        }
        System.out.println("退出程序");
    }
    /**
     * 获取一个数其二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
     * @param args
     */
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("偶数位为：");
        for (int i = 0; i < 32; i++) {
            if(i % 2 == 0){
                System.out.print((num>>i)&1);
            }
        }
        System.out.printf("\n");
        System.out.println("奇数位为：");
        for (int i = 0; i < 32; i++) {
            if(i % 2 == 1) {
                System.out.print((num >> i) & 1);
            }
        }
    }
    /**
     * 求一个整数，在内存当中存储时，二进制1的个数
     * @param args
     */
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((num>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }
    /**
     * 求两个正整数的最大公约数
     * @param args
     */
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if(m > n){  // m 放较小的数
            int temp = m;
            m = n;
            n = temp;
        }
        for (int i = m; i >= 2; i--) {  //从大到小找第一个最大数
            if(m % i == 0 && n % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
    /**
     * 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100的值
     * @param args
     */
    public static void main4(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                sum -=(1.0/i);
            }else{
                sum += (1.0/i);
            }
        }
        System.out.println(sum);
    }
    /**
     * 水仙花数：一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋125＋27，则153是一个水仙花数
     * 求出0～999之间的所有水仙花数并输出。
     * @param args
     */
    public static void main3(String[] args) {
        int a,b,c = 0;
        for (int i = 100; i <= 999; i++) {
            a = i % 10;
            b = (i / 10) % 10;
            c = i / 100;
            if((a*a*a +b*b*b + c*c*c) == i){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
    /**
     * 完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
     * @param args
     */
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int Guess = random.nextInt(100);
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num > Guess){
                System.out.println("猜大了");
            }else if(num < Guess){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
            }
        }
        scanner.close();
    }

    /**
     * 输入：多组输入，一个整数（2~20），表示输出的行数，也表示组成“X”的反斜线和正斜线的长度。
     * 输出：针对每行输入，输出用“*”组成的X形图案。
     * @param args
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(scanner.hasNextInt()){
            num = scanner.nextInt();
            System.out.println(num);
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num ; j++) {
                if(i == j || i == (num-j-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}