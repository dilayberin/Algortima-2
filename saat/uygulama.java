
package saat;
class saat{
    private int saniye;
    private int dakika;
    private int saat;
    public saat(){
        saniye=0;
        dakika=0;
        saat=0;
    }
    public saat(int saat,int dakika,int saniye){
        this.saat=saat;
        this.saniye=saniye;
        this.dakika=dakika;//overloading işlemi .bi  önceki sınıfın verileriyle eşledik
    }
       //13:59:59  +5 sn
             //13:59:64
    public void ilerle(int arttırım){
        this.saniye=arttırım;
         if(this.saniye>=60){
             //13:60:04
            int kalan=this.saniye/60;
            this.saniye=this.saniye%60;
            this.dakika+=kalan;
            //13:62:04
           if(this.dakika>=60){
               int kalan2=this.dakika/60;
               this.dakika=this.dakika%60;
               this.saat+=kalan2;
           } 
        }
    }
    public void ilerle(){
       this.ilerle(1);//kendi içindeki parametreleri ilerle metoduna gider.bir genel mod yazdık ve diğerlerinde de kullandık
    
        //saniyeyi 1 arttır
        //13:59:59
        //13:59:60
       /* this.saniye+=1;
        if(this.saniye==60){
            this.saniye=0;
            this.dakika+=1;
           if(this.dakika==60){
               this.dakika=0;
               this.saat+=1;
           } 
        }*/
    }
    //verilerin değiştirilirmesini istemiyorsak sadece kullanıcı okusun istiyorsak get met.kullanılıur
    public int getDakika(){
        return dakika;
    }
     public int getSaat(){
        return saat;
    }
      public int getSaniye(){
        return saniye;
    }

    public void setDakika(int dakika) {
        //eğer pubkic olsaydı nesneAdı.dakika=50 yapsak direkt dakika içne 50 verisi gidecekti
       //set metoduyla nesneAdı.setDakika(50) olarak yazınca metod çağırmış olur
       if(dakika>=60) System.out.println("dakika 60 dan büyük olamaz");
       else  this.dakika = dakika;
    }

    public void setSaniye(int saniye) {
        this.saniye = saniye;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }
      
}
public class uygulama {
    public static void main(String[] args) {
        saat s=new saat(13, 57, 56);
       
        System.out.println(s.getSaat());
         s.ilerle();
         System.out.println(s.getSaniye());
    }
}
