/**
 * Created with IntelliJ IDEA.
 * Description: 类与对象
 * User: TL
 * Date: 2021-04-18
 * Time: 16:14
 */

class Person {
    /**
     * 字段 / 成员变量：定义在类的内部，方法的外部.
     * 成员变量的默认值是其对应的0值:
     * 引用类型：null
     */
    public String name = "bit";
    public int age;
    public String sex;

    //方法 / 函数  -> 方法区
    public void eat() {
        System.out.println(name + " eat()");
    }

    // alt + insert
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

public class TestDemo2 {
    /**
     * 匿名对象：如果当前对象值使用一次，就用匿名对象
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Person());  //匿名对象
    }
    public static void main5(String[] args) {
        Person p = new Person();
        System.out.println(p);  //Person{name='bit', age=0, sex='null'}
    }
    /**
     * 1. p = null 代表当前引用不指向任何对象
     * @param args
     */
    public static void main4(String[] args) {
        Person p = new Person();
        Person p2 = p;
        p.name = "tl";  //  类里面写死了也可以改
        System.out.println(p.name);
    }
    public static void main3(String[] args) {
//        Person p = null;
//        //Exception in thread "main" java.lang.NullPointerException
//        //空指针异常
//        p.name = "tl";  //error
//        System.out.println(p.name);
    }
    /**
     * 成员变量的访问
     * @param args
     */
    public static void main2(String[] args) {
        Person p1 = new Person();
        //对象的引用.属性名
        p1.name  = "tl";
        System.out.println(p1.name);  //null
        //对象的引用.方法名
        p1.eat();  //null eat()
    }

    public static void main1(String[] args) {
        int a = 10;  //局部变量
        //实例化一个对象，通过 new 关键字
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

    }
}
