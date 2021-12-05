package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-05
 * Time: 13:02
 */
public class 超级次方 {
    public static int superPow(int a, int[] b) {
        int mod = 1337;
        int result = 1;
        int x = a % mod;
        for (int i = b.length-1; i >= 0; i--) {
            int y = b[i];
            result = result * quick_mul(x,y)%mod;
            x = quick_mul(x,10);
        }
        return result;
    }
    //快速幂
    public static int quick_mul(int x,int n){
        int res = 1;
        int base = x;
        while(n != 0) {
            if ((n&1) == 1) {
                res = (res * base) % 1337;
            }
            base = (base * base)%1337;
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 2147483647;
        int[] b = {2,0,0};
        int ret = superPow(a,b);
        System.out.println(ret);
    }
}
