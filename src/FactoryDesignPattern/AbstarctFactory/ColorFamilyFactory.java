package FactoryDesignPattern.AbstarctFactory;

import FactoryDesignPattern.SimpleFactory.BlogPost;
import FactoryDesignPattern.SimpleFactory.NewsPost;
import FactoryDesignPattern.SimpleFactory.ProductPost;

public class ColorFamilyFactory implements AbstactFamily {
    @Override
    public ColorFamily create(String type) {
        switch (type)
        {
            case "Black":
                return new Black();
            case "Brown":
                return new Brown();
            case "White":
                return new White();
            default:
                throw  new IllegalArgumentException();
        }





    }
}
