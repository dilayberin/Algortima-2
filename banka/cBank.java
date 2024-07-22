/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banka;

/**
 *
 * @author dilay
 */
public class cBank extends bankaUygulaması {
   
    public final double cFee=0.51;
    public cBank(double bakiye){
    super(bakiye);
}
    public void paraCekme(double miktar){
      if(Math.random()<cFee)  {
          super.paraCek(2*miktar);
      }
      else{
          super.paraCek(0.0);
      }
          
    }
    @Override
    public void hesapOzet() {
        System.out.println("değişiklik yapılmadı");
    }
    
}
