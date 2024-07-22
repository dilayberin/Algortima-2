
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

//Bir dosyaya rastgele harf ve karakterleri yazdıran bir uygulama yapınız 
//Daha sonra dosyadan okuma yaparak harfleri harf.txt ve rakamları rakam.txt dosyasına yazdırın
public class deneee {
    public static void main(String[] args) {
     File dosya=new File("karakter.txt");

    PrintWriter p=null;

    try {

      if(!dosya.exists())

        dosya.createNewFile();

      p=new PrintWriter(new FileOutputStream(dosya, false));

      Random r=new Random();

      for (int i = 1; i <=1000; i++) {

        char c=(char)(r.nextInt(74)+'0');

        p.print(c+" ");

        if(i%100==0)

          p.println();

      }

      p.close();

      Scanner oku=new Scanner(dosya);

      PrintWriter karakter=new PrintWriter(new File("rakam.txt"));

      while(oku.hasNext()){

        String okunan=oku.nextLine();

        String [] dizi=okunan.split(" ");

        for (int i = 0; i < dizi.length; i++){ 

          if(dizi[i].charAt(0)>='0' && dizi[i].charAt(0)<='9')

            karakter.print(dizi[i]+" ");

        }

        karakter.println();

      }

      oku.close();

      karakter.close();

    } catch (Exception e) {

    }
    }
 
}
//soru--->bu dosya içindeki karakterlerden  harfleri harf.txt ve rakamları rakam.txt dosyasına yazdırın