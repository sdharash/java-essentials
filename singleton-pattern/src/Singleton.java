//public class Singleton {
//
//    private Singleton instance = null;
//
//    // private constructor so that no object creation is allowed outside of the class
//    private Singleton() {}
//
//    public Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

// We can introduce synchronization to make the implementation thread safe

public class Singleton {
    private Singleton instance = null;

    private Singleton() {}

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
