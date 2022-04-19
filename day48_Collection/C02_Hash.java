package day48_Collection;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {

        String str="java cok guzel";
        System.out.println(str.hashCode());//520405140

        String str2="hava cok guzel";
        System.out.println(str2.hashCode());//1531522390

        Set <Integer> sayiKumesi=new HashSet<>();
        System.out.println(sayiKumesi.hashCode());// bos oldugu icin 0 verdi
        sayiKumesi.add(10);
        sayiKumesi.add(20);
        System.out.println(sayiKumesi.hashCode());//30



    }
}
