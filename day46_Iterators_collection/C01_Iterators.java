package day46_Iterators_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterators {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>(Arrays.asList(5,6,7,8,9));

        Iterator itr=liste.iterator();//iterratirs methodunu olusturdugumuz liste objsi
                                      //uzerinden ArraysListe class indan calisitiriyoruz



        /*
        iterrators nasil calsisir?
        bir iterators obj olusturmak icin collection uyesi bir obj kulanmaliyiz
         Iterator itr=liste.iterator();
        yani biz bu iterators objesini bizim ornegimizde liste obj uzerinde
        calismak icin olusutrmus olduk
        Biz iterators obj olusuturdugumuzda
        iterators collection un ilk elementinin oncesine gidip bekler
        [ (itr)5,6,7,8,9]

        itr.hasNext()===> (yaninda 5 var) true  iterrators a yaninda eleman var mi diye sorar true veya fals dondurur

        itr.next()==> iterators bir sonraki elementin yanina gecer ve uzerinden gectigi
        elementi bize dondurur

        [ 5,(itr)6,7,8,9]==> bize 5 dondurur
        [ 5,6,(itr)7,8,9]==> bize 6 dondurur


        itr.remove();// iterators un elinde olan elementi sildi
        dolayisiyla ust uste iki kere itr.remove(); kullanilamaz

        once itr.next() meth calisitirip iterrators un bir element kalmasini saglamaliyiz
         */

        System.out.println(itr.hasNext());//true

        System.out.println(itr.next());//5
        System.out.println(itr.next());//6
        itr.remove();//

        System.out.println(liste);
       // itr.remove();
    }
}
