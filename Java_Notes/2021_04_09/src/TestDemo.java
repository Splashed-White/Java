import com.sun.javaws.IconUtil;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-08
 * Time: 10:44
 */
public class TestDemo {
    /**
     * 方法 其实就是把一个重复的东西进行封装，把他封装成一个功能;
     */
    /*********************  方法  **************************/
    public static void main(String[] args) {
        String ret = 穿秋裤("张三");  //调用函数
        System.out.println(ret);
        String ret2 = 穿秋裤("李四");
        System.out.println(ret2);
    }

    /*
    public static 方法返回值 方法名称（参数列表){
        方法内容
    }
     */
    public static String 穿秋裤(String name) {
        System.out.println("穿秋裤");
        return "我知道了";
    }
}
