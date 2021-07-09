package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-08
 * Time: 17:59
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("退出系统");
        System.exit(0);//退出系统
    }
}
