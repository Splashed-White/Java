package Algorithm.贪心;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-17
 * Time: 14:44
 */

class myComparator implements Comparator<Integer> {
    //按作业时间从大到小排序
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
public class 活动选择 {
    public static int greedyActivitySelector(int[][] act){
        //贪婪策略：每次选择最早结束的活动
        int num = 1,i = 0;
        for (int j = 1; j < act.length; j++) {
            if(act[j][0] >= act[i][1]) {
                i = j;
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); //活动数量
        int[][] act = new int[number][2]; //活动开始时间以及结束时间
        for (int i = 0; i < act.length; i++) {
            act[i][0] = scanner.nextInt();
            act[i][1] = scanner.nextInt();
        }
        //按照活动的结束时间从小到大排序
        Integer[] arr = new Integer[number];
        for (int i = 0; i < number; i++){
            arr[i] = act[i][1];
        }
        Arrays.sort(arr, new MyComparator());
        int ret = greedyActivitySelector(act);
        System.out.println(ret);
    }
}
