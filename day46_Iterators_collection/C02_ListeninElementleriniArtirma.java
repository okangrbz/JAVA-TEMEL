package day46_Iterators_collection;

import java.util.*;

public class C02_ListeninElementleriniArtirma {
    public static void main(String[] args) {
        //verilen listedeki her elementi 3 artirin

        List<Integer> liste = new ArrayList<>(Arrays.asList(5,6,7,8,9));

        System.out.println(liste);//[5, 6, 7, 8, 9]
/*
listenin tum elementlerini bize getirmesi icin iterrators in hasNext() ve next()
methlarini beraber kullanacagiz
 */

        ListIterator itr=liste.listIterator();

        while (itr.hasNext()){//yaninda eleman oldugu mutdecce calisacak


           Object sayi=itr.next();
           itr.set((Integer)sayi+3);


        }

        System.out.println(liste);
    }
}
