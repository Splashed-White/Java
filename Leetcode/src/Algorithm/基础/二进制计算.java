package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-27
 * Time: 13:46
 */

/**
 * 法一：右移与1
 */

// public class 二进制计算 {
//     public int NumberOf1(int n) {
//         //n=10    0000 0000 0000 0000 0000 0000 0000 1010
//         //n=-1    1111 1111 1111 1111 1111 1111 1111
//         int count = 0;
//         while(n != 0){
//             n = n & (n-1);
//             count++;
//         }
//         return count;
//     }
// }

//2. 测试用例6/9
public class 二进制计算 {
    public int NumberOf1(int n) {
        int count = 0;
        for(int i = 1; i <= 32; i++){
            if((n & 1) == 1){
                count++;
            }
            n = n >> i;
        }
        return count;
    }
}