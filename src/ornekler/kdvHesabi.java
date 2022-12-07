/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekler;

/**
 *
 * @author HİLAL
 */
import java.util.Scanner;
public class kdvHesabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double tutar,kdvliFiyat,kdv=0.18;
        System.out.println("lütfen ürünün tutarını giriniz:");
        tutar=input.nextInt();
        kdvliFiyat= tutar + (tutar*kdv);
        System.out.println("Ürünün kdv'li fiyatı :" + kdvliFiyat);
    }
    
}
