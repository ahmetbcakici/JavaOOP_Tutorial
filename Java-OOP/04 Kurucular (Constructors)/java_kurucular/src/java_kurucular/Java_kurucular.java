/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_kurucular;

/**
 *
 * @author ABUGRA
 */
public class Java_kurucular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        System.out.println(Bisiklet.bisiklet_sayaci);
        Bisiklet bisiklet1 = new Bisiklet();
        Bisiklet bisiklet2 = new Bisiklet();
        Bisiklet bisiklet3 = new Bisiklet();
        Bisiklet bisiklet4 = new Bisiklet();
        Bisiklet bisiklet5 = new Bisiklet();
        System.out.println(Bisiklet.bisiklet_sayaci);
        Bisiklet bisiklet_ozel = new Bisiklet("Ahmet");
        System.out.println(Bisiklet.bisiklet_sayaci);
    }
    
}
