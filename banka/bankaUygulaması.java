
package banka;

import java.util.Random;


public abstract class bankaUygulaması //başka sınıflarda bunun kodlarına erişilebilecek
{
   protected double bakiye;
   protected int islem;
   public bankaUygulaması(double bakiye){
       this.bakiye=bakiye;
       islem=0;
              
   }
   public void paraCek(double miktar){
       bakiye-=miktar;
       islem++;
   }
   public void paraYatır(double miktar){
       bakiye+=miktar;
       islem++;
   }   
  public double getBakiye(){
      return bakiye;}
  public void hesapÖzeti(){
      hesapOzet();
      String hesapAdı=getClass().getName();
     System.out.println("islemŞ:"+islem+"bakiye."+bakiye+"hesap adı"+hesapAdı);
     islem=0;
  }
  
  public abstract void hesapOzet();  
private static Random r=new Random();
private static bankaUygulaması rastegeleHesapAc(){
    int rs=r.nextInt(3);
    bankaUygulaması hesap=null;
    switch (rs) {
        case 0:hesap=new aBank(r.nextInt(100));break;
        case 1:hesap=new aBank(r.nextInt(100));break;
        case 2:hesap=new aBank(r.nextInt(100));break;
    
    
    }
    return hesap;
}
private static final int hesapSayisi=20;
    public static void main(String[] args) {
        bankaUygulaması hesaplar[]=new bankaUygulaması[hesapSayisi];
        for (int i = 0; i <hesaplar.length; i++) {
            hesaplar[i]=bankaUygulaması.rastegeleHesapAc();
        }
        for (int i = 0; i < 31; i++) {
            int hesapNo=r.nextInt(hesaplar.length);
            if(r.nextInt(2)==0){
                hesaplar[hesapNo].paraCek(r.nextInt(100)+1);
            }
            else{
                hesaplar[hesapNo].paraYatır(r.nextInt(100)+1);
            }
            System.out.println("ay sonu özeti");
            for (int j = 0; j < hesaplar.length; j++) {
                hesaplar[i].hesapOzet();
            }
        }
    }




    
}
