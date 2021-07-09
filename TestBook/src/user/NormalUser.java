package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-08
 * Time: 17:17
 */
public class NormalUser extends User{

    public NormalUser(String name) {
        super(name);
        //就把普通用户的操作，存储到这个接口数组当中
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
        };

    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============普通用户菜单===============");
        System.out.println("hello "+this.name+" 欢迎来到图书小练习！");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=====================================");
        int choice = scanner.nextInt();
        return choice;
    }

}

