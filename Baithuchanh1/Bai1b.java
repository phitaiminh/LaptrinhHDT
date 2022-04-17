package bai1b;

import java.util.Scanner;


public class Bai1b {
    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Nhap so luong: ");
        n = scanner.nextInt();
        System.out.print("Nhap phan tu:");
        for (int count = 1; count <=n; count++) {
            number = scanner.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("Trung bình cộng = " + avgNumber);
    }
    
}
