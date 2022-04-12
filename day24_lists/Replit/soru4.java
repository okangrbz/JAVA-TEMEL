package day24_lists.Replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru4 {
    /*
    Write a program that accepts an integer as input and prints first 10
    prime numbers greater than input Check numbers if they are even or not in a return method.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
     */

    public static void main(String[] args) {
        System.out.println("bir sayi giriniz");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        int sayac = 0;

        List<Integer> list = new ArrayList<Integer>();

        sayi++;
        while (sayac < 10) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }

            }
            if (sayac == 0) {
                list.add(sayi);
                sayac++;
            }
            sayi++;


        }
        System.out.println(list);

    }
}
