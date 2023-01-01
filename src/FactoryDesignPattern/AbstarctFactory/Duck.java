package FactoryDesignPattern.AbstarctFactory;

public class Duck implements AnimalFamily {

    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Duck";
    }
}
