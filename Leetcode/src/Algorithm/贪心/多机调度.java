package Algorithm.贪心;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-17
 * Time: 10:22
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 题目描述：n个作业, m台机器,任何作业在被处理时不能中断，就也不能进行拆分处理,计算所有作业完成的最短加工时间？
 * 思路：
 * 1. 将ti时间的作业从大到小排序
 * 一定要先选最大时间的作业去运行，否则会出现那么可能就会出现其它所有作业都处理完了只剩所需时间最长的作业在处理的情况，这样势必效率较低
 * 2. 每次分配都将最长加工时间的作业，分配给当前总加工时间最短的机器，这里便是贪心策略
 * 4. 最后 mintime 数组中的最大值就是所有作业完成的最短工作时间
 */

class MyComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        // 如果o1小于o2，我们就返回正值，如果n1大于n2我们就返回负值，
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class 多机调度 {
    public static int findMin(int[] machines){
        int minindex = 0;
        //找machines[]中最小值的下标
        for (int i = 0; i < machines.length; i++) {
            if(machines[i] <= machines[minindex])
                minindex = i;
        }
        return minindex;
    }
    private static int greedStrategy(int[] works, int[] machines) {
        int n = works.length; //作业数
        int m = machines.length; //机器数
        //work[i] 表示作业需要的时间ti
        //machines[i] 就是思路中的 mintime数组

        // 默认从小到大排序
        //Arrays.sort(works);
        //compare()方法默认从小到大排序，我们只需要重写这个方法就行了
        System.out.println("work = :" + Arrays.toString(works));

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++){
            arr[i] = works[i];
        }
        Arrays.sort(arr, new MyComparator());
        System.out.println("work_sort = :" + Arrays.toString(arr));


        // n <= m 可直接分配
        if(n <= m) return works[0];
        //2.
        for (int i = 0; i < n; i++) {
            int index = findMin(machines);
            machines[index] = arr[i] + machines[index];
        }
        //找 machines 中最大值
        int max = machines[0];
        for (int i = 0; i < machines.length; i++) {
            if(machines[i] > max)
                max = machines[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int n, m;
        System.out.println("请输入作业数和机器数");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] works = new int[n];
        int[] machines = new int[m];
        for (int i = 0; i < n; ++i)
            works[i] = scanner.nextInt();
        System.out.println(greedStrategy(works, machines));
    }
}
