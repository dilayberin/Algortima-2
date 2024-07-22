package ornek;
class ogrenci{
    int no;
    String isim;
    int v,f;
    public ogrenci(int no,String isim,int v,int f){
        this.no=no;
        this.isim=isim;
        this.v=v;
        this.f=f;
    }
    double notHesap(){
        return v*0.4+f*0.6;
    }
    String gecmeDurumu(){
        if(notHesap()>=50)
            return "geçti";
        else return "kaldı";
    }
}
class Ylisans extends ogrenci{
String alan;

    public Ylisans(int no,String isim,int v,int f,String alan) {
        super(no,isim, v, f);
        this.alan=alan;
    }
  double notHesap  (){
      return v*0.5+f*0.5;
      
  }
}

public class overriding {
    public static void main(String[] args) {
        Ylisans ogr=new Ylisans(1, "ahmet", 50, 60,"yazılım");
        System.out.println("geçme durumu:"+ogr.gecmeDurumu()+"notu:"+ogr.notHesap());
    }
 
}
