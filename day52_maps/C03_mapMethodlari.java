package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_mapMethodlari {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("H", 3);
        myMap.putIfAbsent("K", 5);

        //Bir ekleme yapmak istedigimizde Key daha once eklemnmemsise map e eklesin
        //Daha onceden eklenmisse eskiyi silmemek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A", 6));
        if ((myMap.putIfAbsent("K", 20) != null)) {
            System.out.println("girdiginiz key mapde zaten var");
        }

        System.out.println(myMap);//{A=6, H=3, K=5}

        myMap.put("A",10);//bu direk eskisini oldurup yeni degeri yazdiriyor
        System.out.println(myMap);//{A=10, H=3, K=5}

        //compute()=====compute(key, (key,value) value)-->yeniDeger); verilen map'deki istenen
        // key degerine sahip elemanin value'sunu gunceller key map'te yoksa ekler
        myMap.computeIfAbsent("A",v->20);//yoksa degisitirir varsa dokunmaz
        System.out.println(myMap);//{A=10, H=3, K=5}

        myMap.compute("A",(key,value)->20);//bu degisitiriyor
        System.out.println(myMap);//{A=20, H=3, K=5}

        //H nin degerini 2 katinin 5 fazlasi yapalim

        myMap.compute("H",(k,v) ->(2*v+5));//degeri degistirebiliriz
        System.out.println(myMap);//{A=20, H=11, K=5}




    }
}
