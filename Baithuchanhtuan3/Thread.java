package thread;


public class Thread implements Runnale {

    static void sleep(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
           System.out.print(" " + i);
           
           Thread.sleep(500);
        }
    }
}
