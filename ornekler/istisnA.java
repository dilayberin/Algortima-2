/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ornekler;

class student{
    private String no;
    private String isim;

    public student(String no, String isim) {
        this.no = no;
        this.isim = isim;
    }
    public String getNo(){return no;}
    public void setNo(String no){this.no=no;}

    public String getIsim() {return isim; }

    public void setIsim(String isim) {this.isim = isim;}
    
}
class ogrenciBulunamadı extends Exception{
    private String no;

    public ogrenciBulunamadı(String no) {
        this.no = no;
    }

    public ogrenciBulunamadı(String no, String mesaj) {
        super(mesaj);
        this.no = no;
    }

    public String getNo() {
        return no;
    }
    
    
}
public class istisnA {
    static void ogrenciByl(student[] ogrenciArray,String ogrno)throws ogrenciBulunamadı{
        int k=0;
        for (int i = 0; i < ogrenciArray.length; i++) {
            if(ogrenciArray[i].getNo().equals(ogrno)){
                k=1;
                break;
            }
        }
        if(k==0) throw new ogrenciBulunamadı(ogrno);
    }
    public static void main(String[] args)throws ogrenciBulunamadi, ogrenciBulunamadı {
        student[] ogdizi=new student[2];
        ogdizi[0]=new student("123", "ali");
        ogdizi[1]=new student("133", "veli");
        try {
            String ogrno="1234";
            ogrenciByl(ogdizi, ogrno);
            System.out.println(ogrno+"nolu ogr bulyndy");
        } finally{
            System.out.println("finally");
        }
    
    
    }
}
