package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMaps(){
        Map<Integer, String> siniflist = new HashMap<>();
        siniflist.put(101, "Ali, Can, Dev, 1453");
        siniflist.put(102, "Veli, Yan, QA, 1990");
        siniflist.put(103, "Ali, Yan, Dev, 2000");
        siniflist.put(104, "Ayse, Kan, QA, 2001");
        siniflist.put(105, "Fatma, Han, Dev, 2002");

        return siniflist;
    }
}
