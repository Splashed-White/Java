package Algorithm.贪心;

import sun.awt.EventQueueItem;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-17
 * Time: 17:18
 */
public class 分发饼干 {
    public int findx(int[]g,int num,int[] visit){
        for (int i = 0; i < g.length; i++) {
            if(num >= g[i] && visit[i] == 0)
                return i;
        }
        return -1;
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int count = 0;
        int[] visit = new int[g.length];
        for (int i = 0; i < s.length; i++) {
            int num = s[i];
                int index = findx(g,num,visit);
                if(index != -1){
                    visit[index] = -1;
                    count++;
                }
            }
        return count;
    }
}
