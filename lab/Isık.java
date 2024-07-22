/*
Java programlama dilinde, Thread konseptini kullanarak farklı renkte ışıklar yakan bir ışık dizisi simülasyonu yapmanız isteniyor.
Her bir ışık bir iş parçacığı (thread) tarafından temsil edilecek ve rastgele bir süre boyunca yanacak.
Ardından, ışık sönecek ve bir sonraki ışık yanacak.

İş parçacıklarının sayısı ve sürelerini belirlemek size kalmıştır. Ana program, tüm ışıkların yanmasını bekleyecek ve
sonra "Simülasyon tamamlandı." mesajını ekrana yazdıracaktır.

Kodunuzu oluştururken Thread sınıfını ve Runnable arabirimini kullanmalı, her bir ışık için ayrı
bir iş parçacığı oluşturmalı ve run() metodu içinde gerekli işlemleri gerçekleştirmelisiniz.

 */
package finallereçalıs;

import java.util.Random;
import javax.lang.model.SourceVersion;

class Isik implements Runnable {
    private final String renk;
    private final int beklemeSuresi;

    public Isik(String renk, int beklemeSuresi) {
        this.renk = renk;
        this.beklemeSuresi = beklemeSuresi;
    }

    @Override
    public void run() {
        try {
            System.out.println(renk + " ışığı yanıyor.");
            Thread.sleep(beklemeSuresi);
            System.out.println(renk + " ışığı söndü.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}

public class Isık {
    public static void main(String[] args) {
        Isik[] isiklar = {
                new Isik("Kırmızı", 2000),
                new Isik("Sarı", 1000),
                new Isik("Yeşil", 3000)
        };

        Thread[] threads = new Thread[isiklar.length];

        for (int i = 0; i < isiklar.length; i++) {
            threads[i] = new Thread(isiklar[i]);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Simülasyon tamamlandı.");
    }
}


