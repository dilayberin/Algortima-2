
package ornekler;

abstract class sayi{
    int n;//verilen pozziitf tamsayı
    public sayi(int n){
        this.n=n;
    }
    abstract int toplan();//n orn:457  (4+5+7)^2 stringini döndğrğr
    
    abstract String getus();
}
class rakamToplaKare extends sayi{
    public rakamToplaKare (int n){
        super(n);
    }
    @Override
    int toplan() {
       int k=n,top=0;//n değişmemesi için k da n i tuttuk
       while(k>0){
           int kalan =k%10;
           top+=kalan;
           k=k/10;
       }
       return top*top;
    }

    @Override
    String getus() {
       String s=" ";
       int k=n;
       while(k>0){
           int kalan=k%10;
           s=kalan+"+"+s;
           
           k=k/10;
       }
       s="("+s.substring(0, s.length()-1)+")^2";//lenght-1 dememizin sebebi bi fazla olmaması
        return s;       
    }

   
}
public class islem {
    public static void main(String[] args) {
        
    }
}
