/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-12
 * Time: 17:38
 */
public class Example{
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}