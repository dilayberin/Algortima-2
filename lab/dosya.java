/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallereçalıs;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
Soru: Java programı, kullanıcıdan alınan bir metin şifreleyen ve bu şifreli metin bir dosyaya yazan,
* ardından dosyadan okuyarak şifreyien çöz bir program yazmanız istenmektedir.
* Şifrelemeyi gizlemesi olarak, her harfini bir sonraki harfe dönüştüren bir şifreleme yöntemi kullanmaktır.
* Örneğin, "a" harfi "b" harfine, "b" harfi "c" harfine ve benzer şekilde uyumlu hale getirilecektir. 
* İlgili dosya "sifreli_metin.txt" adıyla oluşturulmalıdır. Program çalışması aşağıdaki gibi olmalıdır:

Kullanıcıdan bir metin girişi alınır.
Girilen metin, şifrelemeye göre şifrelenir ve "sifreli_metin.txt" adlı dosyaya taşınabilir.
Dosya başarılı bir şekilde yazıldıktan sonra, dosyanın içeriği okunarak şifreli metin ekranı yazdırılır.
Şifreli metin dosyası okunduktan sonra, şifre çözme işlemi gerçekleştirilerek orijinal metin ekranları yazdırılır.
 */

public class dosya {
    public static void main(String[] args) {
        File dosya=new File("sifreli_metin.txt");
        PrintWriter p=null;
        Scanner kullanıcıdanAl=new Scanner(System.in);
        System.out.println("şifre oluşturulması için bir metin giriniz....");
        String kullanıcıdanAlınan=kullanıcıdanAl.nextLine();
        try {
            if(!dosya.exists()){
                dosya.createNewFile();
            }
            else{
                for (int i = 0; i < kullanıcıdanAlınan.length(); i++) {
                    char karakter=kullanıcıdanAlınan.charAt(i);
                    karakter++;
                    p=new PrintWriter(dosya);
                }
            }
            p.close();
            
        } catch (Exception e) {
        }
        try {
            
        } catch (Exception e) {
        }
        
    }
}
