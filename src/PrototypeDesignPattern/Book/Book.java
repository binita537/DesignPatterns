package PrototypeDesignPattern.Book;

//https://www.youtube.com/watch?v=nZ76x13Nm8Q&t=5s

public class Book {


    private int bookId;
    private String bookName;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bokkName) {
        this.bookName = bokkName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bokkName='" + bookName + '\'' +
                '}';
    }
}
