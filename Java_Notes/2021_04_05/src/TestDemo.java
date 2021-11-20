import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-05
 * Time: 11:44
 */
public class TestDemo {
    /************************输入控制台******************************/
    /**
     * 处理循环读入的问题！
     * OJ 有多组输入
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hasNextInt()这是一个方法，来判断是否有下一个整数
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            System.out.println("每输入一次，就执行一次：" + a);
              //Ctrl + D结束
        }
    }
    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println(name);
        //字符串前面不能输入其他类型，比如年龄和价格就不能放在最前面
        //建议：把输入字符串放在最前面

        System.out.println("年龄：");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("价格：");
        double price = scanner.nextDouble();
        System.out.println(price);

    }
    /**
     * 1. 代码罗嗦
     * 2. 只能读一个字符
     * @param args
     */
    public static void main8(String[] args){
        System.out.print("Enter a Char:");
        char i = 0;  //异常(错误)
        try {
            //System.in 键盘
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("your char is :"+i);
    }
    /************************输出控制台******************************/
    public static void main7(String[] args) {
        System.out.println("输出且换行");
        System.out.print("输出不换行");
        System.out.printf("%d\n",10);
    }
    /************************do while循环******************************/
    public static void main6(String[] args) {
        int i = 0;
        do{
            System.out.println("haha");
        }while(i>0);
    }  //先执行，后判断

    /************************for循环******************************/
    public static void main5(String[] args) {
        //求阶乘和
        int num = 5;
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            int fac = 1;
            for (int j = 1; j <= i ; j++) {
                fac = fac * j;
            }
            sum = sum + fac;
        }
        System.out.println(sum);  //153

    }

    /************************死循环******************************/
//    public static void main4(String[] args) {
//        while(true){
//            System.out.println("这是一个死循环");
//        }
//        for(;;) {
//            System.out.println("这是一个死循环");
//        }
//    }
    /************************break******************************/
    public static void main3(String[] args) {
//        int i = 1;
//        while (i < 10) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i + " ");
//            i++;
//        }
//    }
    /**
     * 求1-100之间既能被3整除也能被5整除，使用break或者continue
     */
    int i = 1;
    while(i <= 100){
        if(i % 3 != 0){
            i++;
            continue;
        }else if(i % 5 != 0){
            i++;
            continue;
        }
        System.out.println(i);
        i++;
        }
    }
    /*************************while循环*********************************/
    public static void main2 (String[]args){
//        int i = 1;
//        int sum = 0;
//        while (i < 100) {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

        //求1-100之间偶数和奇数的和
        int i = 1;
        int odd = 0;
        int even = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
            i++;
        }
        System.out.println("偶数和" + even);
        System.out.println("奇数和" + odd);
    }

//    //求1！+2！+3！+4！+5！
//    int i = 1;
//    int j = 1;
//    int sum = 0;
//    int fac = 1;
//    while (i <= 5) {
//        //int j = 1;
//        //int fac = 1;
//        while (j <= i) {
//            fac = fac * j;
//            j++;
//        }
//        sum = sum + fac;
//        i++;
//    }
//            System.out.println(sum);  //153

    /*********************多分支：switch*********************************/
    /**
     * 1. break：每个case后面都不要省略break
     * 2. 和if的区别：switch中不能够写一个复杂的表达式
     * 3. 不能做switch参数的数据类型有什么？ long,float,double,boolean
     */
    public static void main1 (String[]args){
        int a = 10;
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        int x = 1;
        int y = 1;
        switch (x) {
            case 1:
                switch (y) {
                    case 2:
                        System.out.println("hehe");
                        break;
                }
                break;
            case 2:
                System.out.println("haha");
                break;
        } //不打印
    }
}





