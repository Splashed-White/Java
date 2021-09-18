package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-15
 * Time: 13:22
 */
public class 无法吃午餐的学生数量 {
    /**
     * 某个测试用例超出时间限制
     * [1,1,1,0,0,1]
     * [1,0,0,0,1,1]
     * @param students
     * @param sandwiches
     * @return
     */
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int len = students.length;
        int count = 0;
        for (int i = sandwiches.length-1; i >= 0; i--) {
            stack.push(sandwiches[i]);
        } //面包 队列
        for (int j = 0; j < students.length; j++) {
            queue.offer(students[j]);
        } //学生 栈
        while(!stack.isEmpty() && !queue.isEmpty()) {
            if(stack.peek() == queue.peek()){
                stack.pop();
                queue.poll();
            }else{
                int x = queue.poll();
                queue.offer(x);
            }
            count++;
        }//for
        if(count > 1000) {
            return stack.size();
        }
        return 0;
    }
}
