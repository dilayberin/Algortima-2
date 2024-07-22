//rasyonel sayılar üzerinde işelmler yapan program
package ornek;

public class Rasyonel {
   private int pay;
   private int payda;
   public Rasyonel(){
       pay=1;
       payda=1;
   }
   
   public Rasyonel(int pay,int payda){
       this.pay=pay;
       this.payda=payda;
   }
   public void yazdır(){
       System.out.println(pay+"/"+payda);
   }
   //a/b+c/d ise (a*d+c*b)/b*d
   public static Rasyonel topla(Rasyonel r1,Rasyonel r2){
       Rasyonel sonuc=new Rasyonel();
       sonuc.pay=r1.pay+r2.payda+r1.payda*r2.pay;
       sonuc.payda=r1.payda*r2.payda;
       return sonuc;
   }
   public void topla(Rasyonel r){
       this.pay=this.pay*r.pay+r.pay*this.payda;
       this.payda=this.payda*r.payda;
   }
   //12/18==2/3
   private int obeb(int a,int b){
       //sadece bu sınıf içinde kullanıcsk iye pri
       int eb=1,i=1;
       while(eb<=a&&eb<=b){
         if(a%i==0&&b%i==0){eb=i;}  
         i++;
       }
       return eb;
   }
   public void sadeleştir(){
       int ortak=obeb(pay, pay);
       pay=pay/ortak;
       payda=payda/ortak;
               
   }
}
