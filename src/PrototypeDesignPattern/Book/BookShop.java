package PrototypeDesignPattern.Book;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {


    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    public void loadData() {
        for (int i = 1; i <= 10; i++) {
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book" + i);
            getBooks().add(b);
        }
    }

    // its shadow copy created ,means only object created and having two references
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


/*
    //Deep Clone ,It will create two object
    @Override
    protected BookShop clone() throws CloneNotSupportedException {

        BookShop shop=new BookShop();
        for (Book b:this.getBooks())
        {
            shop.getBooks().add(b);
        }
      return shop;
    }
}*/

}