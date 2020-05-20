/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaodev;

/**
 *
 * @author biyo
 */
public class vya extends olcum{
    private int boy ;
    private int kilo ; 

    public vya(String isim , int boy,int kilo ) {
        super(isim);
        this.boy = boy ;
        this.kilo = kilo ;     
    }

     @Override
    public void Hesapla() {
        double v = Math.sqrt(((boy*kilo)/3600));
        System.out.println(getIsim()+"sonucunuz : "+v); 
        }
       
    }
