
package ornekler;
class b extends Object{
   public b (int i){
       System.out.println("i nesnesi oluşturuldu");
   }
   public void ilerle(){
       System.out.println("ilerledi");
   }
}
class a extends b{
    public a(int i){
        super(i);//b de int parametre old çağırmak için int değer girdik
        System.out.println("a nesnesi oluşturuldu");
    }
    @Override
    public void ilerle(){
        System.out.println("a nesnesi ilerledi");
        super.ilerle();//b sınıfındaki overrride edilen ilerle metodu çağırıldı
    }
}

public class Haftasekizteorik {

 
    public static void main(String[] args) {
       a ab=new a(4); 
       ab.ilerle();
    }
    
}
