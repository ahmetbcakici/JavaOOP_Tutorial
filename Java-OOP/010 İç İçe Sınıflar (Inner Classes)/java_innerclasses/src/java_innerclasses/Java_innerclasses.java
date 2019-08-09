
package java_innerclasses;


class Universite{
    String universite_ismi;
    int x = 10;
    class Fakulte{
        int x = 5;
        String fakulte_ismi;
        void XDondur(int x){
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Universite.this.x);
        }
    }
    class MYO{
        String myo_ismi;
    }
}

public class Java_innerclasses {
  public static void main(String[] args) {
      
      
      Universite u1 = new Universite();
      Universite.Fakulte f1 = u1.new Fakulte();
      f1.fakulte_ismi = "Mühendislik Fakültesi";
      System.out.println(f1.fakulte_ismi);
      f1.XDondur(2);
      
      /*Universite.Fakulte f1 = new Universite.Fakulte();
      f1.fakulte_ismi = "Hukuk Fakültesi";
      System.out.println(f1.fakulte_ismi);*/
  }
}
