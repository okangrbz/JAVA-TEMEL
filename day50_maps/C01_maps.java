package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_maps {
    public static void main(String[] args) {
        //siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer, String> sinifListMap = MapOlustur.myMaps();
        System.out.println(sinifListMap);//{101=Ali, Can , Dev, 102=Veli, Yan , QA, 103=Ali, Yan , Dev}

        /*
        Eger keylere tek tek ulasmak istersek index yapisina ihtiyacimiz var
        ancak maps index yapisini desteklemez
        bunu icin keyleri once sete sonrada set in tum elementlerini bir liste ekledik.
         */
        Set<Integer> sinifKeySeti = sinifListMap.keySet();//keyleri set e atadik

        //bu arrayle yaparsak
        int keyarr[] = new int[sinifListMap.size()];
        int index = 0;
        for (Integer each : sinifKeySeti) {
            keyarr[index] += each;
            index++;

        }
        System.out.println(Arrays.toString(keyarr));

        //buda listle yaparsak
        List<Integer> keylist = new ArrayList<>();
        keylist.addAll(sinifKeySeti);
        System.out.println(keylist);


        //Simdi valueleri index ile ulasabilecegimiz bir sekle sokalim


        Collection<String> valueListCol=sinifListMap.values();//collection a cevirdik
        System.out.println(valueListCol.size());

        List<String> valueList = new ArrayList<>();//burdada liste attik
        valueList.addAll(sinifListMap.values());
        System.out.println(valueList);

        /*
        Her bir value birde fazla bilgiyi iceriyor
        Onun icin valuleri multi dimention bir array a atmak mantikli
        Ancal multi dimention array olusuturmak icin boyutlari bilmeye ihtiyac var

         */


        int outerArrayBoyuz=valueList.size();


        //inner arraylarin boyutunu bulmak biraz daha complex

        String ilkvalue=valueList.get(0);
        System.out.println(ilkvalue);
        String ilkvaluearr[]=ilkvalue.split(", ");

        int innerarrBoyut=ilkvaluearr.length;

        String valueMDarr[][]=new String[outerArrayBoyuz][innerarrBoyut];

        for (int i = 0; i < outerArrayBoyuz; i++) {
            String temp[] = valueList.get(i).split(", ");
            for (int j = 0; j < innerarrBoyut; j++) {
            valueMDarr[i][j]=temp[j];


            }

        }


        //Bu satira kadar keyleri index ile ulasabildigim keylist e attik
        //valuleri valueMDarr e attadim
        //simdi bu key ve valuleri istedigim gibi manipule edebilirim

        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("==========================");
        for (int i = 0; i < keylist.size(); i++) {
            System.out.print(keylist.get(i)+"    ");
            for (int j = 0; j < innerarrBoyut; j++) {
                System.out.print(valueMDarr[i][j]+"    ");

            }
            System.out.println("");
        }



    }
}
