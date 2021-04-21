/**
 * Created with IntelliJ IDEA.
 * Description: static 关键字
 * User: TL
 * Date: 2021-04-20
 * Time: 16:54
 */
class Person{
    /**
     * 成员变量：
     * 1. 普通成员变量 / 实例变量
     * 2. 静态成员变量 / 类变量
     */
    public String name;
    public int age;

    final int a = 10;  //存在对象上 ->堆

    public static int count = 0;

    /**
     * 1. 静态的成员方法（类方法） 内为啥那么不能访问普通成员变量？
     * 静态成员方法是通过类名来调用的，此时并没有实例化一个对象出来，
     * name,age都是实例化了对象之后才会有的，
     * 2. 静态成员方法内部 也不可以 调用普通成员方法
     */
    public static void staticFunc(){
        //System.out.println(age); //error
        //System.out.println(name); //error
        System.out.println(count);
        //eat(); //error
        System.out.println("staticFunc()!!!");
    }
    public void eat(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(count);
        staticFunc();
        System.out.println("eat()!!!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestDemo {

    /**
     * 为什么main()函数 是 静态的？
     * JVM里面会自动调用这个静态函数的
     *
     * @param args
     */
    public static void main5(String[] args) {
        //被final修饰的变量与其存储内存位置无关，只看static
        Person person = new Person();
        System.out.println(person.a);
    }
    /**
     * 静态的成员方法也不依赖于对象，直接用 类名.方法名 访问
     * @param args
     */
    public static void main4(String[] args) {
        Person person = new Person();
        person.eat();
        //person.staticFunc();
        Person.staticFunc();
    }

    /**
     * 静态成员变量 不依赖于 对象
     * @param args
     */
    public static void main3(String[] args) {
        Person per = null;
        System.out.println(per.count);  //0
        //System.out.println(per.name);  //error

        Person.count++;
        System.out.println(Person.count);  //1
        Person.count++;
        System.out.println(Person.count);  //2
    }

    public static void main2(String[] args) {
        Person person = new Person();
        Person person2 = new Person();

        person.age++;
        System.out.println(person.age);  //1
        person2.age++;
        System.out.println(person2.age);  //1

        Person.count++;
        System.out.println(Person.count);  //1
        Person.count++;
        System.out.println(Person.count);  //2
    }

    public static void main1(String[] args) {
        Person person = new Person();
        System.out.println(person.name);   //null
        System.out.println("=====================");
        //静态成员变量访问方式： 类名.静态成员变量
        System.out.println(Person.count);
        //System.out.println(person.count);   //0
    }
}
