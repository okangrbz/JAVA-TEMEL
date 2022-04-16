package day46_Iterators_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTertenYazdirma {
    public static void main(String[] args) {

        //verilen bir listeyi iterrators ile sondan basa dogru yazdiralim
        List<Integer> liste = new ArrayList<>(Arrays.asList(5,6,7,8,9));

        //once iterators u olsuturp sona yollayalim

        ListIterator itr=liste.listIterator();


        while (itr.hasNext()){
            itr.next();
        }
        while (itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }


    }
}
