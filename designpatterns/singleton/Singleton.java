package designpatterns.singleton;
/*

//Eager initialization of Singleton object
public class Singleton {
    private static final Singleton obj = new Singleton();

    //private constructor so that it is not accessible outside
    private Singleton() {}

    public static Singleton getInstance() {
        return obj;
    }
}


//Lazy initialization of Singleton object
public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton obj = new Singleton();

        public static Singleton getInstance() {
            return SingletonHolder.obj;
        }
    }
}

//using synchronized keyword

public class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    //1. Adding synchronized to the function level, this approach slows down the performance
    public synchronized Singleton getInstance1() {
        if (singleton == null) {
            return new Singleton();
        }
        return singleton;
    }

    //2. making block synchronized instead of whole function
    public static Singleton getInstance2() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                    return singleton;
                }
            }
        }
        return singleton;
    }
}
*/

public enum Singleton {
    INSTANCE;

    public void doSomething() {}
}

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
    }
}
