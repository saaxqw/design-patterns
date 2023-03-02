package creational.singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    public Singleton(){

    }

    public static Singleton getUniqueInstance() {
        return uniqueInstance;
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            return new Singleton();
        }
        return uniqueInstance;
    }

    public void getDescription(){
        System.out.println("I am simple Singleton");
    }
}
