package String;
import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-25
 * Time: 10:14
 */
public class 二进制求和 {
    /**
     * 好像是长整型也存不下数据
     */
    /*//二进制转十进制
    public int Revert(String str){
        int len = str.length();
        int sum = 0;
        for (int i = 0; i <= len-1; i++) {
            char ch = str.charAt(i);
            if(ch == '1'){
                sum += Math.pow(2,len-i-1);
            }
        }//for
        System.out.println("sum = " + sum);
        return sum;
    }
    public String addBinary(String a, String b){
        long m = Revert(a);
        long n = Revert(b);
        long num = m + n;
        StringBuffer ret = new StringBuffer();
        while(num != 0){
            ret.append(num%2);
            num = num / 2;
        }
        if(ret.length() == 0){
            ret.append(0);
        }
        ret.reverse();
        return ret.toString();
    }*/
    public String addBinary(String a, String b) {
        BigInteger aNum =new BigInteger(a,2) ;
        BigInteger bNum =new BigInteger(b,2) ;
        BigInteger ans = aNum.add(bNum);
        return ans.toString(2);
    }
}
