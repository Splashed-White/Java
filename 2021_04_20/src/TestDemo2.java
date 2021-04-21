/**
 * Created with IntelliJ IDEA.
 * Description: 封装
 * User: TL
 * Date: 2021-04-20
 * Time: 20:29
 */

/**
 * 类的实现者
 */
class Person2{

    private String name;
    private String sex;
    public int age;
    public static int count = 0;
    public static final int size = 10;

    /**
     * 构造方法：
     * 1. 没有返回值，且 方法名和类名一样
     * 2. 是用来构造对象的（实例化对象的）
     */
    public Person2(){
        System.out.println("不带有参数的构造方法!");
    }
    public Person2(String name){
        this.name = name;
        System.out.println("调用带有一个参数的构造函数Person2(String name)!");
    }
    public Person2(String name,String sex){
        this.name = name;
        this.sex = sex;
        System.out.println("调用带有两个参数的构造函数Person2(String name,String sex)!");
    }

    //提供共有的get and set 方法
    //alt + insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 1. this 不可以访问静态成员变量
     * 2. 静态方法的内部是不可以有this的
     * 3. 实例化(new)一个对象分为几步？
     *    3.1 为对象分配内存
     *    3.2 调用合适的构造方法，这就意味着构造函数不止一个
     */
//    public void SetName(String myName){
//        this.name = name;
//        // this代表当前person对象
//    }
//    public String getNmae(){
//        return name;
//    }
    public static void staticFunc(){
        //System.out.println(this.age);
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

}
public class TestDemo2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();  //不带有参数的构造方法!
        Person2 person2 = new Person2("ttt");  //调用带有一个参数的构造函数Person2(String name)!
        System.out.println(person2);
        Person2 person3 = new Person2("lll","女");  //调用带有两个参数的构造函数Person2(String name,String sex)!
        System.out.println(person3);
    }
    /**
     * 类的调用者
     * private修饰的成员变量一定只能在当前类房中使用，
     * 不可以在类外使用
     * @param args
     */
    public static void main1(String[] args) {
        Person2 person = new Person2();
        //person.name = "tl";  //无法再类外访问
        //System.out.println(person.name);
        person.setName("tl");
        System.out.println(person.getName());
    }
}