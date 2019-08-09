package kapsulleme;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABUGRA
 */
public class Kullanici {
    private String kullanici_adi;
    private String sifre;
    
    public String getKullaniciadi(){
        return kullanici_adi;
    }
    
    public void setKullaniciadi(String yenikullaniciadi){
        kullanici_adi = yenikullaniciadi;
    }
    
    public String getSifre(){
        return sifre;
    }
    
    public void setSifre(String yenisifre){
        if(yenisifre.length() > 9){
            System.out.println("9 karakterden fazla şifre kullanamazsınız!");
        }else{
            sifre = yenisifre;
        }
        
    }
    
    
    
    
}
