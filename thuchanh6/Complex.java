package complex;

import java.util.Scanner;

    

public class Complex {
    // Thuoc tinh
    private double a;
    private double b;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Complex() {
        a = 0;
        b = 0;
    }

    // Ham khoi tao co doi so
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Ham nhap so phuc
    public void nhap(Scanner sc) {
        System.out.print("\tNhap vao phan thuc: ");
        a = sc.nextDouble();
        System.out.print("\tNhap vao phan ao: ");
        b = sc.nextDouble();
    }

    // Ham hien thi so phuc
    public void hienThi() {
        if (b < 0) {
            System.out.println(a + " - " + Math.abs(b) + "*j");
        } else {
            System.out.println(a + " + " + b + "*j");
        }
    }
    
    
     // Ham cong 2 so phuc
    public Complex cong(Complex s2) {
        double thuc = a + s2.a;
        double ao = b + s2.b;
        return new Complex(thuc, ao);
    }

    // Ham tru 2 so phuc
    public Complex tru(Complex s2) {
        double thuc = a - s2.a;
        double ao = b - s2.b;
        return new Complex(thuc, ao);
    }

    // Ham nhan 2 so phuc
    public Complex nhan(Complex s2) {
        double thuc = a * s2.a - b * s2.b;
        double ao = a * s2.b + s2.a * b;
        return new Complex(thuc, ao);
    }

    // Ham chia 2 so phuc
    public Complex chia(Complex s2) {
        double thuc = (a * s2.a + b * s2.b) / (s2.a * s2.a + s2.b * s2.b);
        double ao = (s2.a * b - a * s2.b) / (s2.a * s2.a + s2.b * s2.b);
        return new Complex(thuc, ao);
    }
    
    public double modun() {
        return Math.sqrt(a * a + b* b);
    }
    
    public String sosanh (Complex s2) {
        if (a == s2.a && b == s2.b)
            System.out.println("bang nhau");
        else
            System.out.println("ko bang nhau");
        return null;
    }
    
    public Complex Nhanthuc(int t) {
        double thuc = a * t;
        double ao = b * t;
        return new Complex(thuc, ao);
    }
    
    

    public static void main(String[] args) {
        int t;
        System.out.print("Nhap t: ");
        Scanner x = new Scanner(System.in);
        t = x.nextInt();
        
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Complex s1 = new Complex();
        Complex s2 = new Complex();
        Complex Tong = new Complex();
        Complex Hieu = new Complex();
        Complex Tich = new Complex();
        Complex Thuong = new Complex();
        Complex Nhanthuc = new Complex();
        

        // Nhap
        System.out.println("Nhap vao so phuc 1:");
        s1.nhap(sc);
        System.out.println("Nhap vao so phuc 2:");
        s2.nhap(sc);

        // Hien thi
        System.out.println("So phuc 1 la:");
        s1.hienThi();
        System.out.println("So phuc 2 la:");
        s2.hienThi();
        
        s1.toString();

        // tong
        Tong = s1.cong(s2);
        System.out.println("Ket qua cua phep cong s1 cho s2 la:");
        Tong.hienThi();
        
        
        //hieu
        Hieu = s1.tru(s2);
        System.out.println("Ket qua cua phep tru s1 cho s2 la:");
        Hieu.hienThi();
        
        
        //tich
        Tich = s1.nhan(s2);
        System.out.println("Ket qua cua phep nhan s1 cho s2 la:");
        Tich.hienThi();
        
        
        //chia
        Thuong = s1.chia(s2);
        System.out.println("Ket qua cua phep chia s1 cho s2 la:");
        Thuong.hienThi();
        
        Nhanthuc = s1.Nhanthuc(t);
        System.out.println("Ket qua cua phep nhan s1 voi so thuc la:");
        Nhanthuc.hienThi();
        
        

        sc.close();
    }
}
    

