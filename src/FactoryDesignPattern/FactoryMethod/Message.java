package FactoryDesignPattern.FactoryMethod;

public abstract class Message {

    public abstract String getContent();

    public void addDeafultHeader()
    {
        System.out.println("This is my deafult header");
    }
    public void encrypt()
    {
        System.out.println("Thios is my encrypt");
    }
}
