package threads;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
//        Thread1 t1 = new Thread1();
//        Thread1 t2 = new Thread1();
//
//        t1.start();
//        t2.start();
//
//        Thread t3 = new Thread(new MyRunnable(), "Task-A");
//        Thread t4 = new Thread(new MyRunnable(), "Task-B");
//
//        t3.start();
//        t4.start();

        Counter c = new Counter();
        BankAccount b = new BankAccount();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) c.increment();
            b.withdraw(200);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
            b.withdraw(300);
        });

        System.out.println(t1.getState());
        t1.start();
        t2.start();

        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());

        t2.join();

        System.out.println("Final count = " + c.count);

        Thread t5 = new Thread(() -> {
            for (int i = 1; i <= 2; i++) {
                System.out.println(Thread.currentThread().getName() + " → " + i);
                try {
                    Thread.sleep(500); //Pauses the thread for a given time.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Lambda-Thread");

        t5.start();
        t5.join();  // main waits until t1 finishes
        System.out.println("✅ Worker done, now main continues");
        System.out.println(b.getBalance());
    }
}


class Thread1 extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            Thread.currentThread().setName("Hello");
            System.out.println(Thread.currentThread().getName() + " → " + i);
        }
    }

}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " → " + i);
        }
    }
}

class Counter {
    int count = 0;
    public synchronized void increment() { // synchronized for thread safe
        count++;
    } //When two or more threads access shared data at the same time
}

class BankAccount {
    public int getBalance() {
        return balance;
    }

    private int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) { // lock only this section
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount);
            }
        }

        int sum = 20;
        sum += 20;
        System.out.println(sum);
    }
}
