package matrix2;

import java.util.Scanner;

public class Matrix2 {
    
    
    private static class Matrix {
    // Gioi han so hang va so cot
    private final int SIZE = 50;

    // Thuoc tinh
    private int m; // so hang
    private int n; // so cot
    private int[][] a;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Matrix() {
        m = 0;
        n = 0;
        a = new int[m][n];
    }

    // Ham khoi tao co doi so
    public Matrix(int m, int n) {
        if (m >= SIZE || n >= SIZE) {
            m = 3;
            n = 3;
            a = new int[m][n];
        } else {
            this.m = m;
            this.n = n;
            a = new int[m][n];
        }
    }

    // Ham lay thong tin so hang
    public int getRowNum() {
        return m;
    }

    // Ham lay thong ton so cot
    public int getColNum() {
        return n;
    }

    // Nhap ma tran
    public void enterMatrix(Scanner sc) {
        System.out.print("Nhap vao so hang: ");
        m = sc.nextInt();
        System.out.print("Nhap vao so cot: ");
        n = sc.nextInt();
        a = new int[m][n];
        System.out.println("Nhap vao gia tri cho ma tran:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\tPhan tu thu [" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    // Hien thi ma tran
    public void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Cong ma tran
    public Matrix add(Matrix mt2) {
        Matrix mtTong = new Matrix(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mtTong.a[i][j] = a[i][j] + mt2.a[i][j];
            }
        }

        return mtTong;
    }

    // Tru ma tran
    public Matrix sub(Matrix mt2) {
        Matrix mtTru = new Matrix(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mtTru.a[i][j] = a[i][j] - mt2.a[i][j];
            }
        }

        return mtTru;
    }

    // Nhan 2 ma tran
    public Matrix prod(Matrix mt2) {
        Matrix mtTich = new Matrix(m, mt2.n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < mt2.n; j++) {
                mtTich.a[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    mtTich.a[i][j] += a[i][k] * mt2.a[k][j];
                }
            }
        }

        return mtTich;
    }

    // Chuyen vi ma tran
    public Matrix transpose() {
        Matrix mtTran = new Matrix(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mtTran.a[i][j] = a[j][i];
            }
        }

        return mtTran;
    }

    // Hoan doi giua 2 hang h1 va h2
    public void rowSwap(int h1, int h2) {
        for (int i = 0; i < n; i++) {
            int tg = a[h1 - 1][i];
            a[h1 - 1][i] = a[h2 - 1][i];
            a[h2 - 1][i] = tg;
        }
    }

    // Hoan doi giua 2 cot c1 va c2
    public void colSwap(int c1, int c2) {
        for (int i = 0; i < m; i++) {
            int tg = a[i][c1 - 1];
            a[i][c1 - 1] = a[i][c2 - 1];
            a[i][c2 - 1] = tg;
        }
    }

    // Tinh tong phan tu tren hang h
    public int sumRow(int h) {
        int s = 0;

        for (int i = 0; i < n; i++) {
            s += a[h - 1][i];
        }

        return s;
    }

    // Tinh tong phan tu tren cot c
    public int sumCol(int c) {
        int s = 0;

        for (int i = 0; i < m; i++) {
            s += a[i][c - 1];
        }

        return s;
    }

    // Tim phan tu lon nhat cua ma tran
    public int max() {
        int max = a[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }

        return max;
    }

    // Tim phan tu nhho nhat cua ma tran
    public int min() {
        int min = a[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min > a[i][j]) {
                    min = a[i][j];
                }
            }
        }

        return min;
    }

    // Tim phan tu lon nhat cua hang h
    public int maxRow(int h) {
        int max = a[h - 1][0];

        for (int i = 1; i < n; i++) {
            if (max < a[h - 1][i]) {
                max = a[h - 1][i];
            }
        }

        return max;
    }

    // Tim phan tu nho nhat cua hang h
    public int minRow(int h) {
        int min = a[h - 1][0];

        for (int i = 1; i < n; i++) {
            if (min > a[h - 1][i]) {
                min = a[h - 1][i];
            }
        }

        return min;
    }

    // Tim phan tu lon nhat cua cot c
    public int maxCol(int c) {
        int max = a[0][c - 1];

        for (int i = 1; i < m; i++) {
            if (max < a[i][c - 1]) {
                max = a[i][c - 1];
            }
        }

        return max;
    }

    // Tim phan tu nho nhat cua cot c
    public int minCol(int c) {
        int min = a[0][c - 1];

        for (int i = 0; i < m; i++) {
            if (min > a[i][c - 1]) {
                min = a[i][c - 1];
            }
        }

        return min;
    }
}

    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Matrix mt1 = new Matrix();
            Matrix mt2 = new Matrix();
            Matrix mtTong;
            Matrix mtTich;
            int h1, h2;
            // Nhap ma tran
            System.out.println("Nhap vao ma tran thu nhat:");
            mt1.enterMatrix(sc);
            System.out.println("Nhap vao ma tran thu hai:");
            mt2.enterMatrix(sc);
            // Tinh tong 2 ma tran
            mtTong = mt1.add(mt2);
            // Tinh tich 2 ma tran
            mtTich = mt1.prod(mt2);
            // Hien thi
            System.out.println("Ma tran thu nhat vua nhap la:");
            mt1.display();
            System.out.println("Ma tran thu hai vua nhap la:");
            mt2.display();
            System.out.println("Ma tran tong la:");
            mtTong.display();
            System.out.println("Ma tran tich la:");
            mtTich.display();
            // Hoan giua 2 dong h1 va h2 trong ma tran 1
            System.out.println("Hoan doi hang trong ma tran 1:");
            do {
                System.out.print("Nhap vao hang hoan doi thu nhat: ");
                h1 = sc.nextInt();
                System.out.print("Nhap vao hang hoan doi thu hai: ");
                h2 = sc.nextInt();
                
                if (h1 > mt1.getRowNum() || h2 > mt1.getRowNum()) {
                    System.out.println("Hay nhap lai thon tin so hang can hoan doi!");
                }
            } while (h1 > mt1.getRowNum() || h2 > mt1.getRowNum());
            // Hoan doi
            mt1.rowSwap(h1, h2);
            System.out.println("Ma tran 1 sau khi hoan doi la:");
            mt1.display();
            // Hoan doi hang 1 va hang 3 cua mt1
            mt1.colSwap(1, 3); // Minh gia su ma tran vuong 3x3 nhe
            System.out.println("Ma tran 1 sau khi hoan doi cot 1 va cot 2 la:");
            mt1.display();
            // Tinh tong cac phan tu tren hang 3 cua mt1
            mt1.sumRow(3); // Minh gia su ma tran vuong 3x3 nhe
            // Tim max cua mt1
            System.out.println("Phan tu lon nhat cua ma tran 1 la: " + mt1.max());
        }
    }  
}

