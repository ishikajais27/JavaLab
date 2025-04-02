public class Second {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch block");
        } finally {
            System.out.println("This is the finally block");
        }
    }
}
