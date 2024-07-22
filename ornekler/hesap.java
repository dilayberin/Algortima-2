/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ornekler;
class hesapla{
    int son;
    hesapla(int son){
        this.son=son;
    }
    void goster(){
        for (int x = 1; x <son; x++) {
            for (int y = 1; y < son; y++) {
                for (int z = 1; z < son; z++) {
                    if(x*x+y*y==z*z&&x<=y&&y<=z){
                        System.out.println("("+x+","+y+","+z+")");
                    }
                }
            }
 
        }
    }
}
//x<y<z oü. x^2+y^2=x^2
public class hesap {
    public static void main(String[] args) {
        hesapla h=new hesapla(50);
        h.goster();
    }
}
