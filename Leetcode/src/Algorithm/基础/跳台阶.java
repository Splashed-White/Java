package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-27
 * Time: 10:34
 */

/**
 * 变形的斐波那契数列：1 2 3 5 8 13 21
 */

/**
 * 法一：递归公式
 */
//public class 跳台阶 {
//    public int jumpFloor(int target) {
//        if(target == 1) return 1;
//        if(target == 2) return 2;
//        return jumpFloor(target-1) + jumpFloor(target-2);
//    }
//}

/**
 * 法一：迭代
 */
public class 跳台阶 {
    public int jumpFloor(int target) {
        if(target == 1) return 1;
        if(target == 2) return 2;
        int first = 1;
        int second = 2;
        int third = first + second;
        while(target-2 > 0){
            first = second;
            second = third;
            third = first + second;
            target--;
        }
        return second;
    }
}

