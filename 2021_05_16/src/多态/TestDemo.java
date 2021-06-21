package 多态;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-21
 * Time: 21:12
 */
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
        //eat();
        this.func();
    }

    public void func() {
        System.out.println("animal::func()");
    }

    public void eat() {
        System.out.println(this.name+" 吃饭! Animal");//1
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(this.name+" 吃饭! Cat");//2
    }
}

class Bird extends Animal {
    public int size =99;
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(this.name+" 正在飞！");
    }
}

public class TestDemo {


    public static void main(String[] args) {
        Cat cat =  new Cat("花花");

    }


    /**
     * 动态绑定：
     * @param args
     */
    public static void main4(String[] args) {
        Animal animal =  new Cat("花花");
        animal.eat();
        funcc();
    }

    public static void funcc() {

    }



    /**
     * 向下转型：
     *       父类类型  转变为  子类类型
     * 注意：
     *    1、强制类型转换
     *    2、向下转型 使用情况不多，因为向下转型 非常的不安全
     * @param args
     */

    public static void main3(String[] args) {
        Animal animal =  new Cat("花花");
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        }
        //animal.fly();
    }

    public static void main2(String[] args) {
        Animal animal =  new Bird("花花");
        //animal.eat();
        //父类引用给子类的时候，必须强制类型转换
        Bird bird = (Bird)animal;
        bird.fly();

        //这个调用是失败的
        // animal.fly();
    }


    /**
     * 向上转型：父类引用   引用了子类对象
     *       向上转型发生的几种时机：
     *       1、直接赋值：Animal animal =  new Cat("花花");
     *       2、函数的传参
     *       3、函数的返回值
     *  作用：
     *       多态！
     * @param args
     */
    public static void main1(String[] args) {
        /*Cat cat = new Cat("花花");
        //引用指向引用？？  animal这个引用   引用了 cat 这个引用 引用的对象
        Animal animal = cat;*/
        //向上转型
        Animal animal =  new Cat("花花1");
        //Node cur = head;
        Cat cat = new Cat("花花2");
        func1(cat);
    }

    public static Animal func2() {
        Cat cat = new Cat("花花3");
        return cat;
    }

    public static void func1(Animal animal) {

    }
}