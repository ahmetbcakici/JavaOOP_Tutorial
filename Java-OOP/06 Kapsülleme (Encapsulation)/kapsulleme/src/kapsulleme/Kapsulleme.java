/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapsulleme;

/**
 *
 * @author ABUGRA
 */
public class Kapsulleme {
    public static void main(String[] args) {
        Kullanici k1 = new Kullanici();
        k1.setKullaniciadi("ahmetbugra");
        k1.setSifre("12345");
        System.out.println(k1.getKullaniciadi());//ahmetbugra
        System.out.println(k1.getSifre());//12345
        
        System.out.println("-------");
        
        Kullanici k2 = new Kullanici();
        k2.setKullaniciadi("admin");
        k2.setSifre("123123123123123213");
        System.out.println(k2.getKullaniciadi());
        System.out.println(k2.getSifre());
        
    }
    
}
