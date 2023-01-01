package FactoryDesignPattern.FactoryMethod;

import javax.swing.*;

public abstract class MessageCreator {

    public Message getMessage()
    {
        Message msg=createMessage();
        msg.addDeafultHeader();
        msg.encrypt();
        return msg;
    }

    public abstract Message createMessage();
}
