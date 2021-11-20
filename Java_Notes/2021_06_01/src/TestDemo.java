import java.sql.Array;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-16
 * Time: 21:03
 */
class Student implements Comparable<Student>{
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
public class TestDemo {
    /**
     * 有一个List当中存放的是整形的数据，要求使用Collections.sort对List进行排序
     * @param args
     */
    public static void main7(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        Collections.sort(arrayList);
        System.out.println(arrayList); //[1, 3, 4]
    }

    /**
     * 删除第一个字符串当中出现的第二个字符串中的字符
     * eg:  String str1 = "welcome to bit";
     *      String str2 = "come";
     *      print-> "wl t bit "
     *思路：遍历取母串每一位转化为字符存储，判断此字符是否存在于字串中，若不存在则加入list中
     * 注意list中存放的数据类型的字符类型
     * @param args
     */
    public static void main6(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        ArrayList<Character>list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(!str2.contains(ch+"")){
                list.add(ch);
            }
        }
        System.out.println(list); //[w, l,  , t,  , b, i, t]
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    /**
     * 某学校又若干学生，(学生对象放在一个List中),每个学生又姓名(String),班级(String),成绩(double)
     * 遍历List集合，并把学生对象的属性打印出来
     * @param args
     */
    public static void main5(String[] args) {
        ArrayList<Student>students = new ArrayList<>();
        students.add(new Student(19,"bit"));
        students.add(new Student(29,"gaob"));
        students.add(new Student(5,"123"));
        System.out.println(students);
        /*
        * Comparable<Student>
        * 对自定义类型进行排序的时候，需要实现接口，并且重写Comparable接口的compareTo方法
        * */
        Collections.sort(students); //自定义类型
    }
    /**
     * LinkedList（链表）
     * 双向链表
     * @param args
     */
    public static void main4(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.add(0,10);
    }


    /**
     * ArrayList（顺序表）常见方法：
     * @param args
     */
    public static void main3(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(30);
        ArrayList<Integer> list3 = new ArrayList<>(list1);
    }

    /**
     * List（线性表)常见方法
     * @param args
     */
    public static void main2(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        System.out.println(list);//[1, 2, 3, 4, 3]

        /*
         * E remove(int index)
         * 删除list中某下标的元素，接收返回值
         * */

        /*int x = list.remove(1);
        System.out.println(x);//2*/

        /*
        * boolean remove(Object o)
        * 从collection集合中删除指定的元素
        *
        * E get(int index)
        * 获取下标index位置的元素
        * */
        System.out.println("===================");
        boolean flag1 = list.remove(list.get(1));
        boolean flag2 = list.remove((Object)7);
        System.out.println(flag1); //true
        System.out.println(flag2); //false
        System.out.println(list); //[1, 3, 4, 3]

        /*
         * void clear()
         * 清空 --> []
         * */
        /*System.out.println("===================");
        list.clear();
        System.out.println(list); //[]*/

        /*
         * boolean contains(Object o)
         * 判断o是否在线性表中
         * */
        System.out.println("===================");
        boolean flag = list.contains(3);
        System.out.println(flag);//true

        /*
         * int indexOf(Object o)
         * 返回第一个o所在下标
         * */
        System.out.println("===================");
        int x = list.indexOf(3);
        System.out.println(x); //1

        /*
         * int lastIndexOf(Object o)
         * 返回最后一个o所在下标
         * */
        System.out.println("===================");
        int x2 = list.lastIndexOf(3);
        System.out.println(x); //3

        /*
         * List<E> subList(int fromIndex, int toIndex)
         * 截取部分list
         * */
        System.out.println("===================");
        //System.out.println(list); //[1, 3, 4, 3]
        List<Integer> elist = list.subList(1,3); //左闭右开
        System.out.println(elist); //[3, 4]

        /*
        * E set(int index, E element)
        * 将下标index位置元素设置为element
        * 注意！subList并不是截取出来的一个新的数组，而是原来的数组，它发生改变那么原来的数组也会发生相应的改变。
        * */
        List<Integer> eList = list.subList(1,3);
        System.out.println(eList); //[3, 4]
        System.out.println("===================");
        eList.set(1,333);
        System.out.println("修改截取的："+eList); //修改截取的：[3, 333]
        System.out.println("原来的" + list); //原来的[1, 3, 333, 3]

    }

    /**
     * 1.add()
     * 2.addAll()：c.addAll(list1)
     * 将指定c中的所有元素都添加到此list1中,类型要相同
     * @param args
     */
    public static void main1(String[] args) {
        //顺序表
        List<Integer> list = new ArrayList<>();
        list.add(9);//10
        list.add(1,20);
        System.out.println(list); //[9, 20]
        System.out.println("===================");

        //addAll()
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addAll(list2);
        System.out.println(list); //[9, 20, 1, 2, 3, 4]
        System.out.println("===================");

        //addAll()只能添加相同的包类型，list是Integer类型，list1是String类型，语法错误
        /*ArrayList<String> list3 = new ArrayList<>();
        list.addAll(list3); error*/

        //迭代器
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            // TODO:去查资料了解it.remove()需要注意的问题
            //it.remove();
        }
        System.out.println("==================");
        for (Integer x : list) {
        }
    }
}
