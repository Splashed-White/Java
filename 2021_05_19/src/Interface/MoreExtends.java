package Interface;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-28
 * Time: 17:22
 */
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}

class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
}
class Cat extends Animal implements IRunning{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name+ "正在跑！");
    }
}
class Bird extends Animal implements IRunning,IFlying{
    public Bird(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(this.name + "正在飞！ ");
    }
    @Override
    public void run() {
        System.out.println(this.name+ "正在跑！");
    }
}
class Duck extends Animal implements IFlying,IRunning,ISwimming {
    public Duck(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(this.name + "正在飞！ ");
    }
    @Override
    public void run() {
        System.out.println(this.name+ "正在跑！");
    }
    @Override
    public void swim() {
        System.out.println(this.name+ "正在游泳！");
    }
}
class Robot implements IRunning{
    @Override
    public void run() {
        System.out.println("机器人正在跑！");
    }
}

public class MoreExtends {
    public static void funcIRun(IRunning iRunning) {
        iRunning.run();
    }
    public static void funcIFly(IFlying iFlying) {
        iFlying.fly();
    }
    public static void funcISwim(ISwimming iSwimming) {
        iSwimming.swim();
    }

    public static void main10(String[] args) {
        funcISwim(new Duck("鸭子")); //鸭子正在游泳！
        funcIRun(new Robot()); //机器人正在跑！
    }
    public static void mainIFly(String[] args) {
        //funcIFly(new Cat("花花1！"));
        funcIFly(new Bird("花花2！"));
        funcIFly(new Duck("花花3！"));
    }

    public static void mainRun(String[] args) {

        funcIRun(new Cat("花花1！"));
        funcIRun(new Bird("花花2！"));
        funcIRun(new Duck("花花3！"));

    }
    public static void main2(String[] args) {
        IRunning iRunning1 = new Cat("动物1！");
        IRunning iRunning2 = new Bird("动物2！");
        IRunning iRunning3 = new Duck("动物3！");
    }

    public static void main1(String[] args) {
        Animal animal1 = new Animal("动物1");
        Animal animal2 = new Animal("动物2");
        Animal animal3 = new Animal("动物3");
    }
}
