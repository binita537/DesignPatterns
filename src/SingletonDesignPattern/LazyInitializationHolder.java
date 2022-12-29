package SingletonDesignPattern;

public class LazyInitializationHolder {


    private LazyInitializationHolder() {

    }

    private static class RegistryHolder {
        static final LazyInitializationHolder INSTANCE = new LazyInitializationHolder();
    }

    public static LazyInitializationHolder getInstance()
    {
        return RegistryHolder.INSTANCE;
    }

}
