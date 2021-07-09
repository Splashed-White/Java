package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-08
 * Time: 17:01
 */
public class BookList {

    private Book[] books = new Book[10];
    private int usedSize;

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",17,"小说");
        books[1] = new Book("西游记","吴承恩",47,"小说");
        books[2] = new Book("水浒传","施耐庵",37,"小说");
        this.usedSize = 3;
    }

    /*
    默认放到顺序表的最后的
     */
    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }


}

