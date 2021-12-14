package Algorithm.贪心;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-16
 * Time: 20:33
 */

import java.util.Scanner;

/**
 * 假设1元、2元、5元、10元、20元、50元、100元的纸币分别有c0, c1, c2, c3, c4, c5, c6张。
 * 现在要用这些钱来支付 K 元，最少要用多少张纸币？
 * 贪心思想: 每一步尽可能用面值大的纸币即可;
 */
public class 钱币找零 {
    public static int solve(int money, int[][] moneyCount){
        int ret = 0;
        int row = moneyCount.length;
        for (int i = row-1; i > 0 ; i--) {
            // 需要的当前面值数量 与 当前面值的最大数量moneyCount[i][1] 取最小值
            int count = Math.min(money/moneyCount[i][0],moneyCount[i][1]); //count表示需要该面值的数量
            money = money - count * moneyCount[i][0];
            ret += count;
        }
        if(money > 0)
            ret = -1;
        return ret;
    }

    public static void main(String[] args) {
        //存放纸币与数量: first:纸币，second:数量
        int[][] moneyCount = { { 1, 3 }, { 2, 1 }, { 5, 4 }, { 10, 3 }, { 20, 0 }
                ,{50, 1}, { 100, 10 } };
        Scanner scanner = new Scanner(System.in);
        int money;
        System.out.println("请输入要支付的钱");
        money = scanner.nextInt();
        int res = solve(money, moneyCount);
        if (res != -1)
            System.out.println(res);
        else
            System.out.println("No");
    }

}
