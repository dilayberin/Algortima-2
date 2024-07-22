/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallereçalıs;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class yeniOval extends JPanel implements Runnable{
    int x;
    int y;

    public yeniOval() {
        setSize(300,300);//panelin boyutu
        x=getWidth()/2-25;///şeklin tam ortası
        y=0;
        (new Thread(yeniOval.this)).start();
    }
    
     public void paintComponent (Graphics g){
        super.paintComponent(g);
     
        g.fillOval(x, y, 50, 50);
    }
    
    public static void main(String[] args) {
          JFrame form=new JFrame();
        form.setVisible(true);
        form.setSize(400,400);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        yeniOval p=new yeniOval();
        form.add(p);
    }

    @Override
    public void run() {
          while(true){
            try {
                Thread.sleep(200);
                y+=10;//şekil aşağı doğru kayacak
            
                repaint();
                if(y>getHeight()-50) return;
            } catch (Exception e) {
            }
        }
   }
    
}
