// Aim of the program - Write a java program which will accept students details like Student
// RollNo, Name, Subject, Marks from the keyboard using scanner class, stored the same in
// a file. Again open the file, read the content and display all.
// Input: Enter student details - Rollno, name, subject, marks
// Enter the name of existing file to which student details will be written.
// Output: Display the content of existing file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Second {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the details of the student- ");
        int roll = in.nextInt();
        in.nextLine();
        String name = in.nextLine();
        String sub = in.nextLine();
        int marks = in.nextInt();
         
        //First create a file or get a file if it is already exsist 
        try {
            FileWriter file = new FileWriter("SourceFile.txt");
            file.write("Student Details\nRoll- "+roll+"\nName- "+name+"\nSubject- "+sub+"\nMraks- "+marks);
             file.close();
             //after closing file of writing then start reading
              Scanner fileReader = new Scanner(new File("SourceFile.txt"));
          while(fileReader.hasNextLine()) {
        System.out.println(fileReader.nextLine());
    }
    fileReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    

    }
}
