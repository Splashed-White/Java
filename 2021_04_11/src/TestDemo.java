/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-11
 * Time: 9:15
 */
public class TestDemo {
    /**
     * 交换两个数的值  ——暂时error
     * @param x
     * @param y
     */
    public static void swap(int x,int y){  //形参
        int temp = x;
        x = y;
        y = temp;
    }
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("交换前：" +a+" " + b);
        swap(a,b); //实参
        //swap(&a,&b); //java中没有这样的语法，且栈上的内存是拿不到的
        //数组
        System.out.println("交换后：" +a+" " + b);
    }
}
