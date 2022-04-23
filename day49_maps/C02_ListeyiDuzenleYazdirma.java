package day49_maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenleYazdirma {
    public static void main(String[] args) {
        //sinif listesini duzenli bir sekilde yazdir

        Map <Integer,String> sinif=MapOlustur.myMaps();//{101=Ali, Can , Dev, 102=Veli, Yan , QA, 103=Ali, Yan , Dev}
        System.out.println(sinif);

        sinifListYazdir(sinif);


    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("==========================");

        //maps yapisindan yazdirdigimizda kullanicilar birsey anlamayabilir
        //bunun icin once maps yapisini codlarla manipule edip
        //maps deki datalari istedigimiz formata sokmamiz gerekir
        //1. adim key ve value leri maps den alip
        //iki farkli collection uyesine atadik
        Set <Integer> keySet = sinif.keySet();
        Collection<String> valueSet= sinif.values();

        System.out.println(keySet);
        System.out.println(valueSet.size());

        for (String each:valueSet) {
            System.out.println(each);

        }



    }
}
