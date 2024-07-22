
package ornek;
class hayvanlar{
    public hayvanlar(){
        System.out.println("hayvan kurucu metodu");
    }
}
class yarasa extends hayvanlar{
    public yarasa(){
        System.out.println("yarasa kurucu metodu");
    }
}
class ucanYarasa extends yarasa{
    public ucanYarasa(){
        System.out.println("ucan yarasa kurucu metodu");
    }
}
public class hayvan {
    public static void main(String[] args) {
        ucanYarasa u=new ucanYarasa();
    }
}
