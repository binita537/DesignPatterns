package FactoryDesignPattern.AbstarctFactory;

public class MainFactory {

    public static void main(String args[])
    {
      System.out.println( getFactory("color"));
      System.out.println(getFactory("animal"));


    }

    public static AbstactFamily getFactory(String choice)
    {
      if(choice.equalsIgnoreCase("Animal"))
      {
          return new AnimalFamilyFactory();
      }
      else if(choice.equalsIgnoreCase("Color"))
      {
          return new ColorFamilyFactory();
      }
        return null;
    }
}
