package java_enums;


enum Mevsimler{
    YAZ,KIS,ILKBAHAR,SONBAHAR
}

class Mevsimler2{
    public static final int YAZ = 0;
    public static final int SONBAHAR = 0;
    public static final int ILKBAHAR = 0;
    public static final int KIS = 0;    
}

public class Java_enums {

    
    public static void main(String[] args) {
        Mevsimler deger = Mevsimler.YAZ;
        System.out.println(deger);
    }    
}
