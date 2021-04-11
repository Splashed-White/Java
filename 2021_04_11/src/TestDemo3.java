import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-11
 * Time: 11:09
 */
public class TestDemo3 {
    /**
     * Hanoi
     * 规定:在小圆盘上都不能放大圆盘，且在三根柱子之间一次只能移动一个圆盘
     * 要求：起始柱A、辅助柱B、目标柱C
     * @param a
     */
    public static void move(char a,char c){
        System.out.print(a + "—>" + c + " ");
    }
    public static void hanoi(int n,char a,char b,char c){
        if(n == 1){
            move(a,c);
        }else{
            hanoi(n-1,a,c,b);  //A-[C]->B
            move(a,c);
            hanoi(n-1,b,a,c);  //B-[A]->C
        }

    }
    public static void main(String[] args) {
        char a = 'A',b = 'B',c = 'C';
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanoi(n,a,b,c); // A-[B]->C
    }
}
