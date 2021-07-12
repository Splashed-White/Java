package eg_interface;

import javax.naming.Name;
import java.awt.*;
import java.util.Arrays;
import java.util.concurrent.CompletionService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-10
 * Time: 16:19
 */

/*class Person implements Comparable<Person>{
    public String name;
    public int age;

    *//**
    * 重写接口方法
    * int ret = person1.compareTo(person2);
    * person1调用的compareTo,person1就是this,person2就是参数o;
    * 但是这种方法对类的侵入性太强了，一旦定下某种排序规则便不能轻易改动;
    * *//*
    @Override
    public int compareTo(Person o) {
       *//* if(this.age > o.age){
            return 1;
        }
        else if(this.age == o.age){
            return 0;
        }else{
            return -1;
        }*//*
        return this.age - o.age;
        //return this.name.compareTo(o.name);
        //因为引用类型，所以不能-。要用compareTo;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}*/
class Money implements Cloneable{
    public double money = 9.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public String name;
    public int age;
    public Money m = new Money();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //克隆 需要重写此方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Person p = (Person) super.clone();
        p.m = (Money) this.m.clone();
        return p;
    }
}
public class Test {
    /**
     * 深拷贝：克隆money对象
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("bit",12);
        Person person2 = (Person) person.clone();
        System.out.println(person.m.money); //9.9
        System.out.println(person2.m.money); //9.9
        person2.m.money = 8.8;
        System.out.println("=====================");
        System.out.println(person.m.money); //9.9
        System.out.println(person2.m.money); //8.8
    }
    /**
     * 克隆为浅拷贝
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main7(String[] args) throws CloneNotSupportedException {
        Person person = new Person("bit",12);
        Person person2 = (Person) person.clone();
        System.out.println(person.m.money); //9.9
        System.out.println(person2.m.money); //9.9
        person2.m.money = 8.8;
        System.out.println("=====================");
        System.out.println(person.m.money); //8.8
        System.out.println(person2.m.money); //8.8
        //因为根本没有克隆money对象，person和person2指向的是同一个内存空间的money
    }

    /**
     * 克隆
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main6(String[] args) throws CloneNotSupportedException {
        Person person = new Person("bit",12);
        //Object父类,Person子类，此时会发生向下转型，编译器认为不安全
        //可以强制类型转换
        Person person2 = (Person) person.clone();
        System.out.println(person2); //person2是克隆出来的，不是new出来的
    }
    public static void main5(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("张三",12);
        person[1] = new Person("李四",34);
        person[2] = new Person("王五",18);
        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(person,ageComparator);
        System.out.println(Arrays.toString(person));
        //[Person{name='张三', age=12},
        // Person{name='王五', age=18},
        // Person{name='李四', age=34}]
    }
    /**
     * 比较器：比较灵活,你可以按照你想比较的方式进行比较
     * @param args
     */
    public static void main4(String[] args) {
        Person person1 = new Person("g",12);
        Person person2 = new Person("b",34);
        System.out.println("========按年龄比较===========");
        AgeComparator ageComparator = new AgeComparator();
        int ret = ageComparator.compare(person1,person2);
        System.out.println(ret);
        System.out.println("========按姓名比较===========");
        NameComparator nameComparator = new NameComparator();
        int ret2= nameComparator.compare(person1,person2);
        System.out.println(ret2);
    }

    public static void main3(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("张三",12);
        person[1] = new Person("李四",34);
        person[2] = new Person("王五",18);
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
        //[Person{name='张三', age=12},
        // Person{name='王五', age=18},
        // Person{name='李四', age=34}]

        //Comparable comparable = new Person("bit",11);
    }

    /**
     *如果自定义的类型要进行比较，一定要实现接口
     * 1. Comparable - compareTo
     * @param args
     */
    /*public static void main2(String[] args) {
        Person person1 = new Person("张三",12);
        Person person2 = new Person("李四",34);
        int ret = person1.compareTo(person2);
        System.out.println(ret);
    }*/

    public static void main1(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("张三",12);
        person[1] = new Person("李四",34);
        person[2] = new Person("王五",18);
        //对person 排序  error ; 类型异常
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));

    }
}
