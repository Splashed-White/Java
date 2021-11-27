package Algorithm.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-03
 * Time: 13:02
 */
public class 二进制手表 {
    public void DFS(int[] light, int start, int num, List<String> result){
        //递归终止条件:  num == 0
        if(num == 0){
            int hour = 1*light[0] + 2*light[1] + 4*light[2] + 8*light[3];
            int minute = 1*light[4] + 2*light[5] + 4*light[6] + 8*light[7] + 16*light[8] + 32*light[9];
            if(hour < 12 && minute < 60){
                result.add(String.format("%d:%02d",hour,minute));//Java字符串格式化:String.format()
            }
            return;
        }
        //剪枝
        for(int i = start; i < light.length; i++){
            ////点亮当前位置的灯,类似于字符串排列问题中的固定操作
            light[i] = 1;
            DFS(light,i+1,num-1,result);
            light[i] = 0;  ////回溯,将上个点亮的灯熄灭
        }

    }

    public List<String> readBinaryWatch(int num) {
        List<String> result =new ArrayList<>();
        //定义一个大小为10的light数组，从0-9表示4盏小时灯+6盏分钟灯
        //初始化为0，后面如果点亮了某盏灯就把该位置置1，0就表示该位置灯灭
        int[] light = new int[10];
        DFS(light,0,num,result);
        return result;
    }
}
