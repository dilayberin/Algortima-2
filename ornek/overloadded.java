
package ornek;
class müdür{
   public void isYap(double a){
       System.out.println("müdür iş yap"); 
   } 
}
class genelMüdür extends müdür{
    public void isYap(double a){//double alırsak override olur 
       System.out.println("genel müdür iş yap"); 
   } 
      public void isYap(int a){
       System.out.println("genel müdür iş yap"); 
   } 
}
public class overloadded {
    public static void main(String[] args) {
        müdür m=new müdür();
        m.isYap(2.3);
        genelMüdür g=new genelMüdür();
        g.isYap(2.3);
    }
            
 
}
//tipleri aynı olursa override olur