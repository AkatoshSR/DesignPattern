package duobleCheckedLocking;

public class Singleton {

    // 双重检查加锁Singleton
    // volatile关键字确保，当uniqueInstance变量被初始化成
    // Singleton实例时，多个线程正确的处理uniqueInstance变量
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm not a thread safe Singleton!";
    }

}
