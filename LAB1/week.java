    import java.util.Scanner;
    public class week{
        public static void main(String args[]){
    //Write a program to print the week day for the given day no. of the current month using switch case statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day- ");
        int day = scanner.nextInt();
        switch(day){
            case 1:
            System.out.println("MONDAY");
            break;
            case 2:
            System.out.println("TUESDAY");
            break;
            case 3:
            System.out.println("WEDNESDAY");
            break;
            case 4:
            System.out.println("THURSDAY");
            break;
            case 5:
            System.out.println("FRIDAY");
            break;
            case 6:
            System.out.println("SATURDAY");
            break;
            case 7:
            System.out.println("WEDNESDAY");
            break;
            default:
            System.out.println("Invalid day entered");
        }
        }
    }