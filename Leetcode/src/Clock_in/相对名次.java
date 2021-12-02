package Clock_in;

import com.sun.org.apache.xpath.internal.axes.OneStepIteratorForward;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-02
 * Time: 13:13
 */

/**
 * 排序 + 哈希
 * 1. 克隆一个数组array用于排序
 * 2. 存入哈希表(key,value) = (数组,名次)
 * 3. 再遍历原数组score，取出名次，前三名用String数组表示
 */
public class 相对名次 {
    public static String[] findRelativeRanks(int[] score) {  //score = [10,3,8,9,4]
        String[] ret = new String[score.length];
        String[] medal = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        if(score.length == 0) return ret;
        int len = score.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] array = score.clone();
        int value = 0;
        Arrays.sort(array);
        for (int i = len-1; i >= 0 ; i--) {
            value++;
            map.put(array[i],value);
        }
        for (int i = 0; i < score.length; i++) {
            int rank = map.get(score[i]);
            if(rank <= 3){
                ret[i] = medal[rank-1];
            }else{
                ret[i] = String.valueOf(rank);
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] score = {5,4};
        String[] ret = new String[score.length];
        ret = findRelativeRanks(score);
        for(int i = 0; i < ret.length; i++){
            System.out.print(ret[i] );
        }
    }
}

