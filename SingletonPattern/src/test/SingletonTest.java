package test;


import SimlpeSingleton.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());

    }
}
