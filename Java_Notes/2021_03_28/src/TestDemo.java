/*
    psvm：写一个主函数
    sout：System.out.println();
 */
public class TestDemo {
    public static void main(String[] args) {  //psvm
        //java中没有所谓的无符号数
        int a = Integer.MAX_VALUE + 1 ;      //2147483647 ->  -2147483648
        System.out.println(a);
        int b = Integer.MIN_VALUE - 1 ;      //-2147483648 ->  2147483647
        System.out.println(b);
    }
    public static void main1(String[] args) {  //psvm
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println("a:"+a+" b:"+b);   //a:10 b:20
        //1. 字符串拼接任何变量，都会变成字符串，此时的+是拼接的意思
        System.out.println("a:"+a+b);  //a:1020
        //2. 如果前面不是首先出现的字符串，那么要先运算
        System.out.println(a+b+"haha");  //30haha
        System.out.println("Hello World");  //sout
    }
}
/*
    Java中的注释：
        1.行注释 /
        2.块注释 /*
        3.文档注释 /**
*/