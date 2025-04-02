import java.io.*;
public class First {
    public static void main(String[] args) {
        try {
        
            FileReader fr = new FileReader("C:\\Users\\KIIT0001\\OneDrive\\JAVALAB\\LAB8\\sourecfiles.txt");
            FileWriter fw = new FileWriter("C:\\Users\\KIIT0001\\OneDrive\\JAVALAB\\LAB8\\destinationfile.txt");
            
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            fr.close();
            fw.close();
            // FileInputStream fis = new FileInputStream("sourcefiles.txt");
            // FileOutputStream fos = new FileOutputStream("destinationfile.txt");
            
            // int byteData;
            // while ((byteData = fis.read()) != -1) {
            //     fos.write(byteData);
            // }  
            // fis.close();
            // fos.close();
            // System.out.println("File Copied");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
