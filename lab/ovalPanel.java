/*
SÜREKLİ RENK DEĞİŞTİREN OVAL
 */
package finallereçalıs;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ovalPanel extends JPanel implements Runnable{
  boolean b;
    public ovalPanel() {
         b=true;
        (new Thread(ovalPanel.this)).start();
    }
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        if(b==true) g.setColor(Color.yellow);
        else g.setColor(Color.blue);
        g.fillOval(10, 10, 50, 50);
    }
            
    
    public static void main(String[] args) {
        JFrame form=new JFrame();
        form.setVisible(true);
        form.setSize(200,200);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ovalPanel p=new ovalPanel();
        form.add(p);
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(200);
                b=!b;
                repaint();
            } catch (Exception e) {
            }
        }
  }
}
