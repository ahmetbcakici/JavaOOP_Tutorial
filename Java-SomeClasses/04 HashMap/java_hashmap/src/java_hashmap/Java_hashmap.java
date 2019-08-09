/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hashmap;
import java.util.HashMap;

/**
 *
 * @author ABUGRA
 */
public class Java_hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<String,String> baskentler = new HashMap<String,String>();
        baskentler.put("İngiltere","Londra");
        baskentler.put("Almanya","Berlin");
        baskentler.put("Amerika","Washington DC");
        System.out.println(baskentler);
        System.out.println(baskentler.get("İngiltere"));
        System.out.println("Silmeden önce "+baskentler);
        baskentler.remove("Almanya");
        System.out.println("Sildikten sonra "+baskentler);
        System.out.println(baskentler.size());
        for(String i : baskentler.keySet())
            System.out.println("Anahtar:"+i+ " değer:"+baskentler.get(i));
        
        System.out.println("-------------");
        
        HashMap<String,Integer> insanlar = new HashMap<String,Integer>();
        insanlar.put("Ahmet",30);
        insanlar.put("Aslı",25);
        insanlar.put("Berk",20);
        System.out.println(insanlar);
        System.out.println(insanlar.get("Ahmet"));
        
        
    }
    
}
