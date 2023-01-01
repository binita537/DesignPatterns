package FactoryDesignPattern.AbstarctFactory;

public interface AbstactFamily<T> {

     T create(String type);

}
