package Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-14
 * Time: 8:39
 */
public class 商品折扣后的最终价格 {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                if(j > i && prices[j] <= prices[i]){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }//for j
        }//for i
        return prices;
    }
}
