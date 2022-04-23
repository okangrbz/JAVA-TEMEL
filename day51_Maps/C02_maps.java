package day51_Maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_maps {
    /*
    Soru 2 ) Verilen map’te istenen programlama dilini bilen kisileri
     list olarak donduren bir method yaziniz.
 mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
 Istenen dil è java
 Sonuc è [Ali, Veli]
     */
    public static void main(String[] args) {

        Map<Integer, String> sinifMap = MapOlustur.myMaps();

        String istedenDil = "Dev";
        List<String> istenenDiliBilenler = istenenDiliBilenListesiOlustur(sinifMap, istedenDil);
        System.out.println(istenenDiliBilenler);


    }

    public static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifMap, String istedenDil) {

        List<String> istenenDiliBilenler = new ArrayList<>();
        Collection<String> valueListCol = sinifMap.values();
        List<String> valueList = new ArrayList<>();//burdada liste attik
        valueList.addAll(sinifMap.values());
        int outerArrayBoyuz = valueList.size();

        String ilkvalue = valueList.get(0);

        String ilkvaluearr[] = ilkvalue.split(", ");

        int innerarrBoyut = ilkvaluearr.length;
        String valueMDarr[][] = new String[outerArrayBoyuz][innerarrBoyut];
        for (int i = 0; i < outerArrayBoyuz; i++) {
            String temp[] = valueList.get(i).split(", ");
            for (int j = 0; j < innerarrBoyut; j++) {
                valueMDarr[i][j] = temp[j];


            }

        }
        System.out.println(Arrays.deepToString(valueMDarr));

        for (int i = 0; i < outerArrayBoyuz; i++) {

            if (valueMDarr[i][2].equals(istedenDil)) {
                istenenDiliBilenler.add(valueMDarr[i][0]);
            }

        }

        return istenenDiliBilenler;
    }

}

