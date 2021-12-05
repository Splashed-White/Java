package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-05
 * Time: 14:29
 */
public class 快速幂 {
    private static int pow(int n, int m){

    int res = 1;
    int base = n;
    while(m != 0) {
        if ((m&1) == 1) {
            res = res * base;
        }
        base = base * base;
        m = m >> 1;
    }
    return res;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 10;
        int ret = pow(n,m);
        System.out.println(ret);
    }
}
