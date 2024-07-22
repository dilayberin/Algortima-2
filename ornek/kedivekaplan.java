//kalıtım örn
package ornek;
   class kedi{
       protected int ayakSayisi=4;
       public void yakalaAv(){
           System.out.println("kedi sıınıfı av yakaladı");
       }
   }
   class kaplan extends kedi{
       double agırlık=70;
   }


public class kedivekaplan {
    public static void main(String[] args) {
        kedi kd=new kedi();
        System.out.println("kedi ayak sayısı:"+" "+kd.ayakSayisi);
        kd.yakalaAv();
        kaplan kp=new kaplan();
        System.out.println("kaplan ayak sayısı:"+" "+kp.ayakSayisi);
        kp.yakalaAv();//kedi sınıfından miras aldı
        System.out.println(kd);
    }
}
