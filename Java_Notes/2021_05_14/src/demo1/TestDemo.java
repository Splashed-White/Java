package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-20
 * Time: 17:28
 */
class Animal {
    public String name;
    protected int age;
    public void eat() {
        System.out.println(this.name+"吃饭！");
    }
}

class Cat extends Animal{

}

class A extends Cat {

}

class Bird extends Animal{

    public void fly() {
        System.out.println(this.name+"飞起来了！");
        //不是没有继承age,是继承了，但是访问不了。不能这样直接访问
        System.out.println(this.age);
    }

}
public class TestDemo {

    public int val = 99;


    public static void main2(String[] args) {
        A a = new A();
        a.name = "huahua";
        a.eat();
    }
    public static void main1(String[] args) {
        Cat cat = new Cat();
        cat.name = "huahua";
        cat.eat();
    }
}

