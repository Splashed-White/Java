/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-23
 * Time: 19:45
 */

/**
 *编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘除四种运算
 */
class Calculator{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add(){
        return this.num1 + this.num2;
    }
    public int sub(){
        return this.num1 - this.num2;
    }
    public int mul(){
        return this.num1 * this.num2;
    }
    public double dev(){
        return this.num1*1.0 / this.num2;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setNum1(10);
        cal.setNum2(20);
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.dev());
    }
}
