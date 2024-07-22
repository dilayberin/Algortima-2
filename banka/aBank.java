/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banka;

/**
 *
 * @author dilay
 */
public class aBank extends bankaUygulaması {
public final double aFee=5.00;
    public aBank (double bakiye){
        super(bakiye);
    }
    
    @Override
    public void hesapOzet() {
        paraCek(5.00);
    }
    
}
