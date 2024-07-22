/*
 Karakterleri işlemek için bir karakter adında sınıf oluşturulucak. Karakter sınıfın char tipinde bir veri alanı vardır. kurucu bir 
karakter alıp veri alanına atamalıdır. diğer metodlar aşağıdaki gibidir.

karsilastir(karakter k)  : integer tipinde değer geri döndürmelidir.. eğer mevcut karakter girilen karakterden sonra geliyorsa 1 , 
daha önce geliyorsa -1 ve eşit ise 0 değerini göndermelidir

esitMi(karakter k) : boolean tipinde değer geri döndürmelidir. bir eğer mevcut karakter ile girilen karakter eşit ise true değilse
false döndürülecektir.

rakamMi(): boolean tipinde değer geri döndürmelidir. veri alanı rakam ise true değilse false döndürmelidir.

harfMi(): boolean tipinde değer geri döndürmelidir.veri alanı harf ise true değilse false döndürmelidir.

kucukHarfMi(): boolean tipinde değer geri döndürmelidir.veri alanı küçük harf ise true değilse false döndürmelidir.

buyukHarfMi(): boolean tipinde değer geri döndürmelidir.veri alanı büyük harf ise true değilse false döndürmelidir.

toKucukHarf(): void tipinde olmalıdır. veri alanını küçük harfe çevirir.

toBuyukHarf(): void tipinde olmalıdır. veri alanını büyük harfe çevirir.
 */
package vize1.pkg2çalışmalar;


class karakter{
   char veriAlanı;

    public karakter(char veriAlanı) {
        this.veriAlanı = veriAlanı;
    }
   
    public int karsilastir(char k){
       return k;
   }
    
    public boolean esitMi(char k){
        if(this.veriAlanı==k) return true;
         return false;
    }
    
    public boolean rakamMi(){
        if(this.veriAlanı>=1&&this.veriAlanı<=9) return true;
        return false;
    }
    
    public boolean harfMi(){
       if(this.veriAlanı>='a'&&this.veriAlanı>='A'&&this.veriAlanı<='Z'&&this.veriAlanı<='z') return true;
        return false;
    }
    
    public boolean kucukHarfMi(){
        if(this.veriAlanı >= 'a' && this.veriAlanı <= 'z') return true;
        return false;
    }
    
     public boolean buyukHarfMi(){
        if(this.veriAlanı >= 'A' && this.veriAlanı <= 'Z') return true;
        return false;
    }
     
    public void toKucukHarf() {
        if (this.kucukHarfMi()) {
            // Küçük harfe çevirme işlemi ASCII tablosundaki değerler kullanılarak yapılır.
           this.veriAlanı = (char) (this.veriAlanı + (32)); 
    }}
    
    public void toBuyukHarf() {
       if (this.buyukHarfMi()) {
            // Büyük harfe çevirme işlemi ASCII tablosundaki değerler kullanılarak yapılır.
           this.veriAlanı= (char) (this.veriAlanı - (32));
    }}

  
     
    
    
}
public class karakterSınıfı {
    
}
