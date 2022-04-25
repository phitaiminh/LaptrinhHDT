/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author phita
 */
public class ClockThread extends Thread {
    private final JButton button;
    
    public ClockThread (JButton button) {
        this.button = button;
    }
    @Override
    public void run () {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {
            Date now = new Date();
            
            String st = sdf.format(now);
            button.setText(st);
            Thread.sleep(1000);
        }
    }

    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
