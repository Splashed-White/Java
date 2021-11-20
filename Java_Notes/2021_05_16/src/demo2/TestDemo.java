package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-20
 * Time: 17:32
 */
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    /* public Animal() {
     }*/
    public void eat() {
        System.out.println(this.name+" 吃饭!");
    }
}
//Animal派生出子类Cat
class Cat extends Animal{
    public int age;
    /* public Cat() {
         super();
     }*/
    public Cat() {
        //显示的调用父类的构造方法
        super("xiaohuahua");
    }
}

class Bird extends Animal {
    protected String name = "gaobo";
    //public int size;
    public Bird(String name) {
        super(name);
        //this.size = 10;
    }
    public void fly() {
        //调用父类的成员属性
        System.out.println(super.name);// 大花花
        super.eat();//调用父类的eat方法   大花花吃饭
        System.out.println(this.name+" 正在飞！");
    }
}

public class TestDemo {

    public static void main(String[] args) {
        TestDemo2 testDemo2 = new TestDemo2();
        System.out.println(testDemo2.val);
    }

    public static void main2(String[] args) {
        Bird bird = new Bird("大花花");
        bird.fly();
    }
    public static void main1(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
}

