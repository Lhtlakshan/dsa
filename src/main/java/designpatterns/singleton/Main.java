package designpatterns.singleton;

public class Main {
    Singleton s = Singleton.getInstance("kamal");
    Singleton s2 = Singleton.getInstance("Nimal");
    Singleton s3 = Singleton.getInstance("Sunil");


    public static void main(String[] args) {

        Main m = new Main();
        System.out.println(m.s.toString()); //Singleton{name='Chamath'}
        System.out.println(m.s2.toString()); //Singleton{name='Chamath'}
        System.out.println(m.s3.toString()); //Singleton{name='Chamath'}
    }
}
