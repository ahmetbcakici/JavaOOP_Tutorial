/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_siniflar;

class BenimSinifim{
    static int x = 5;
}

public class Java_siniflar {    
    public static void main(String[] args) {
        BenimSinifim nesne = new BenimSinifim();
        System.out.println(nesne.x);
        BenimSinifim nesne2 = new BenimSinifim();
        System.out.println(nesne2.x);
        System.out.println("staticli çağrı "+BenimSinifim.x);
    }    
}
