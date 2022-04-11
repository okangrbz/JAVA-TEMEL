package day40_overriding_polymorphism;

public class C04_exception {
    public static void main(String[] args) {
        //String olarak verilen bir sayiyi int cevirp
        // 2 katini ekranda yazdiralim

        String str="12345a";

        //str icinde sayi olmayan bir karakter olursa hata verir
        //NumberFormatException.forInputString



        try {
            int sayi=Integer.parseInt(str);
            System.out.println("girilen sayinin iki kati : "+2*sayi);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("girdiginiz string sayi olmayan elemetler iceriyor");
        }
    }
}
