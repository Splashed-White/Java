package List;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-16
 * Time: 13:28
 */
public class TestDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1981,"张三");
        map.put(2001,"gaobo");
        map.put(1990,"bit");
        System.out.println(map); //{2001=gaobo, 1990=bit, 1981=张三}
        String ret = map.getOrDefault(1984,"gaobohhh");
        System.out.println(ret);

        System.out.println(map.containsKey(1981));

        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();

        for ( Map.Entry<Integer,String>  en  : entrySet ) {
            System.out.println(en.getKey()+"-->"+en.getValue());
        }
        /*2001-->gaobo
        1990-->bit
        1981-->张三*/

    }
    public static void main1(String[] args) {
        //<>中放存放的指定类型的包装类
        Collection<Integer> collection = new ArrayList<>();
        collection.add(123);
        collection.add(111);
        System.out.println(collection); //[123, 111]
        collection.remove(123);
        System.out.println(collection); //[111]

        Object[] array2 =  collection.toArray();
        System.out.println(Arrays.toString(array2));

        Collection<Integer> collection2 = new LinkedList<>();
        Collection<Integer> collection3 = new Stack<>();
        Collection<Integer> collection4 = new PriorityQueue<>();
        //问题：数组不能整体进行强转
        /*Integer[] array = (Integer[])collection.toArray();
        System.out.println(Arrays.toString(array));*/

    }
}
