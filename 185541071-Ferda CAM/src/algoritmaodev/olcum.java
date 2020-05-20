/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaodev;

public abstract class olcum {
    String isim;

    public olcum (String isim) {
        this.isim = isim;
    }
    abstract void Hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}

