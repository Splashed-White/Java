package Interface;

import javafx.scene.effect.InnerShadow;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-28
 * Time: 16:44
 */
interface IShape{
    //1. 接口中的方法，默认都是抽象方法 ，public stract 可省略
    public abstract void draw();
    //2. 接口中定义的成员变量，默认都是 public static final 可省略
    public static final int a = 10;
    //3. 接口中所以的方法，都没有具体的实现
    //4. 在JDK1.8开始，default修饰的方法可以有具体实现
    default void func(){
        //默认是public属性，要加default
        System.out.println("接口中default修饰的方法具体实现");
    }
}
//7. 一个类可以实现多个接口，但要重写每个接口中的方法
//实现该接口的类可以不重写用default修饰的方法
class Cycle implements IShape{
    @Override
    public void draw() {
        System.out.println("●");
    }
}
class Rect implements IShape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}
public class Test {
    public static void drawMap(IShape iShape) {
        iShape.draw();
        //iShape.func();
    }

    public static void main(String[] args) {
        //5. 接口不能实例化
        //IShape shape = new IShape(); //error
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        drawMap(rect); //♦
        drawMap(cycle); //●

        IShape shape = new Rect();
        drawMap(shape); //♦
    }
}
