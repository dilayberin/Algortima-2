package GUI;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;


class panelim extends JPanel{
    @Override
    public void paint(Graphics g){
      g.drawRect(30, 30,30,30);
    }
}
public class grafikUygulama6 extends JFrame {

    public grafikUygulama6() {
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
