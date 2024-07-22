package GUI;
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
        for (int y = 10; y < 200; y=y+10) {
            int i=1;
            for (int x = 10; x < y; x=x+15) {
                g.drawString(i+" ", x, y);
                i+=1;
            }
        }
 
    }
}
public class grafikUygulama4 extends JFrame {

    public grafikUygulama4() {
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
