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
public class mantiksal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5;
        int b=8;
        int c=9;
        int d=19;
        
        boolean kosul1=a<b;
        boolean kosul2=b<c;
        boolean kosul3=c<d;
        boolean sonuc= (kosul1&&kosul2&&kosul3);
        System.out.println("sonuc");
    }
    
}
