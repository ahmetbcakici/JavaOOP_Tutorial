/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_abstraction;


abstract class Hayvan{
    public abstract void HayvanSesi();
    public void uyu(){
        System.out.println("zzz");
    }
}

class Kedi extends Hayvan{
    public void HayvanSesi(){
        System.out.println("Kedi miyavlar.");
    }
}

public class Java_abstraction {

    public static void main(String[] args) {
        Kedi k1 = new Kedi();
        k1.HayvanSesi();
        k1.uyu();
        
        
    }
    
}
