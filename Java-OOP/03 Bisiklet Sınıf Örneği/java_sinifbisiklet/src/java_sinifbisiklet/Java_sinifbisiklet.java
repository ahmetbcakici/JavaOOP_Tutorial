/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_sinifbisiklet;

/**
 *
 * @author ABUGRA
 */


public class Java_sinifbisiklet {

    
    public static void main(String[] args) {
        bisiklet bisiklet1 = new bisiklet();
        bisiklet1.hiz = 30;
        System.out.println("Bisiklet1 hız : "+bisiklet1.hiz+"\nBisiklet1 vites : "+bisiklet1.vites);
        //mevcut vitesim 1 , mevcut hizim 30
        bisiklet1.VitesDegis(2);
        //bisiklet1.hiz = 35
        //bisiklet1.vites = 2
        System.out.println("-------------------");        
        System.out.println("Bisiklet1 hız : "+bisiklet1.hiz+"\nBisiklet1 vites : "+bisiklet1.vites);
        
        
    }
    
}
