package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
        LinkedList in é tane parent Interface i vardir.
        LinkedList olusutrurken data turu olarak
        LinkedList secersek : iki parent daki tum methodlar kullanilabilir
        List secersek: sadece List interface indeki methotlar
        Deque veya queu secersek: Deque deki methodlari kullanabiliriz
         */

        LinkedList <Integer> ll1=new LinkedList<>();
        ll1.add(10);//linkedList classindan bu meth calsitirir data turu LinkedList


        //sadece list interface inden gelen ozellikleri kullanmak istersek

        List<Integer> ll2=new LinkedList<>();

        ll2.add(10);
        ll2.remove(0);

        //sadece deque den gelen ozellikleri kullanalim dersek

        Deque<Integer> ll3=new LinkedList<>();

        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);//[15, 20]
        ll3.addLast(40);//[15, 20,40]


    }
}
