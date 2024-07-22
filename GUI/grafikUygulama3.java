package GUI;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;

class panelim extends JPanel{
    @Override
    public void paint(Graphics g){
       g.drawLine(20, 20, 190, 20);
       g.drawString("welcome to java programming", 26,30);
       g.drawLine(20, 40, 190, 40);
 
    }
}
public class grafikUygulama3 extends JFrame {

    public grafikUygulama3() {
        add(new panelim());
               
    }
    public static void main(String[] args) {
        grafikUygulama form=new grafikUygulama();
        form.setSize(300,300);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
    
    }
}




