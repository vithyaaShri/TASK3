public class Book{
    int bookID;
    String title;
    String author;
    Boolean isavailable;

    public Book(int bookID,String titile,String author){
        this.bookID=bookID;
        this.title=titile;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public int getBookID() {
        return bookID;
    }
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
}