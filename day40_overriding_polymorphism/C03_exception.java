package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_exception {
    public static void main(String[] args) {
        //kullanicidan 2 sayi alip bolerek
        //sonucu yazdiran bir program creat ediniz

        Scanner scan=new Scanner(System.in);
        int kotrol=0;
        while (kotrol!=2){
            System.out.println("bolmek istediginiz sayiyi yaziniz :");
            int sayi1= scan.nextInt();

            System.out.println("kaca bolmek istediginiziz yaziniz :");
            int sayi2= scan.nextInt();


            try {
                System.out.println("sonuc : "+sayi1/sayi2);
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("girdiginiz sayilarda sorun var");
            }

            System.out.println("devam etmek icin 1\nBitirmek icin 2 ye basiniz");
            kotrol=scan.nextInt();


        }


        /*
        Sayi2 0 oldugunda sayi1/0 tanimsiz olacagindan
        java bu durumla karsilasinca exception firlatir.

        Javanin yazdigi mesajda exception un ne tur bir sorun oldugu
        neden kaynaklandigi ve hangi satirda olustugu yazar.
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overriding_polymorphism.C03_exception.main(C03_exception.java:18)

       Bunu cozmek icin sayi 2 yi if ile kotrol edebiliriz



        if (sayi2==0){
            System.out.println("Sayi / 0 tanimsizdir");
        }else
        {
        System.out.println("sonuc : "+sayi1/sayi2);

        ama bu yontem her sozunda calismaz
*/

        }
}









