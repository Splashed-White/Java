package Polymorphism;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-28
 * Time: 16:34
 */
class Shape{
    public void draw(){

    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("●");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("△");
    }
}
public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    //方法调用
    public static void drawShapes() {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();

        Shape[] shapes = {cycle,rect,cycle,rect,flower};//向上转型
        //Shape shape = cycle;
        //Shape[] shapes2 = {new Cycle(),new Rect(),new Cycle(),new Rect(),new Flower()};//向上转型

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        //向上转型 - 直接赋值
        Shape shape1 = new Rect();
        shape1.draw(); //♦
        Shape shape2 = new Cycle();
        shape2.draw(); //●

        System.out.println("====================");
        //向上转型 - 方法传参
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Triangle triangle = new Triangle();
        drawMap(triangle); //△
        drawMap(rect);  //♦
        drawMap(cycle); //●
        System.out.println("====================");
        drawShapes();
    }
}








