import java.util.Scanner;

class NumberPrinter extends Thread {
    int start, end;

    NumberPrinter(String threadName, int start, int end) {
        this.setName(threadName);
        this.start = start;
        this.end = end;
    }

    public void run() {
        try {
            System.out.println("Executing Thread: " + getName());
            for (int num = start; num <= end; num++) {
                System.out.println("Current Count: " + num);
                Thread.sleep(10);
            }
        } catch (InterruptedException ex) {
            System.out.println("Thread Interrupted: " + ex);
        }
    }
}

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter thread name: ");
        String threadName = input.nextLine();
        System.out.print("Enter starting number: ");
        int start = input.nextInt();
        System.out.print("Enter ending number: ");
        int end = input.nextInt();
        
        NumberPrinter thread = new NumberPrinter(threadName, start, end);
        thread.start();
    }
}
