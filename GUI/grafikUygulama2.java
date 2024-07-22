package GUI;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;
//dikdörtgen 80 e 40
class panelim extends JPanel{
    @Override
    public void paint(Graphics g){
       
        g.drawLine(20, 20, 100, 20);
        g.drawLine(20, 20, 20, 60);
        g.drawLine(20, 60, 100, 60);
        g.drawLine(100, 20, 100, 60);
    }
}
public class grafikUygulama2 extends JFrame {

    public grafikUygulama2() {
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




