package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-08
 * Time: 17:17
 */
public abstract class User {
    protected String name;

    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    //
    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);
    }

}

