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

public class hesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, secim;
        System.out.println("lütfen sayi1 giriniz:");
        sayi1 = input.nextInt();
        System.out.println("lütfen sayi2 giriniz:");
        sayi2 = input.nextInt();
        System.out.println("lütfen yapacağınız işlemi seçiniz:");
        System.out.println("1-toplama/n2-çıkarma7n3-çarpma/n4-bölme");
        System.out.println("Seçiminiz:");
        secim = input.nextInt();

        if (secim == 1) {
            System.out.println("toplama:" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("çıkarma:" + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("çarpma:" + (sayi1 * sayi2));
        } else if (secim == 4) {
            if (sayi2 == 0) {
                System.out.println("sayi2 0'a eşittir ve sonuç belirsizdir.");
            } else {
                System.out.println("bölme:" + (sayi1 / sayi2));
            }

        }

    }

}
