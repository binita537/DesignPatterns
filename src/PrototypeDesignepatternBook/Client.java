package PrototypeDesignepatternBook;

public class Client {


    public static void main(String[] args) throws CloneNotSupportedException
    {


        BookShop shop1=new BookShop();
        shop1.setShopName("Shop1");
        shop1.loadData();
        System.out.println(shop1);
        System.out.println(shop1.hashCode());

        System.out.println("--------------------------------------------------------------");

        BookShop shop2=(BookShop)shop1.clone();
        shop2.setShopName("Shop2");
        System.out.println(shop2);
        System.out.println(shop2.hashCode());
    }
}
