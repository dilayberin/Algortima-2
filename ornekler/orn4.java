
package ornekler;
abstract class ogrenci{
    protected String no;
    protected String isim;
    protected int basarılıDersKrediSayi;

    public ogrenci(String no, String isim, int basarılıDersKrediSayi) {
        this.no = no;
        this.isim = isim;
        this.basarılıDersKrediSayi = basarılıDersKrediSayi;
    }
    public abstract boolean mezuniyetDurumu();
}
class lisansOgrencisi extends ogrenci{
    boolean staj;
   public lisansOgrencisi(String no,String isim,int basarılıDersKrediSayi,boolean staj){
   super(no, isim, basarılıDersKrediSayi);
       this.staj=staj;
   }
    @Override
   public boolean mezuniyetDurumu(){
       return basarılıDersKrediSayi>021&&staj==true;
   }
    public String toString(){
        return no+" "+isim+" "+basarılıDersKrediSayi+" "+mezuniyetDurumu();
    }
}
class yuksekLisansOgrencisi extends ogrenci{
    private int yayinsayisi;

    public yuksekLisansOgrencisi(int yayinsayisi, String no, String isim, int basarılıDersKrediSayi) {
        super(no, isim, basarılıDersKrediSayi);
        this.yayinsayisi = yayinsayisi;
    }
    public boolean mezuniyetDurumu(){
        return basarılıDersKrediSayi>=21&&yayinsayisi>=0;
    }
   
}
public class orn4 {
    public static void main(String[] args) {
        lisansOgrencisi ogr=new lisansOgrencisi("2126001", "ali", 150, true);
        System.out.println(ogr.mezuniyetDurumu());
    
    }
}
