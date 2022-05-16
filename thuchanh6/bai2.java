import java.io.*;
import java.util.*;

public class bai2 {

    public static class vector {
        double[] a;
        int n;

        vector(int n) {
            this.n = n;
            a = new double[n];
        }

        vector(int n, double[] a) {
            this.n = n;
            this.a = a;
        }

        int size() {
            return n;
        }
        
        vector cong(vector b) {
            vector c = new vector(n);
            for (int i = 0; i < n; i++) {
                c.a[i] = a[i] + b.a[i];
            }
            return c;
        }

        vector tru(vector b) {
            vector c = new vector(n);
            for (int i = 0; i < n; i++) {
                c.a[i] = a[i] - b.a[i];
            }
            return c;
        }

        vector nhan(double b) {
            vector c = new vector(n);
            for (int i = 0; i < n; i++) {
                c.a[i] = a[i] * b;
            }
            return c;
        }

        vector donvi() {
            vector c = new vector(n);
            double d = 0;
            for (int i = 0; i < n; i++) {
                d += a[i] * a[i];
            }
            d = Math.sqrt(d);
            for (int i = 0; i < n; i++) {
                c.a[i] = a[i] / d;
            }
            return c;
        }
        
        String to_String() {
            String s = "";
            for (int i = 0; i < n; i++) {
                s += a[i] + " ";
            }
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        vector a = new vector(n);
        vector b = new vector(n);
        for (int i = 0; i < n; i++) {
            a.a[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            b.a[i] = sc.nextDouble();
        }
        vector c = a.cong(b);
        vector d = a.tru(b);
        vector e = a.nhan(2);
        vector f = a.donvi();
        System.out.println(c.to_String());
        System.out.println(d.to_String());
        System.out.println(e.to_String());
        System.out.println(f.to_String());
    }
}