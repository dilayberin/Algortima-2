
package ornekler;

class hayvan {
    protected int sesYuksekliği;
    protected String ses;

    public hayvan(int sesYuksekliği, String ses) {
        this.sesYuksekliği = sesYuksekliği;
        this.ses = ses;
    }
    protected final void sesCikar(){
        System.out.println(ses);
    }
}
class kedi extends hayvan{
    public kedi(int sesYuksekliği){
        super(sesYuksekliği,"miyav");
    }
}
class kopek extends hayvan{
    public kopek(int sesYuksekliği){
        super(sesYuksekliği,"havhav");
    }
}
class kus extends hayvan{
    private String kusTuru;
    public kus(int sesYuksekliği,String kusTuru){
        super(sesYuksekliği,"cikcik");
        this.kusTuru=kusTuru;
    }
    public String toString(){
        return "kuş sesi yüksekliği:"+sesYuksekliği+",çıkardığı ses:"+ses;
    }
    public boolean equals(Object obj){
    boolean sonuc=((kus)obj).kusTuru.equals(this.kusTuru);
    return sonuc;
    }
}


public class orn2 {
    public static void main(String[] args) {
        kus k1=new kus(10,"serçe");
        kus k2=new kus(8,"karga");
        kus k3=new kus(11,"serçe");
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        if(k1.equals(k3)){
            System.out.println("iki kuş aynı");
            
        }else{
             System.out.println("iki kuş farklı");       
                    }
    }
}
