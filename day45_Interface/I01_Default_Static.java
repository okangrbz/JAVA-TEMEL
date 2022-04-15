package day45_Interface;

public interface I01_Default_Static {

    /*
    Interfacelerde sadece abstract meth bulunur
    body si olan concrete bir method olusutrmak istedigimiz de
    java CTE verir

    Ancak Java 8 ve uzeri versiyonlarda istisnai olarak
    static veya default olarak tanimlanan methodlarin body si oalabilir
    ancak burada kullanilan default keyword u acces mofiier degildir
    cunku interfacelerde tum methodlar public ve abstract di

    asagidaki ornekte gorulecegi gibi default olarak tanimlanmis
    bir methoda access modifier olarak public yazabilirisiniz
    (access modifier yazmasakta java methodu public olarak kabul edecektir)
     */


    void method1();

  public default void method2(){
      System.out.println("Interface deki defaut method");
  }

  static void method3(){System.out.println("Interface deki static method");}

}
