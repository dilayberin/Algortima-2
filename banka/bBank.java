/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banka;

/**
 *
 * @author dilay
 */
public class bBank extends bankaUygulaması{
    public final double bFee=0.5;
    private int paraCekmeSayac;
   public bBank (double bakiye){
    super(bakiye);
    paraCekmeSayac=0;
}
   public void paraCekme(double bakiye){
       super.paraCek(bakiye);
       paraCekmeSayac++;
   }
    @Override
    public void hesapOzet() {
        paraCekme(paraCekmeSayac*0.5);
        paraCekmeSayac=0;
    }
}
