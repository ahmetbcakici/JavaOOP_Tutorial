/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_metotlar;


public class Java_metotlar {
    
    static void MerhabaYazdir(){
        System.out.println("Merhaba");
    }   
    
    static String BenimMetodum(String isim){
        return "Merhaba "+isim;
    }
    
    static String Topla(int sayi1,int sayi2,String isim){
        int toplam = sayi1+sayi2;
        return "Sonuc="+toplam+" "+isim;
    }
    
    public static void main(String[] args) {
        String metottangelendeger = BenimMetodum("Veli");
        System.out.println(metottangelendeger);
        
        System.out.println(Topla(5,10,"Ahmet"));
        
        for(int i = 0;i < 100;i++)
            MerhabaYazdir();
        
        
    }
    
}
