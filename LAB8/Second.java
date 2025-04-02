class Counter {
    synchronized void printCount(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread {
    Counter counter;

    Thread1(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        counter.printCount("Thread1");
    }
}
class Thread2 extends Thread {
    Counter counter;

    Thread2(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        counter.printCount("Thread2");
    }
}
public class Second {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread1 t1 = new Thread1(counter);
        Thread2 t2 = new Thread2(counter);

        t1.start();
        t2.start();
    }
}
