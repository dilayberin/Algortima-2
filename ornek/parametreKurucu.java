
package ornek;
class insan{
    public insan (int par){
        System.out.println("insan kurucu"+par);
    }
}
class zekiinsan extends insan{
    public zekiinsan(int par){
        super(par+1);//insan kurucu metoduna parametre göndeerşr.bir üst sınıftaki kurucu metodu çağırmaya yarar
        System.out.println("zeki insan kurucu"+par);
    }
}
class Hacker extends zekiinsan{
   public Hacker(int par){
       super(par+1);
       System.out.println("hacker kurucu:"+par);
   } 
}

public class parametreKurucu {
    public static void main(String[] args) {
        Hacker h=new Hacker(4);
    }
}
