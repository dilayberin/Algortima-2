package GUI;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;
/*1
12
123
...*/

class panelim extends JPanel{
    @Override
    public void paint(Graphics g){
     g.drawRect(50, 50, 100, 150);//dikdörtgen çizmede kullanılır
     g.setColor(Color.red);
     g.fillRect(60, 60, 150, 100);
     g.drawRect(180, 180, 30, 60);
     g.setColor(Color.BLUE);
     g.drawOval(180, 180, 30, 60);
    }
}
public class grafikUygulama5 extends JFrame {

    public grafikUygulama5() {
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

