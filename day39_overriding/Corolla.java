package day39_overriding;

public class Corolla extends Toyoto{
    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit="Corolla benzinli veya elektriklidir";
    protected String model="Corolla";


    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");
    }
    public  void yakitTuketimient(){
        System.out.println("Corolla 5.6 L yakit tuketir");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 vitesli arac uretir");
    }

    public static void main(String[] args) {

        /*
        data turu constracteur farli oldugunda constracteur calistiginda
        contracteur in oldugu class ozellikleri tasir
        Ancak data turu Parent class secildigi icin variableler data turunun secildigi
        class ve onun parenti classlarindan deger alabilir

        Methodlar icin ise yine Data turunun oldugu class a gideriz ancak
        direk methodu calistirmadan once
        method Overrid edilmismi diye kontrol ederiz
         */

        Corolla araba1=new Corolla();

        System.out.println(araba1.hareket);//araba clasina kadar gider
        System.out.println(araba1.hiz);//corolla classi
        System.out.println(araba1.yakit);//corolla classi
        System.out.println(araba1.marka);//toyoto classindan alacak
        System.out.println(araba1.sirkeMerkezi);//toyoto classindan aldi
        System.out.println(araba1.model);//corolla clasindan
        araba1.motor();//Corolla dan alir
        System.out.println("");


        Toyoto araba2=new Corolla();

        System.out.println(araba2.hareket);//araba clasina gider
        System.out.println(araba2.hiz);//toyota classindan alir cunku data turu toyota
        System.out.println(araba2.yakit);//parentan yani araba classindan alir
        System.out.println(araba2.marka);//toyoto classindan alacak
        System.out.println(araba2.sirkeMerkezi);//toyoto classindan aldi
       // System.out.println(araba2.model);//CTE
        araba2.motor();//Corolla araclar cevreci motor kullanir
        araba2.granti();//Toyata araclar 10 yil garantilidir
        araba2.yakitTuketimient();//Corolla 5.6 L yakit tuketir
        //araba2.vitesSayisi();   data turu olan toyotadan baslayinca boyle bir method bulamadik
        //dolayisiyla CTE

        System.out.println("");


        Araba araba3=new Corolla();

        System.out.println(araba3.hareket);//araba clasindan alir
        System.out.println(araba3.hiz);//araba classindan alir
        System.out.println(araba3.yakit);//araba classindan alir
        System.out.println(araba3.marka);//toyoto classindan alacak
        //System.out.println(araba3.sirkeMerkezi);//CTE
        //System.out.println(araba3.model);//CTE
        araba3.yakitTuketimient();//Corolla 5.6 L yakit tuketir
        araba3.motor();//Corolla araclar cevreci motor kullanir
        //araba3.granti();   aramaya araba class indan basladi ve methodu bulamadi
       // araba3.vitesSayisi(); ayni sebepten calismaz

    }

}
