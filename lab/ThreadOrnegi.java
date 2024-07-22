/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallereçalıs;

/**
Java programlama dilinde, Thread konseptini kullanarak iki ayrı iş parçacığı oluşturmanız isteniyor. 
* İlk iş parçacığı, 1'den 10'a kadar olan sayıları ekrana yazdıracak. 
* İkinci iş parçacığı ise 10'dan 1'e kadar olan sayıları ekrana yazdıracaktır.

Ana programın iş parçacıklarını oluşturmasının ardından beklemesi ve sonra
* "İşlemler tamamlandı." mesajını ekrana yazdırması beklenmektedir.

Kodunuzu oluştururken Thread sınıfını ve Runnable arabirimini kullanmalı,
* her iş parçacığı için ayrı bir sınıf oluşturmalı ve run() metodu içinde gerekli işlemleri gerçekleştirmelisiniz.


 */
class SayiYazdirici implements Runnable {
    private final int baslangic;
    private final int bitis;

    public SayiYazdirici(int baslangic, int bitis) {
        this.baslangic = baslangic;
        this.bitis = bitis;
    }

    @Override
    public void run() {
        if (baslangic < bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000); // 1 saniye gecikme
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = baslangic; i >= bitis; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000); // 1 saniye gecikme
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class ThreadOrnegi {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SayiYazdirici(1, 10));
        Thread thread2 = new Thread(new SayiYazdirici(10, 1));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("İşlemler tamamlandı.");
    }
}
