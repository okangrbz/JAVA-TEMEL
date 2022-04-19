package day48_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_set {
    public static void main(String[] args) {
        //verilen bir arryin tekrar eden elementlerini
        // sadece bir kere yazdiran bir method olusuturunuz


        int arr[] = {3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8, 9, 5, 6, 88};
        arr = arryiTekrarsizyazdir(arr);

        System.out.println(Arrays.toString(arr));




    }

    private static int[] arryiTekrarsizyazdir(int[] arr) {
        Set <Integer> tekrarsizElementkumesi=new HashSet<>();

        for (Integer each :arr) {
            tekrarsizElementkumesi.add(each);

        }
       // System.out.print(tekrarsizElementkumesi);

        int index=0;
        int tekrarsizarr[]=new int[tekrarsizElementkumesi.size()];

        for (Integer each :tekrarsizElementkumesi) {
            tekrarsizarr[index]=each;
            index++;

        }
        return tekrarsizarr;

    }

}
