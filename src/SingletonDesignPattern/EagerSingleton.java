package SingletonDesignPattern;

public class EagerSingleton {

    private static final EagerSingleton INSTANCE=new EagerSingleton();

    //I dont want some create instance or override this class
    private EagerSingleton()
    {

    }
    public static EagerSingleton getInstance()
    {
        return INSTANCE;
    }

}
