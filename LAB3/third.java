import java.util.Scanner;

class Students {
    int roll;
    String name;
    int cgpa;

    Students(String a, int b, int c) {
        roll = b;
        name = a;
        cgpa = c;
    }

    void display() {
        System.out.println("Name- " + name + " Roll- " + roll + " CGPA- " + cgpa);
    }
}

public class third {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total number of students- ");
        int n = in.nextInt();
        
        Students arr[] = new Students[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, roll, cgpa of student " + (i + 1));
            String x = in.next();
            int y = in.nextInt();
            int z = in.nextInt();
            in.nextLine();
            Students obj = new Students(x, y, z);
            arr[i] = obj;
        }

        for (int i = 0; i < n; i++) {
            arr[i].display();
        }

        Students smallest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].cgpa < smallest.cgpa) {
                smallest = arr[i];
            }
        }

        System.out.println("The student with the lowest CGPA is: " + smallest.name);
    }
}
