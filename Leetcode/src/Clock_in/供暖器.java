package Clock_in;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-21
 * Time: 10:28
 */
public class 供暖器 {
    //房子位置存入数组，遍历数组每一个元素，要么用前面的暖气，要么用后面的暖气，总之取最近的，最后返回所有元素暖气位置最远的
    public static int helper(int num, int[] heaters){
        int min = Math.abs(heaters[0] - num);
        for(int i = 0; i < heaters.length; i++){
            int a = Math.abs(heaters[i] - num);
            if(a < min){
                min = a;
            }
        }
        return min;
    }
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int ret = 0;
        for(int i = 0; i < houses.length; i++){
            int min = helper(houses[i],heaters);
            if(min > ret) ret = min;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] houses = {1,2,3,4};
        int[] heaters = {1,4};
        int ret = findRadius(houses,heaters);
        System.out.println(ret);
    }
}
