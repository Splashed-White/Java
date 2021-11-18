/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-18
 * Time: 19:26
 */

import java.util.*;

public class 找重复数据 {
    /**
     * 统计重复的数据出现的次数
     */
    public static void main(String[] args) {
        // key:数据    vallue:次数
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1_000);
        }
        //判断数组的数据是否在map中， 没有就设置1，有就vaule+1
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i],value+1);
            }else{
                map.put(arr[i],1);
            }
        }
        //遍历一遍map
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            System.out.println("关键字:" + entry.getKey() + "  次数:" + entry.getValue());
        }
    }
    /**
     * 从10W个数据中，找出第一个重复的数据
     */
    public static void main2(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1_000);
        }
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    /**
     * 去除10W个数据中的重复元素
     */
    public static void main1(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[10_0000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1_000);
        }
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
                break;
            }
            set.add(arr[i]);
        }
    }
}
