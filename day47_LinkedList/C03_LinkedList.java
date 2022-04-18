package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<>();

       // System.out.println(ll1.element());//bosken kullanirsak exception firlatiyor
        System.out.println(ll1.peek());//null bosken kullanirsak null dondurur

        System.out.println(ll1.poll());//null hem donduruyor hem remove ediyor bossa null dondurur
        System.out.println(ll1.pollFirst());//null hem donduruyor hem remove ediyor bossa null dondurur
        System.out.println(ll1.pollLast());//null hem donduruyor hem remove ediyor bossa null dondurur

        //System.out.println(ll1.pop()); //ilk elementi silip bize dondurur
                                        //ilk elementi bulamazsa exception firlatir

        ll1.push(30);//listenin basina element ekler
        ll1.push(20);
        System.out.println(ll1);//[20, 30]

        System.out.println(ll1.remove());//20  ilk elementi siler ve bize dondurur
        ll1.push(40);
        ll1.push(50);
        ll1.push(30);

        System.out.println(ll1.remove(50));// girilen elemani siler varsa true doner yoksa null
        System.out.println(ll1);//[40, 30]

        System.out.println(ll1.removeLastOccurrence(30));//girilen elemani siler varsa ture doner yoksa false
        System.out.println(ll1);


    }
}
