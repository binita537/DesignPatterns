package FactoryDesignPattern.FactoryMethod;

public class TextMessage extends Message{

    @Override
    public String getContent() {
        return "{[TsxtMessage]}";
    }
}
