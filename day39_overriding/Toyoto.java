package day39_overriding;

public class Toyoto extends Araba{

    protected String hiz="Toyota araclar max 220 km hiz yapar";
    protected String marka="Toyota";
    String sirkeMerkezi="Japonya";

    public void motor(){
        System.out.println("Toyota arabalar Toyata marka motor kullanirlar");
    }
   public void granti(){
       System.out.println("Toyata araclar 10 yil garantilidir");
   }
}
