package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-21
 * Time: 11:22
 */
public class 一年中的第几天 {
    public boolean isLeap(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year  % 400 == 0)) return true;
        return false;
    }
    public int dayOfYear(String date) {
        int[] num = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //String[] array = date.split("-");
        int ret = 0;
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        boolean flag = isLeap(year);
        num[1] = (flag == true) ? 29:28;
        for(int i = 0; i < month-1; i++){
            ret += num[i];
        }
        return ret + day;
    }
}
