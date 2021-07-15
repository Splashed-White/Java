import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 异常
 * User: TL
 * Date: 2021-07-14
 * Time: 16:17
 */
class Person implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Test3 {

    public static int func() {
        try {
            int a = 10;
            return a;
        }catch (NullPointerException e) {
            e.printStackTrace();
        }finally {
            return 9;//不要在finally当中进行return
        }
    }

    public static void func2() {
        try {
            System.out.println(10/0);
        }catch (NullPointerException e) {
            e.printStackTrace();
        }finally {
        }
    }

    public static void main(String[] args) {
        /*try {
            func2();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {

        }*/
        func2();
        System.out.println("dfafdsa");
        //System.out.println(func());
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            //可能会发生异常的代码！
            System.out.println(a/b);
            //中间还有很多的代码
            int[] array = {1,2,3};
            System.out.println(array[0]);
            System.out.println("异常下面的代码不执行了！");

        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            //捕获的是对应的异常
            System.out.println("捕获了ArrayIndexOutOfBoundsException！");
        } finally {
            System.out.println("finally当中的代码 一定会被执行！ 没有任何条件");
            System.out.println("所以，finally一般来释放资源，比如：关闭文件。");
            scanner.close();
        }
        System.out.println("fafsafsafsafsadfa");
    }

    public static void main6(String[] args) {
        try {
            int a = 10;
            int b = 20;
            //可能会发生异常的代码！
            System.out.println(a/b);
            //中间还有很多的代码
            int[] array = {1,2,3};
            System.out.println(array[100]);
            System.out.println("异常下面的代码不执行了！");

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            //捕获的是对应的异常
            System.out.println("捕获了ArithmeticException算术异常 或者ArrayIndexOutOfBoundsException！");
        }

        System.out.println("fafsafsafsafsadfa");

    }

    /**
     * 如果一个代码当中，没有处理异常，那么会直接将这个异常交给JVM。程序就会异常终止！
     *
     * @param args
     */
    public static void main3(String[] args) {
        try {
            int a = 10;
            int b = 20;
            //可能会发生异常的代码！
            System.out.println(a/b);
            //中间还有很多的代码
            int[] array = {1,2,3};
            System.out.println(array[100]);

            System.out.println("异常下面的代码不执行了！");

        }catch (ArithmeticException e) {
            //捕获的是对应的异常
            System.out.println("捕获了ArithmeticException算术异常！");
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();//因为用的流不一样
            System.out.println("ArrayIndexOutOfBoundsException异常！");
        }

        System.out.println("fafsafsafsafsadfa");

        //int[] array = {1,2,3};
        //System.out.println(array[100]);
        //int[] array = null;
        //System.out.println(array.length);
    }


    public static void fun(int i) {
        if(i == 1) return;
        fun(i-1);
    }

    public static void main1(String[] args) throws CloneNotSupportedException {

        Person person = new Person();
        Person person2 = (Person)person.clone();

        //fun(12);

        // System.out.println(10/0);
        //int[] array = {1,2,3};
        //System.out.println(array[100]);
        //int[] array = null;
        //System.out.println(array.length);
    }

}
