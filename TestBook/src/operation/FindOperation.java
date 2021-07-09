package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-08
 * Time: 17:49
 */
//操作BookList
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的书名：");
        String name = scanner.nextLine();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(name.equals(book.getName())) {
                System.out.println("找到此书如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
