package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-08
 * Time: 17:57
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("显示书籍");
    }
}
