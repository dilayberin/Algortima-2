
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class denee {
    //öğr adını vizesini finalini alıp geçenleri geçenler.txt kalanları kalanlar.txt sakla
    
    public static void main(String[] args) {
        File d1,d2;
        d1=new File("geçen.txt");
        d2=new File("kalan.txt");
        PrintWriter gecen=null;
        PrintWriter kalan=null;
        try {
            if(!d1.exists())
                d1.createNewFile();//yoksa oluşturur
            if(!d2.exists())
                d2.createNewFile();
       
            System.out.println("ad vize final");
            Scanner k=new Scanner(System.in);
            String isim=k.nextLine();
            int vize=k.nextInt();
            int fınal=k.nextInt();
            int genel=k.nextInt();
            double ort=vize*0.4+genel*0.6;
            if(ort>=50){
                     gecen=new PrintWriter(new FileOutputStream(d1,true));
                     gecen.println(isim+" "+vize+" "+fınal+" "+genel);
                     gecen.close();
            }
            else{
                
            kalan=new PrintWriter(new FileOutputStream(d2,true));
            gecen.println(isim+" "+vize+" "+fınal+" "+genel);
            kalan.close();
            }
            
        } catch (Exception e) {
        }
    }
}
