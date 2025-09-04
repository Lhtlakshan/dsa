package threads;

class First extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("First thread");
        }
    }
}

class Second implements Runnable{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Second thread");
        }
    }
}

class Count {
    public int count;

//    Problem: Two threads access the same data at the same time → data may get corrupted.
//
//Solution: Use synchronized keyword to lock critical sections.
    synchronized void increment(){
        count++;
    }
}

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        // normal threads
        First first = new First();
        Thread second = new Thread(new Second());

//        first.start();
//        second.start();


        // new threads for use same data in different threads
        Count c = new Count();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 20; i++) {
                c.increment();
                System.out.println("t1 = " + c.count);
                Thread.yield(); //simple interval but it can be run or not run after another thread run
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 20; i++) {
                c.increment();
                System.out.println(c.count);
            }
        });

        t1.start();
        t2.start();
        t1.join(); // wait until t1 execute
        t2.join(); // wait until t2 execute

        System.out.println(c.count);
    }
}



