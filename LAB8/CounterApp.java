import java.util.Scanner;

class CounterThread extends Thread {
    int lower, upper;

    CounterThread(String name, int lower, int upper) {
        this.setName(name);
        this.lower = lower;
        this.upper = upper;
    }

    public void run() {
        try {
            System.out.println("Thread - " + getName());
            for (int i = lower; i <= upper; i++) {
                System.out.print("Counter - " + i + " ");
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class CounterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the thread: ");
        String name = sc.nextLine();
        System.out.print("Enter Lower range of counter: ");
        int lower = sc.nextInt();
        System.out.print("Enter Upper range of counter: ");
        int upper = sc.nextInt();
        
        CounterThread t = new CounterThread(name, lower, upper);
        t.start();
    }
}
