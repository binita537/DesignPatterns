package FactoryDesignPattern.AbstarctFactory;

public class Dog implements AnimalFamily {

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Dog";
    }
}
