package FactoryDesignPattern.AbstarctFactory;

public class Bear implements AnimalFamily {
    @Override
    public String getType() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Bear";
    }
}
