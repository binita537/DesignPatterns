package FactoryDesignPattern.FactoryMethod;

public class TextMessageCrerator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
