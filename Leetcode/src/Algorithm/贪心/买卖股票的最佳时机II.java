package Algorithm.贪心;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-16
 * Time: 17:02
 */

/**
 * 思路：找连续上涨日,在连续上涨日的第一天买入,最后一天卖出,则利润最大;
 *      连续下降日不做交易,则不会赔,
 *      遍历数组,利用相邻两数的差值与0比较,来判断是否为递增序列;
 */
public class 买卖股票的最佳时机II {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            int num = prices[i]-prices[i-1];
            if(num > 0){
                count += num;
            }
        }
        return count;
    }
}










