package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-03
 * Time: 16:46
 */
public class 一周中的第几天 {
    //19710101 星期四
    public String dayOfTheWeek(int day, int month, int year) {
        String[] mon = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] Day = {31,28,31,30,31,30,31,31,30,31,30,31};
        int ret = 4;
        for(int i = 1971; i < year; i++){
            boolean isLeap = (i%4==0 && i%100!=0)||(i%400==0);
            ret += isLeap == true ? 366 : 365;
        }
        for(int j = 1; j < month; j++){
            ret += Day[j-1];
            boolean isLeap = (year%4==0 && year%100!=0)||(year%400==0);
            if(isLeap == true && j == 2){
                ret += 1;
            }
        }
        ret += day;
        return mon[ret%7];
    }
}
