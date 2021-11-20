import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-17
 * Time: 13:25
 */
class Card {
    private int rank; //数字
    private String suit; //花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return " [数值：" + rank + " 花色："+suit+"] ";
    }
}
class CardDemo {
    private static final String[] suits = {"♥","♠","♦","♣"};
    //一副牌放在集合中
    public List<Card> buyDesk() {
        List<Card> desk = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                int rank = j;
                String suit = suits[i];
                Card card = new Card(rank,suit);
                desk.add(card);
            }
        }
        return desk;
    }
    public void swap(List<Card> desk,int i,int index) {
        //Card tmp = desk[i];//数组
        Card tmp = desk.get(i); //list取元素
        //desk[i] = desk[index];
        desk.set(i,desk.get(index));
        //desk[index] = tmp;
        desk.set(index,tmp);
    }
    //洗牌
    public void shuffle(List<Card> desk) {
        int len = desk.size();
        for (int i = len-1; i > 0 ; i--) {
            Random random = new Random();
            int index = random.nextInt(i);
            swap(desk,i,index);
        }
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();
        List<Card> desk = cardDemo.buyDesk();
        System.out.println(desk);
        System.out.println("洗牌：");
        cardDemo.shuffle(desk);
        System.out.println(desk);

        System.out.println("开始玩儿-》揭牌：");

        ArrayList<Card> hand1 = new ArrayList<>();
        ArrayList<Card> hand2 = new ArrayList<>();
        ArrayList<Card> hand3 = new ArrayList<>();

        ArrayList< ArrayList<Card>  > hand = new ArrayList<>();
        hand.add(hand1);
        hand.add(hand2);
        hand.add(hand3);

        //j -> 3个人 每个人轮流抓5张牌
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card card = desk.remove(0);
                hand.get(j).add(card);
            }
        }
        System.out.println("=======================");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i));
        }

        System.out.println("============剩下的牌：===========");
        System.out.println(desk);

//        //最外层如果树人  这个循环代表，每个人先揭5张牌
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//
//            }
//        }



    }
}
