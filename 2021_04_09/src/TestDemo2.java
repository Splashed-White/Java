/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-10
 * Time: 16:04
 */
public class TestDemo2 {
    public static void func(int a){
        a = 200;
        System.out.println("a改成了："+a);
    }  //形参的改变，不一定会影响实参
    public static void main(String[] args) {
        int a = 10;
        int b = 20; //局部变量，在栈上存放 在java中，栈上的内存地址是拿不到的！
        //System.out.println(&b);  //error
        func(a);
        System.out.println("a = "+a);
    }
    //a改成了：200
    //a = 10


    /**
     * 写一个方法，求1-100的和
     * @param n
     */
    public  static  int add(int n){
        System.out.println("这个函数被调用了");
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
        //System.out.println(sum);   //无返回值，复用性下降
    }
    public static void main1(String[] args) {
        int a = 100;
        int ret = add(a);  //函数的调用
        //add(a);
        System.out.println(ret);
    }
}
