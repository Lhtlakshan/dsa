package designpatterns.singleton;

public class Singleton2 {

    //Thread safe
    private int age;
    private Singleton2(int age){
        this.age = age;
    }

    private static Singleton2 instance;

    public static Singleton2 getInstance(int age){
//        return instance == null ? instance = new Singleton2(age): instance;
        //thread safe

        if(instance == null){
            synchronized(Singleton2.class){
                if(instance == null){
                    return instance = new Singleton2(age);
                }
            }
        }

        return instance;
    }

    public String toString(){
        return "Singleton2 { " + age + " }";
    }
}
