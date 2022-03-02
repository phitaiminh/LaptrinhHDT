package matrix;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Matrix {
    public static void main(String[] args) throws IOException {
        String m, n;
        m = "matran1.txt";
        FileInputStream fileInputStream1 = new FileInputStream(m);
        Scanner scanner1 = new Scanner(fileInputStream1);

        try {
            while (scanner1.hasNextLine()) {
                System.out.println(scanner1.nextLine());
            }
        } finally {
            try {
                scanner1.close();
                fileInputStream1.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFileWithBufferedReader.class.getName())
                                .log(Level.SEVERE, null, ex);
            }  
        }
        System.out.println("\n");
        
        n = "matran2.txt";
        FileInputStream fileInputStream2 = new FileInputStream(n);
        Scanner scanner2 = new Scanner(fileInputStream2);

        try {
            while (scanner2.hasNextLine()) {
                System.out.println(scanner2.nextLine());
            }
        } finally {
            try {
                scanner2.close();
                fileInputStream2.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFileWithBufferedReader.class.getName())
                                .log(Level.SEVERE, null, ex);
            }
        } 
        
    }
}
    

