
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Dosyaİslemleri {
    public static void main(String[] args) {
    
          String path="D:\\dosyalar\\mavenproject1\\dosyalar\\";
        File klasor=new File(path);
        File[] dosyalar=klasor.listFiles();
        for (int i = 0; i < dosyalar.length; i++) {
            if(dosyalar[i].getName().equals(("ilhan.txt"))){
                    dosyalar[i].delete();
                    System.out.println("Dosya silindi");
            }
            System.out.println(dosyalar[i].getAbsolutePath());
            
            
        }
    }
 
    
       public static void dosya1() throws FileNotFoundException,IOException {
        //HDD de var olan ali.txt dosyasının sonuna yaz okulu yaz
         File dosya=new File( "ali.txt");
        FileWriter pw= new FileWriter(dosya,true);//true yazarsak dosyaya ilave etme işlemi yapar Append denşr
         pw.write("yaz okulu");
            pw.close();//dosyayı kapattık
       
         
         PrintWriter pr=new PrintWriter(dosya);
         for (int i = 10; i < 100; i++) {
            pr.println(i+" ");
        }
         pr.close();
     
    }
         public static void dosya2() throws FileNotFoundException {
     //veli.txt dosyasına   1 den 300 e kadarki sayılardan 13 e tam bölünenleri yaz
     File f=new File("veli.txt");
     PrintWriter pw=new PrintWriter(f);
   
        for (int i = 0; i < 300; i++) {
            if(i%13==0){
                pw.println(i);
            }
            
        }
        pw.close();
    }
         
             public static void dosya3(String[] args) throws FileNotFoundException {
        //veli.txt dosyasındaki biligleri oku ve ekrana yaz
        File f=new File("veli.txt");
        Scanner s=new Scanner(f);//system.in yaparsak klavyeden bilgileri okur. dosyadan okumasını istedik yani f
        int t;
      while(s.hasNext()){
          t=s.nextInt();
          System.out.println(t);
      }
        s.close();
    }
             
             
             
     
}
