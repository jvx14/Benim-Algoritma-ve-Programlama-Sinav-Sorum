/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaodev;

import java.util.Scanner;

/**
 *
 * @author biyo
 */
public class Algoritmaodev {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        olcum olcum = null;
        System.out.print("Vücut kütle indeksi hesaplama Programı ");
        System.out.print("--------------------------------------");
        System.out.print("Lütfen Kilonuzu giriniz : ");
        int kilo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Lütfen Boyunuzu giriniz : ");
        int boy = scanner.nextInt();
        scanner.nextLine();
        olcum = new vki ("Vücut kitle indeksi",boy,kilo);
        olcum.Hesapla();
        olcum = new vki ("Vücut yüzey alanı",boy,kilo);
        olcum.Hesapla();   
        }
        
        
}
    
