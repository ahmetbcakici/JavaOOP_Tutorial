/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_arraylist;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author ABUGRA
 */
public class Java_arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> arabalar = new ArrayList<String>();
        arabalar.add("Ford");
        arabalar.add("Volvo");
        arabalar.add("BMW");
        arabalar.add("Mercedes");
        arabalar.add("Mazda");
        System.out.println(arabalar);
        System.out.println(arabalar.get(2));
        System.out.println("Değiştirmeden önce "+arabalar.get(4));
        arabalar.set(4, "Opel");
        System.out.println("Değiştirdikten sonra "+arabalar.get(4));
        System.out.println("Silmeden önce "+arabalar);
        arabalar.remove(1);
        System.out.println("Sildikten sonra "+arabalar);
        System.out.println("Dizideki nesne sayısı : "+arabalar.size());
        //arabalar.clear();
        //System.out.println("Temizledikten sonra "+arabalar);
        for(int i = 0;i < arabalar.size();i++){
            System.out.println(arabalar.get(i));
        }
        System.out.println("------");
        for(String nesne : arabalar){
            System.out.println(nesne);
        }
        
        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(15);
        Collections.sort(sayilar);
        System.out.println(sayilar);
        Collections.sort(arabalar);
        System.out.println(arabalar);
    }
    
}
