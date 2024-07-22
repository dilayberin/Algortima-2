
package ornek;
class motor{
    private int motorGucu=3600;
    public void calis(){
        System.out.println("motor çalıştı");
    }
    public void dur(){
    System.out.println("motor durdu");
    }
}
class aileArabası{
    motor m;
    public aileArabası(){
        m=new motor();
    }
    public void dur(){
        m.dur();
        System.out.println("aile arabası durdu");
    }
    public void hareketEt(){
        m.calis();
        System.out.println("aile arabası hareket etti");
    }
}

public class Haftaltıteorik {

    public static void main(String[] args) {
   aileArabası a=new aileArabası();
   a.hareketEt();
   
   
   
   Rasyonel r1=new Rasyonel(2, 3);
   r1.yazdır();
   Rasyonel r2=new Rasyonel(15,18);
   r2.sadeleştir();
   r2.yazdır();
    }
    
}
