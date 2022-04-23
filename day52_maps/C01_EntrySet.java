package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap=MapOlustur.myMaps();

        System.out.println(sinifListMap.entrySet());//[101=Ali, Can, Dev, 1453, 102=Veli, Yan, QA, 1990, 103=Ali, Yan, Dev, 2000, 104=Ayse, Kan, QA, 2001, 105=Fatma, Han, Dev, 2002]
        System.out.println(sinifListMap);//{101=Ali, Can, Dev, 1453, 102=Veli, Yan, QA, 1990, 103=Ali, Yan, Dev, 2000, 104=Ayse, Kan, QA, 2001, 105=Fatma, Han, Dev, 2002}

        /*
        myMap..entrySet(); methodu bize entriylerden olusan bir set dondurur
        eger bu Entry leri manupule etmek istiyorsak
        method un dondugu seti yeni bir set olusuturup stor etmeliyiz
         */
        Set<Map.Entry<Integer,String>>sinifEntrySeti =sinifListMap.entrySet();

        System.out.println("====================================");
        System.out.println("No  Isim  Soyisim Branche   D.Yili\n====================================");
        for (Map.Entry<Integer,String> each : sinifEntrySeti) {

            Integer entryKey=each.getKey();
            String etryValue=each.getValue();
            //String entrystr=each.toString();//each i stringe cevirp entrystr a atadik

            String valuearr[]=etryValue.split(", ");

            System.out.printf("%-4d %-6s %-8s %-6s %s \n", entryKey, valuearr[0], valuearr[1], valuearr[2], valuearr[3]);
        }
        System.out.println("====================================");
    }
}
