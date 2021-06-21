package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-20
 * Time: 17:33
 */
class A {

}
class B extends A{

}
class C extends B {

}
//继承三层以上的类 加上final关键字 表示 密封类：当前类不可再继承
final class D extends C {

}
//再往下继承 编译器会报错
/*class E extends D{    //error

}*/
class Student {

}
class Teacher {

}

class School {
    public Student[] students;

    public Teacher[] teachers;
}
public class TestDemo2 {
    protected  int val;
}
