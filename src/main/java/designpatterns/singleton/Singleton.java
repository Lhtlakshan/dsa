package designpatterns.singleton;

public class Singleton {

    private String name;
    private Singleton(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }

    private static Singleton instance;
    public static Singleton getInstance(String name){
        //check whether 1 object will be created or not
        return instance == null ? instance = new Singleton(name): instance;
    }
}
