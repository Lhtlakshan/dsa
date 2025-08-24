package solid;

public class LSP {

    // Liskov substitution principle
    // Derived or child classes must be substitutable for their base or parent classes

}

interface Bird {}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void fly() { System.out.println("Sparrow flying"); }
}

class Ostrich implements Bird {
    // Ostrich doesn't implement fly
}