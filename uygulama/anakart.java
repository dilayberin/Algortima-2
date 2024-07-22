/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uygulama;

/**
 *
 * @author dilay
 */
public class anakart {
   private String marka;
   private String model;
   private String islemciTipi;

   public anakart(String marka, String model, String islemciTipi) {
        this.marka = marka;
        this.model = model;
        this.islemciTipi = islemciTipi;
    }

    public String getIslemciTipi() {
        return islemciTipi;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }
   
}
