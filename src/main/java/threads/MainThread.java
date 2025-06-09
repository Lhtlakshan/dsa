package threads;

class First extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("First thread");
        }
    }
}

class Second extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Second thread");
        }
    }
}

class Count {
    public int count;

    public void increment(){
        count++;
    }
}

public class MainThread {
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();

        first.start();
        second.start();
    }


}

