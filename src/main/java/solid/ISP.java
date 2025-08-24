package solid;

public class ISP {
    //No client should be forced to implement methods it doesn’t use.
    //Instead of one big interface, use many small, specific interfaces.
}
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() { System.out.println("Human working"); }
    public void eat() { System.out.println("Human eating"); }
}

class Robot implements Workable {
    public void work() { System.out.println("Robot working"); }
}
