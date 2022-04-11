package day24_lists.Replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String str= scan.nextLine();

        System.out.println(terstenYazdirma(str));


    }

    private static String terstenYazdirma(String cumle) {
        String arrstr[]=cumle.split("");
        List<String> trsarrlis=new ArrayList<>();
        String ters="";
        for (int i = arrstr.length-1; i >= 0; i--) {
            trsarrlis.add(arrstr[i]);

        }
        for (int i = 0; i < trsarrlis.size(); i++) {
            ters+=trsarrlis.get(i);


        }

        return cumle;


    }

}
