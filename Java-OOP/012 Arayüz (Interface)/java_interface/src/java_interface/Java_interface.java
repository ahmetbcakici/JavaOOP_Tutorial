/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_interface;

interface Hayvan{
    public void HayvanSesi();
    public void Koş();
}
interface Canli{
    public void NefesAl();
}

class Kedi implements Hayvan,Canli{
    @Override
    public void HayvanSesi() {
        System.out.println("Kedi miyav der");
    }

    @Override
    public void Koş() {
        System.out.println("Kedi koşuyor..");
    }    

    @Override
    public void NefesAl() {
        System.out.println("Kedi nefes alıyor.");
    }
}
class Kopek implements Hayvan{
    @Override
    public void HayvanSesi() {
        System.out.println("Kopek hav der");
    }

    @Override
    public void Koş() {
        System.out.println("Kopek koşuyor..");
    }    
}


public class Java_interface {    
    public static void main(String[] args) {
        Kedi k1 = new Kedi();
        k1.HayvanSesi();
        k1.Koş();
        k1.NefesAl();
        Kopek ko1 = new Kopek();
        ko1.HayvanSesi();
        ko1.Koş();
    }    
}
