package FactoryDesignPattern.FactoryMethod;
public class JSONMessage extends Message{


    @Override
    public String getContent() {
        return "{[JSONMessage]}";
    }
}
