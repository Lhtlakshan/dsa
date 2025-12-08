package threads.deadlock;

class Pen {}
class Paper {}

public class DeadlockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Writer1(pen, paper);
        Thread t2 = new Writer2(pen, paper);

        t1.start();
        t2.start();

    }
}

class Writer1 extends Thread {
    private Pen pen;
    private Paper paper;

    public Writer1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    public void run() {
        synchronized (pen){
            System.out.println("Writer2 locked the pen");
            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (paper){
                System.out.println("Writer2 locked the pen");
            }
        }
    }
}

class Writer2 extends Thread {
    private Pen pen;
    private Paper paper;

    public Writer2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    public void run() {
        synchronized (paper) {
            System.out.println("Writer2 locked the paper");
            try { Thread.sleep(100); } catch (Exception e) {}
            synchronized (pen) {
                System.out.println("Writer2 locked the pen");
            }
        }
    }
}



