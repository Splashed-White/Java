/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-18
 * Time: 19:24
 */


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        java.util.Map<String,String> map = new HashMap<>(); //通过接口实例化
        HashMap<String,String> map2 = new HashMap<>(); //通过具体类实例化

        /**
         * 1. 向 map 中存储数据时，会根据 key 做出一系列运算[Hash函数]，才能放到 hashmap中;
         * 2. key如果相同，那么会覆盖掉原来的 value值; value值可以相同;
         * 3. key 和 value 允许为 null;
         * 4. Map中键值对的Key不能直接修改，value可以修改，如果要修改key，只能先将该key删除掉，然后再来进行重新插入;
         */
        map.put("猴哥","孙悟空");
        map.put("八戒","猪八戒");
        map.put("张三","法外狂徒");
        map.put("猴哥","齐天大圣");
        map.put("六耳","齐天大圣");
        map.put(null,"沙僧");
        map.put("沙僧",null);
        /**
         * 打印map的方式
         * 1. sout
         * 2. map.entrySet():会将每个键值对包装成一个整体放入set中
         */
        System.out.println(map);
        Set<Map.Entry<String,String>> set = map.entrySet(); //返回所有的 key-value 映射关系
        for (Map.Entry<String,String> entry :set) {
            System.out.println("key:" + entry.getKey() + "  value:" + entry.getValue());
        }

        //get()方法:返回 key 对应的 value
        System.out.println("==================");
        String str1 = map.get("八戒");
        System.out.println(str1);

        //getOrDefault()方法:返回 key 对应的 value，key 不存在，返回默认值
        System.out.println("==================");
        String str2 = map.getOrDefault("唐僧","师父");
        System.out.println(str2);

        //remove()方法:删除 key 对应的映射关系
        System.out.println("==================");
        map.remove("张三");
        System.out.println(map);

        //Set<K> keySet():返回所有 key 的不重复集合
        System.out.println("==================");
        Set<String> s = map.keySet();
        System.out.println(s);

        //Collection<V> values():返回所有 value 的可重复集合
        System.out.println("==================");
        Collection<String> v = map.values();
        System.out.println(v);

        //boolean containsKey():判断是否包含key
        System.out.println("==================");
        boolean flag1 = map.containsKey("李四");
        System.out.println(flag1);

        //boolean containsValue():判断是否包含value
        System.out.println("==================");
        boolean flag2 = map.containsValue("齐天大圣");
        System.out.println(flag2);

    }
}