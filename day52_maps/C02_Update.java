package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    //Verilen maps deki numarasi 102 olan kaydin branchini java yapalim

    /*
    Maps de value complex olabildigi icin value icerisinden bir bolumu
    degisitirmek istersek;
    once valueye ulasmak
    sonra onu manupule ederek istedigimiz degisikligi yapmak
    ve en son degismis halini yeniden map e eklemek gerekir
     */
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= MapOlustur.myMaps();
        System.out.println(sinifListMap);

        Set<Map.Entry<Integer,String>>sinifEntrySet =sinifListMap.entrySet();
        for (Map.Entry<Integer,String> each : sinifEntrySet) {

            Integer key = each.getKey();

            if (key==102){
                String valustr=each.getValue();

                String valuearr[]=valustr.split(", ");
                valuearr[2]="Java";

                String valueYeni=valuearr[0]+", "+valuearr[1]+", "+valuearr[2]+", "+valuearr[3];
                sinifListMap.put(key,valueYeni);
            }



        }
        System.out.println(sinifListMap);



    }
}
