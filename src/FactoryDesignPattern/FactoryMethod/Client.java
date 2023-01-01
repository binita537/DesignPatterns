package FactoryDesignPattern.FactoryMethod;

public class Client {


    public static void main(String[] args)
    {
        printMessage(new TextMessageCrerator());
        printMessage(new JSONMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator)
    {
       Message message= messageCreator.createMessage();
       System.out.println(message);
    }
}
