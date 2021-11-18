/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesap_makinesi;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class Hesap_Makinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,select;
        Scanner input= new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2= input.nextInt();
        
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        select=input.nextInt();
        
        switch(select) {
            case 1:
                System.out.print("Toplam:" + (n1+n2));
                break;
                
            case 2:
                System.out.print("Çıkarma" + (n1-n2));
                break;
                
            case 3:
                System.out.print("Çarpma:" + (n1*n2));
                break;
                
            case 4:
                if (n2!=0) {
                    System.out.print("Bölme" + (n1/n2));
                }
                else
                    System.out.println("Bir sayı 0 a bölünemez!");
                
                
                    
                break;
                
            default: 
                System.out.println("Hatalı Giriş Yaptınız");
                
                  
        }
        
    }
    
}
