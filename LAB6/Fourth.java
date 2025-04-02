import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}
class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}
class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}
public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hours:");
        int h = scanner.nextInt();
        System.out.println("Enter minutes:");
        int m = scanner.nextInt();
        System.out.println("Enter seconds:");
        int s = scanner.nextInt();

        try {
            Time t = new Time();
            t.setTime(h, m, s);
            System.out.println("Correct Time -> " + t.getTime());
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

class Time {
    int hours, minutes, seconds;

    public void setTime(int h, int m, int s) throws HrsException, MinException, SecException {
        if (h < 0 || h > 24) {
            throw new HrsException("Invalid hours");
        }
        if (m < 0 || m > 60) {
            throw new MinException("Invalid minutes");
        }
        if (s < 0 || s > 60) {
            throw new SecException("Invalid seconds");
        }
        hours = h;
        minutes = m;
        seconds = s;
    }

    public String getTime() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
