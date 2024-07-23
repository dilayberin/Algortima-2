
package GUI;

import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;
class panel extends JPanel{
   
    public void paints(Graphics g){
         g.drawRect(30, 30,30,30);
 
    }
}
public class kafre {
    public static void main(String[] args) {
           grafikUygulama form=new grafikUygulama();
        form.setSize(300,300);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
    }
}
