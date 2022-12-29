package SingletonDesignPattern;

public class Client {

    public static void main(String args[]) {

        //=========================================EagerSingleton=============================================//
        //First time and only one object is created
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);

        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton2);


        //======================================LazySingleton================================================//
        LazySingleton lazySingleton1=LazySingleton.getInstance();
        System.out.println(lazySingleton1);

        LazySingleton lazySingleton2=LazySingleton.getInstance();
        System.out.println(lazySingleton2);




        //======================================LazySingleton================================================//
       LazyInitializationHolder lazyInitializationHolder1=LazyInitializationHolder.getInstance();
        System.out.println(lazyInitializationHolder1);

        LazyInitializationHolder lazyInitializationHolder2=LazyInitializationHolder.getInstance();
        System.out.println(lazyInitializationHolder2);











    }
}
