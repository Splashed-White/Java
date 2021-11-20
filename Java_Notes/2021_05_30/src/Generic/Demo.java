package Generic;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-16
 * Time: 14:40
 */


/**
 *   问题：如何实现一个通用顺序表？
 *     1、<T> ： 代表当前类是一个泛型类。
 *     2、new T[10];   不能new泛型类型的数组  T[] t = new T[];
 *     3、
 *     泛型的意义：
 *      1、在存储元素的时候，可以自动进行类型检查
 *      2、在获取元素的时候，可以进行自动类型的转换
 *      3、泛型类型的参数：不能是简单类型
 *      4、泛型类型的参数，是不参与类型的组成的
 *
 *    面试问题：
 *       泛型到底是怎么编译的？
 *         1、泛型只在编译的时候，起作用。在运行的时候，是没有泛型的概念的！！！
 *         2、擦除机制 -> Object -> 不严谨-》我们可以给擦除边界
 */

class MyArrayList<T> {
    private T[] elem;
    private int usedSize;

    public MyArrayList() {
        this.elem = (T[])new Object[10];
        //Integer[] tmp = (Integer[]) new Object[10];
    }

    public void add(T val) {
        this.elem[this.usedSize++] = val;
    }

    public T getPos(int pos) {
        return this.elem[pos];
    }
}
class Person {

}
public class Demo {

    public static void main4(String[] args) {
        Person person = new Person();
        System.out.println(person);

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        System.out.println(arrayList);

        MyArrayList<String> arrayList2 = new MyArrayList<>();
        System.out.println(arrayList2);

    }
    public static void main3(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        //arrayList.add("gaobo");
        int ret = arrayList.getPos(0);
        System.out.println(ret);

        MyArrayList<String> arrayList2 = new MyArrayList<>();
        arrayList2.add("gaobo");

    }
    public static void main2(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("gaobo");
        //arrayList2.add(1);

    }
    public static void main1(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add("gaobo");
        myArrayList.add(1.1);
        String ret = (String)myArrayList.getPos(1);
        System.out.println(ret);
    }
}

