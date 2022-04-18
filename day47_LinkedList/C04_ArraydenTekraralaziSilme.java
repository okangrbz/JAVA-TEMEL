package day47_LinkedList;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydenTekraralaziSilme {
    public static void main(String[] args) {
        /*
        verilen bir arraydan tekrara eden elementleri silip
        unique elementlerden olusan bir array haline donduren bir meth yazin
         */

        Integer arr[] = {3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8, 9, 5, 6, 88};

        arr = uniqueYap(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static Integer[] uniqueYap(Integer[] arr) {
        Set<Integer> benzesizset = new TreeSet<>();
        for (Integer each : arr) {
            benzesizset.add(each);
        }
        //System.out.println(benzesizset);
//set lerde index yapisi yoktur oyuzden foor loop kullanamayiz

        Integer arrbenzersiz[] = new Integer[benzesizset.size()];

        int index = 0;
        for (Integer eac : benzesizset) {
            arrbenzersiz[index] = eac;
            index++;

        }
        return arrbenzersiz;
    }


}
