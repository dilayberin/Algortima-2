/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallereçalıs;

/**
 *
 * @author dilay
 */
import java.io.*;

public class Sifreleme {
    public static void main(String[] args) {
        // Kullanıcıdan metin girişi al
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Metni girin: ");
        try {
            String metin = br.readLine();

            // Şifreleme işlemi ve dosyaya yazma
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("sifreli_metin.txt"));

                for (int i = 0; i < metin.length(); i++) {
                    char karakter = metin.charAt(i);
                    karakter++;
                    bw.write(karakter);
                }

                bw.close();
                System.out.println("Metin şifrelenerek dosyaya yazıldı.");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Dosyadan okuma ve şifre çözme işlemi
            try {
                BufferedReader dosyaOkuyucu = new BufferedReader(new FileReader("sifreli_metin.txt"));
                String satir;
                StringBuilder sifreliMetin = new StringBuilder();

                while ((satir = dosyaOkuyucu.readLine()) != null) {
                    sifreliMetin.append(satir);
                }

                dosyaOkuyucu.close();
                System.out.println("Şifreli Metin: " + sifreliMetin.toString());

                StringBuilder orijinalMetin = new StringBuilder();
                for (int i = 0; i < sifreliMetin.length(); i++) {
                    char karakter = sifreliMetin.charAt(i);
                    karakter--;
                    orijinalMetin.append(karakter);
                }

                System.out.println("Orijinal Metin: " + orijinalMetin.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

