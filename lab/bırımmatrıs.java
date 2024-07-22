/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallereçalıs;

class bırımMatrıs{
    private int matrıs[][];
    int diziBoyutu;

    public bırımMatrıs() {
        diziBoyutu=5;
        matrıs=new int[diziBoyutu][diziBoyutu];
    }

    public bırımMatrıs(int parametre) {
        if(parametre>1) diziBoyutu=parametre;
        else diziBoyutu=5;
        matrıs=new int[diziBoyutu][diziBoyutu];
    }
   public void bırımMatrısYap(){
       for (int i = 0; i < matrıs.length; i++) {
           for (int j = 0; j < matrıs[0].length; j++) {
               if(i==j) matrıs[i][j]=1;
               else matrıs[i][j]=0;
           }
       }
}
    
}
public class bırımmatrıs {
    public static void main(String[] args) {
       
    }
 
}
