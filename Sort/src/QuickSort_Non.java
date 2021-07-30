import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: 非递归 实现 快速排序
 * User: TL
 * Date: 2021-07-28
 * Time: 17:09
 */
public class QuickSort_Non {

    public static int partition(int[] array,int low,int high){ //挖空法
        int temp = array[low];
        while(low < high){
            //右边找比temp小的，填到空坑中，右边的就空了
            while (low < high && array[high] >= temp) {
                high--;
            }
            array[low] = array[high];
            //左边找比temp大的，填到空坑中，左边的就空了
            while (low < high && array[low] <= temp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp; //直到相遇，把最开始的temp值放进来
        return low;
    }

    /**
     * 非递归 快排
     * 1. 调用partition后，找到pivot
     * 2. 把pivot划分的左右区间的左右下标分别入栈
     * 3. 判断栈是否为空，若不空，弹出两个元素;注意入栈顺序决定了取出的第一个元素是给end还是high
     * 4. 在进行partition,重复上述操作
     * @param array
     */
    public static void quickSort(int[] array){
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int end = array.length-1;
        int pivot = partition(array,start,end);
        //左边有两个元素及以上
        if(pivot > start+1){
            stack.push(start);
            stack.push(pivot-1);
        }
        //右边有两个元素及以上
        if(pivot < end-1){
            stack.push(pivot+1);
            stack.push(end);
        }
        //若栈不空，弹两个元素出来
        while(!stack.empty()){
            end = stack.pop();
            start = stack.pop();
            pivot = partition(array,start,end); //在一个新区间找新的pivot
            //左边有两个元素及以上
            if(pivot > start+1){
                stack.push(start);
                stack.push(pivot-1);
            }
            //右边有两个元素及以上
            if(pivot < end-1){
                stack.push(pivot+1);
                stack.push(end);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        quickSort(array);
        System.out.println(Arrays.toString(array));
        //[0, 4, 5, 6, 7, 8, 9, 12, 22, 33, 34, 55, 56, 77, 89]
    }
}
