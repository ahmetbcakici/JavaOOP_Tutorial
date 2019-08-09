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
public class bisiklet {
    int hiz = 10;
    int vites = 1;
    //mevcut vitesim 1 , mevcut hizim 30
    void VitesDegis(int yenideger){
        if(yenideger > vites) HizArttir();
        vites = yenideger;//mevcut vitesim 2 oldu
        
        
    }
    void HizArttir(){
        hiz += 5;//mevcut hızım 30 idi artık 35
    }    
}
