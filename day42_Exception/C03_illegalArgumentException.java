package day42_Exception;

import java.util.Scanner;

public class C03_illegalArgumentException {
    public static void main(String[] args) {

        /*
        Kullanicidan yasini isteyin
        Kullanici yas olarak negatif bir sayi,
        0 veya
        120 den buyuk bir sayi girerse illegalArgumetException olusucak sekilde
        bir program yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen yasinizi giriniz :");
        int yas=scan.nextInt();

        if (yas<=0||yas>120 ){
           // System.out.println("lutfen gecerli bir yas giriniz");
           // Java bizim istedigimiz durumlarda exception firlatabilir
           throw new IllegalArgumentException();
        }else System.out.println("Uygun yas girdiniz tesekkurler");


    }
}
