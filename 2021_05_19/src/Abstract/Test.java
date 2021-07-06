package Abstract;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-28
 * Time: 15:35
 */
abstract class Shape{
    //4. 抽象方访问权限不能是private
    //abstract private void draw(); //error
    abstract public void draw();
    //2.抽象类中可以包含抽象方法，也可以包含普通方法
    public void func(){
        System.out.println("抽象类中的普通方法");
    }
}
class Rect extends Shape{
    //3. 当一个普通类继承了抽象类，那么这个普通类须要实现抽象类中的抽象方法
    @Override
    public void draw() {
        System.out.println("♦");
    }
}
//5. 当一个普通类继承了抽象类却又不想重写抽象类中的抽象方法，那么可以把这个普通类改为抽象类
abstract class Cycle extends Shape{
    abstract public void run();
}
//7. 抽象类不能被final修饰，因为要继承
//8. 抽象方法不能被final修饰，因为要重写
abstract class Tri extends Cycle{
    //6. 当一个普通继承一个抽象类，需要重写这个抽象类所继承的所有抽象类中的抽象方法
    @Override
    public void draw() {
        System.out.println("🔺");
    }

    @Override
    public void func() {
        super.func();
    }
}
public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        //1. 抽象类不能实例化
        //Shape shape = new Shape(); //error

        //向上转型-直接赋值
        Shape shape = new Rect();
        shape.draw(); //♦
        //向上转型-方法传参
        Rect rect = new Rect();
        drawMap(rect); //♦

    }
}
