package day46_Iterators_collection;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {

        //hem list hemde Queue'nun child classidir
        LinkedList <Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(10);//add methodu listengeldigi icin listede hep sona ekler
        list.addFirst(11);//addFirst deqeu den gelir, basa yazar
        list.addLast(12);// addLast deque den gelirsona ekler

        System.out.println(list);//[11, 5, 10, 12]
        list.add(2,25);

        System.out.println(list);//[11, 5, 25, 10, 12]

    }
}
