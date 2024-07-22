    //java sınıflarıyla toplama bilg programı yapıcaz.
package uygulama;

/**
 *
 * @author dilay
 */

public class bilgisayar {
  private static anakart[] anakartlar;  //örn herkese aynı anakart özelliklerini sunmamız gerektiği için static aldık
//ankaart[] yapmamızın sebebi nesne dizisi oluşturduk int dizi olsaydı int[]derdik
 private static bellek[]bellekler;
 private static bellek secilenBellekler;
  private static anakart secilenAnakart;
  static{//bu ifade blok içindeki herşeyi statik yapacağımızı gösterir
     anakartlar=new anakart[5];
     anakartlar[0]=new anakart("asus", "ıue", "intel");
     anakartlar[1]=new anakart("asus", "ıue", "amd");
     anakartlar[2]=new anakart("msı", "rog", "intel");
     anakartlar[3]=new anakart("msı", "rog", "amd");
     anakartlar[4]=new anakart("hp", "danık", "intel");

     bellekler=new bellek[2];
     bellekler[0]=new bellek("kıngston", "model", "DDR4");
     bellekler[1]=new bellek("kıngston", "model", "DDR5");
  }

    public static anakart[] getAnakartlar() {
        return anakartlar;
    }

    public static bellek[] getBellekler() {
        return bellekler;
    }

public void bellekSec(int idx){
    this.secilenBellekler=bellekler[idx];
}
public void anakartSec(int idx){
    this.secilenAnakart=anakartlar[idx];
}
public void secilenleriYazdir(){
    if(this.secilenAnakart!=null){
    System.out.println("secilen anakart"+" "+secilenAnakart.getMarka()+" "+secilenAnakart.getModel());}
    if(this.secilenBellekler!=null){
    System.out.println("secilen bellek"+" "+secilenBellekler.getMarka()+" "+secilenBellekler.getModel());}
}

}
