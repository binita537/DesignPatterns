package FactoryDesignPattern.AbstarctFactory;

public class AnimalFamilyFactory implements AbstactFamily{


    @Override
    public AnimalFamily create(String type) {
        switch (type)
        {
            case "Duck":
                return new Duck();
            case "Bear":
                return new Bear();
            case "Dog":
                return new Dog();
            default:
                throw  new IllegalArgumentException();
        }
    }
}
