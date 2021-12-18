package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-17
 * Time: 15:51
 */
public class 换酒问题 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int b = numExchange;
        while(numBottles/numExchange != 0){
            sum += numBottles/numExchange;
            numBottles = numBottles/numExchange + numBottles%numExchange;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ret = numWaterBottles(9,3);
        System.out.println(ret);
    }
}
