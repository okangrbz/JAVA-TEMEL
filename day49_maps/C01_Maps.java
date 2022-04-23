package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        /*
java da collection uyesi bir yapida
data turu obj secersek her data tiurunden deger ekleyebiliriz
ancak bu durumda degistirmek problem olabilir, surekli casting problemleri ile karsilasiriz
         */

        List<Object> list = new ArrayList<>();
        list.add("ergin");
        list.add(15);
        list.add(10.2);
        System.out.println(list);
        list.set(1, (Integer) (list.get(1)) + 10);
        System.out.println(list);

        Map<Integer, String> siniflist = new HashMap<>();
        //bir sinifta ogrenci no ve isim, soyisim brans olarak mak olusuturmak istiyoruz
        //key tek bir unique degerdir
        //value birden fazla bilginin birlesiminden olusabilir
        //bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmek icin
        //tum elementler icin value ayni bicimde olusturulmalidir
        //(veri siralamasi ve sekilsel acidan)

        siniflist.put(101, "Ali, Can, Dev, 1453");
        siniflist.put(102, "Veli, Yan, QA, 1990");
        siniflist.put(103, "Ali, Yan, Dev, 2000");
        siniflist.put(104, "Ayse, Kan, QA, 2001");
        siniflist.put(105, "Fatma, Han, Dev, 2002");

        System.out.println(siniflist);//{101=Ali, Can , Dev, 102=Veli, Yan , QA, 103=Ali, Yan , Dev}
        System.out.println(siniflist.keySet());//[101, 102, 103]
        System.out.println(siniflist.values());//[Ali, Can , Dev, Veli, Yan , QA, Ali, Yan , Dev]




    }
}
