package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-19
 * Time: 17:25
 */
public class 找到小镇的法官 {
    public static int findJudge(int n, int[][] trust) {
        int[] in = new int[n+1];
        int[] out = new int[n+1];
        for(int[] person:trust){
            in[person[1]]++;
            out[person[0]]++;
        }
        for(int i = 1; i < n+1; i++){
            if(out[i] == 0 && in[i] == (n-1))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] trust = {{1,2},{2,3}};
        int ret = findJudge(3,trust);
        System.out.println(ret);
    }
}
