package sortnumber;


import java.util.Scanner;
public class Sortnumber {
    public static void main(String[] args) {
        int num, i, j, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong:");
        num = input.nextInt();
        int array[] = new int[num];
        System.out.println("Nhap phan tu:");
        for (i = 0; i < num; i++)
            array[i] = input.nextInt();
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Ket qua sau khi sap xep: ");
        for (i = 0; i < num; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.println("----------------------------");     
    }
}
    
