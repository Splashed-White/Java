import java.sql.Struct;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-10
 * Time: 16:07
 */
/*
* 关于父类与子类同名实例变量的关系
* */
class Person{
    public String name = "1100";
    //执行0后，此时name已经不是1100了，this.name赋值为bit；

    public Person(String name) {
        this.name = name; //2
    }
}
class Student extends Person{
    public String name; //hahaha

    public Student(String name) { //1
        super(name);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student = new Student("bit"); //0
        student.name = "hahaha";
    }
}
