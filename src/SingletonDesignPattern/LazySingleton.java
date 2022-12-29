package SingletonDesignPattern;

public class LazySingleton {

    //volatile -if multiple thread accessing this var value
    // then they will refer main memory (rather than cache) to check value
   private static volatile LazySingleton INSTANCE;

    //I dont want some create instance or override this class
    private LazySingleton()
    {
    }

    //if two thread are try to access this method ,So we used Synachronized keyowrd
    //Synchronized kleyword allow only one theread
    public static LazySingleton getInstance()
    {
        if (INSTANCE == null)
        {
            synchronized (LazySingleton.class)
            {
                if (INSTANCE==null)
                {
                    INSTANCE=new LazySingleton();

                }
            }

        }
        return INSTANCE;
    }
}
