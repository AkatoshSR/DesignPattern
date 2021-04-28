package SimlpeSingleton;

public class Singleton {

    // 普通的单例模式
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }

}
