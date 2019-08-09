package cokbicimlilik;

class Hayvan{
    public void HayvanSesi(){
        System.out.println("Hayvan ses çıkarır.");
    }
}
class Kopek extends Hayvan{
    public void HayvanSesi(){
        System.out.println("Hav");
    }
}
class Kedi extends Hayvan{
    public void HayvanSesi(){
        System.out.println("Miyav");
    }    
}

public class Cokbicimlilik {
    public static void main(String[] args) {
        Hayvan hayvan1 = new Hayvan();
        hayvan1.HayvanSesi();
        Kopek kopek1 = new Kopek();
        kopek1.HayvanSesi();
        Kedi kedi1 = new Kedi();
        kedi1.HayvanSesi();
    }
}
