package demo1;

import demo2.TestDemo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-20
 * Time: 17:32
 */
class Person {
    //字段  普通成员变量   属性
    public String name;
    public int age;
    //字段  惊天成员变量   属性
    public static int count = 10;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public void eat() {
        int a = 10;
        System.out.println(this.name+" 吃饭！");
    }
}

public class Test extends TestDemo2 {

    public void func() {
       /* TestDemo2 testDemo2 = new TestDemo2();
        System.out.println(testDemo2.val);  //error
*/
        System.out.println(super.val);
    }


    public static void main(String[] args) {
        //System.out.println(super.val);
    }


    public static void main1(String[] args) {
        Person per = new Person();
        per.name = "gaobo";
        per.age = 10;
        per.eat();
        Person per2 = new Person("bit");
    }
}
