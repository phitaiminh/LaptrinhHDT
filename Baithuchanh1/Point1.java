package point1;

//bai3

public class Point1 extends Point{
    private double z;
    
    public Point1(){
        
    }
    
    public Point1(double x , double y , double z){
        super(x,y);
        this.z = z;
    }
    
    public void setZ(double z){
        this.z = z;
    }
    
    public double getZ(){
        return z;
    }
    
    
    public static void phuong_trinh_mat_phang(double a,double b,double c,double d){
        if(a * a + b * b + c * c == 0){
            System.out.println("Khong phai la phuong trinh mat phang");
        }else{
            System.out.println("Phuong trinh mat phang : " + a + "*x + " + b + "*y + " + c + "*z + " + d + " = 0");
        }
    }
    
    public static void main(String[] args){
        Point1 diem1 = new Point1(1,1,1);
        Point1 diem2 = new Point1(2,2,2);
        Point1 diem3 = new Point1(3,3,3);
        
        
        double toado_x1 = diem2.getX() - diem1.getX();
        double toado_y1 = diem2.getY() - diem1.getY();
        double toado_z1 = diem2.z - diem1.z;
        
        double toado_x2 = diem3.getX() - diem1.getX();
        double toado_y2 = diem3.getY() - diem1.getY();
        double toado_z2 = diem3.z - diem1.z;
        
        double a = (toado_y1 * toado_z2) - (toado_y2 * toado_z1);
        double b = (toado_z1 * toado_x2) - (toado_z2 * toado_x1);
        double c = (toado_x1 * toado_y2) - (toado_x2 * toado_y1);
        
        double d = (a * diem1.getX() + b * diem1.getY() + c * diem1.z) * (-1);
        
        phuong_trinh_mat_phang(a,b,c,d);
        
        Point1 diem_test = new Point1(4,4,4);
        
        if ((diem_test.getX() * a + diem_test.getY() * b + diem_test.z * c + d) == 0){
            System.out.println("Diem do thuoc mat phang");
        }else{
            System.out.println("Diem do khong thuoc mat phang");
        }
    }
}
