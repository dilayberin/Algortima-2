
package GUI;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;

class panelim extends JPanel{
    @Override
    public void paint(Graphics g){
        g.drawString("merhaba", 180, 50);
        //iki çizgi arasınaa yazı
        g.drawLine(20, 20, 120, 20);
        g.drawString("selam", 180, 32);
        g.drawLine(20, 40, 120, 40);
        /*1
        12
        123
        ....*/
        for (int y = 10; y < 200; y=y+10) {
            int i=1;
            for (int x = 10; x < y; x=x+15) {
                g.drawString(i+"", x, y);
                i+=1;
            }
        }
    }
}
public class grafikUygulama extends JFrame {

    public grafikUygulama() {
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
