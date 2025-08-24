package solid;

public class SRP {

    // A class should have only one reason to change
    public static void main(String[] args) {
        BreadBaker b = new BreadBaker();
        b.bakeBread();
    }

}

// Class for baking bread
class BreadBaker {
    public void bakeBread() {
        System.out.println("Baking high-quality bread...");
    }
}

// Class for managing inventory
class InventoryManager {
    public void manageInventory() {
        System.out.println("Managing inventory...");
    }
}