package day51_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_maps {
    /*
   Soru 1 ) Verilen bir String’deki harfleri ve harflerin kacar
   kez kullanildigini return eden bir method yaziniz
Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3

    */
    public static void main(String[] args) {


        String input = "Helloooooo";
        String harflerarr[] = input.split("");

        Map<String, Integer> kullanimSayilari = new HashMap<>();

        for (String each : harflerarr) {
            if (kullanimSayilari.containsKey(each)) {
                kullanimSayilari.put(each, kullanimSayilari.get(each) + 1);
            } else {
                kullanimSayilari.put(each, 1);

            }



        }
        System.out.println(kullanimSayilari);
    }
}
