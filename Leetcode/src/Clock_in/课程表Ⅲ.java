package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-14
 * Time: 19:25
 */

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 贪心思想
 */
public class 课程表III {
    public static int scheduleCourse(int[][] courses) {
        //按课程结束时间 升序排序
        Arrays.sort(courses, (a, b)->a[1]-b[1]);
        // 大根堆，学习时长更长的在堆顶
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b)->b-a);
        int sum = 0;
        // 按截止时间从近到远遍历课程
        for(int[] course: courses){
            //在已学习的课程中查找时长最长的课程删除：堆顶元素与当前课程时间比较，如果堆顶元素大则出堆并更新sum，若是当前元素大，则不学习该课程，跳过到下一条
            if(sum + course[0] > course[1] && heap.size() > 0 && heap.peek() > course[0])
                sum -= heap.poll();
            //可以学习当前课程
            if(sum + course[0] <= course[1]){
                sum += course[0];
                heap.offer(course[0]);
            }
        }
        // 堆中有多少课程就是结果
        return heap.size();
    }

    public static void main(String[] args) {
        //int[][] courses = {{100,200},{200,1300},{1000,1250},{2000,3200}};
        int[][] courses = {{6,6},{5,5},{2,6}};
        int ret = scheduleCourse(courses);
        System.out.println(ret);
    }
}