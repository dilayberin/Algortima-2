/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uygulama;

/**
 *
 * @author dilay
 */
public class bellek {
  private String marka;
   private String model;
   private String DDRTipi;

    public bellek(String marka, String model, String DDRTipi) {
        this.marka = marka;
        this.model = model;
        this.DDRTipi = DDRTipi;
    }
//sadece get mdetodu aldık çünkü bir bellek aldığımızda sonradan değiştirmeyiz
    public String getDDRTipi() {
        return DDRTipi;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }
   
}
