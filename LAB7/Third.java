// Aim of the program - Write a program in Java to copy the content of a given file to another
// user entered file using character stream (using File Reader and FileWriter Classes) and
// byte Stream (using FileInputStream and FileOutputStream Class).
import java.io.*;
public class Third{
    public static void main(String args[]){
        String source = "SourceFile.txt";
        String destination = "DestinationFile.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(source));
         BufferedWriter writer = new BufferedWriter(new FileWriter(destination))
        ){
            String line;
            while((line = reader.readLine())!=null){
              writer.write(line);
              writer.newLine();;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}