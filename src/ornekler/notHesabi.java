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
public class notHesabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double ortalama;
        
        System.out.println("Lütfen vize notu giriniz:");
        int vize=input.nextInt();
        System.out.println("Lütfen finall notu giriniz:");
        int finall=input.nextInt();
        ortalama=vize*0.4+finall*0.6;
        System.out.println("Not ortalaması:" + ortalama);
        if(ortalama>=50){
            System.out.println("dersi geçtiniz");
        }
        else{
        System.out.println("dersi geçemediniz");
    }
                
                
                
                
                
                
        
        
        
                
    }
    
}
