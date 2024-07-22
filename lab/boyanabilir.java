/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package finallereçalıs;

import java.util.Date;

public interface boyanabilir {
    void nasılBoyanır();
}
abstract class geometrikNesne {
    String renk;
    boolean dolu;
    Date olusturulmaTarihi;

    protected geometrikNesne() {
    }
    

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setDolu(boolean dolu) {
        this.dolu = dolu;
    }
    public boolean doluMu(){
        return dolu;
    }

    public Date getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    @Override
    public String toString() {
        return super.toString();  }
  
    public abstract double alanHesapla();
    public abstract double cevraHesapla();
}
class kare extends geometrikNesne implements boyanabilir{

    @Override
    public double alanHesapla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    @Override
    public double cevraHesapla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void nasılBoyanır() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}



