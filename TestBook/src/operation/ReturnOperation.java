package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-08
 * Time: 17:58
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("归还书籍");
    }
}
