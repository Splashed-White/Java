package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-05
 * Time: 14:29
 */

/**
 * 位运算迭代
 */
//public class 快速幂 {
//    private static int pow(int n, int m){
//
//    int res = 1;
//    int base = n;
//    while(m != 0) {
//        if ((m&1) == 1) {
//            res = res * base;
//        }
//        base = base * base;
//        m = m >> 1;
//    }
//    return res;
//    }
//
//    public static void main(String[] args) {
//        int n = 2;
//        int m = 10;
//        int ret = pow(n,m);
//        System.out.println(ret);
//    }
//}

/**
 * 递归计算
 */

public class 快速幂 {
    private static int pow(int a, int b){
        //指数为奇数 a^b = a * a ^(b-1)
        //指数为偶数 a^b = a^(b/2) * a^(b/2)
        if(b == 1){
            return a; //递归边界
        }
        if(b % 2 == 1){
            return pow(a,b-1) * a;
        }else{
            int temp = pow(a,b/2);
            return temp * temp;
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 10;
        int ret = pow(n,m);
        System.out.println(ret);
    }
}

