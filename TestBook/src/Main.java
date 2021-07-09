import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-08
 * Time: 18:00
 */
public class Main {

    //登录方法
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1-》管理员 0：普通用户");
        int choice  = scanner.nextInt();
        if(choice == 1) {
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }


    public static void main(String[] args) {
        // 1. 准备基本的数据
        BookList bookList = new BookList();

        //2. 创建用户
       User user = login();  //向上转型
       //此时已知user引用的是AdminUser还是AdminUser

        while(true){
            int choice = user.menu(); //动态绑定
            //根据菜单的选项来调用合适的方法
            user.doOperation(choice, bookList);
        }
    }
}
