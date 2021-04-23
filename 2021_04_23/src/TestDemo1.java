/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-23
 * Time: 19:53
 */


/**
 * 实现交换两个变量的值。要求：需要交换实参的值
 */
class Myvalue{
   public int val;
}

public class TestDemo1 {
    //按值传递 -> 地址
    public static void swap(Myvalue v1,Myvalue v2){
        int temp = v1.val;
        v1.val = v2.val;
        v2.val = temp;
    }
    public static void main(String[] args) {
        Myvalue v1 = new Myvalue();
        v1.val = 10;
        Myvalue v2 = new Myvalue();
        v2.val = 20;
        System.out.println(v1.val);
        System.out.println(v2.val);
        swap(v1,v2);
        System.out.println(v1.val);
        System.out.println(v2.val);
    }
}
