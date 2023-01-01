package FactoryDesignPattern.SimpleFactory;

public class Client {

    public static void main(String[] args)
    {
        Post post=PostFactory.createPost("news");
        System.out.println("This the post create by post factory  :  "+post);

    }
}
