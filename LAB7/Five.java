import java.io.*;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int charCount = 0;
            int lineCount = 0;
            int wordCount = 0;
            String line;
            
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                
             
                if (!line.trim().isEmpty()) {
                    wordCount += line.trim().split("\\s+").length;
                }
            }
            
           
            System.out.println("No. of characters - " + charCount);
            System.out.println("No. of lines - " + lineCount);
            System.out.println("No. of words - " + wordCount);
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: File '" + fileName + "' not found.");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}