package day45_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C03_Iteraters {
    public static void main(String[] args) {

        List <Integer> liste = new ArrayList<>(Arrays.asList(5,6,7,8,9));

        System.out.println(liste);//[5, 6, 7, 8, 9]

        //foreach kullanarak her elementi 2 artiralim

        for (int each:liste) {
            each=each+2;

        }
        System.out.println(liste);

        Iterator itr= liste.iterator();



    }
}
