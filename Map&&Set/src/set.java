/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-18
 * Time: 19:25
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//数学意义上的集合，set当中存放的元素是不能重复的
public class set {
    public static void main(String[] args) {
        //实例化
        Set<Integer> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        /**
         * 1.Set中存放元素，是无序存放的;
         */
        set1.add(1);
        set1.add(2);
        set1.add(null);
        set1.add(4);
        System.out.println(set1); //[null, 1, 2, 4]

        set2.add("a");
        set2.add("a2");
        set2.add("c3");
        set2.add("d");
        System.out.println(set2); //[c3, a, a2, d]

        //boolean contains():判断元素是否在集合中
        boolean flag1 = set1.contains(2);
        System.out.println(flag1);

        /**
         * 迭代器不能遍历Map，因为他不能实现这个接口
         */
        //Iterator<E> iterator():返回代器
        Iterator<String> it = set2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

