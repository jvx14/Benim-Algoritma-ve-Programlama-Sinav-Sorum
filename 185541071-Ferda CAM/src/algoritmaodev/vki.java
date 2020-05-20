/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaodev;

public class vki extends olcum{
    private int boy ;
    private int kilo ; 

    public vki(String isim , int boy,int kilo ) {
        super(isim);
        this.boy = boy ;
        this.kilo = kilo ;     
    }

     @Override
    public void Hesapla() {
        String mesaj;
        double u = kilo/(boy*boy);
        if(u<=18.5){
        mesaj="Düşük Kilolu";
        }
        else if(u<=24.9){
        mesaj="Normal Kilolu";    
        }
        else if(u<=29.9){
        mesaj="Fazla Kilolu";   
        }
        else if(u<=40){
        mesaj="Obez";    
        }
        else{
        mesaj="Aşırı Obez";    
        }
        System.out.println(getIsim()+"sonucunuz : "+u+"-"+mesaj);
    }

}
