package day24_lists.Replit;

import java.util.ArrayList;
import java.util.List;

public class Soru5 {
    public static void main(String[] args) {
        /*
        Write a program to find the common elements between two String Arrays (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}

Input2 : {sofia,brad,grace,emily,hazel}

Output : [sofia,brad,emily]
         */

        String[] input1={"John","Brad","Ange","Sofia","Emily"};
        String[] input2={"sofia","brad","grace","emily","hazel"};
        List <String> list1=new ArrayList<String>();

        for (String each:input2) {
            for (String each2:input1) {
                if (each.equalsIgnoreCase(each2)){
                    list1.add(each);



            }

        }

        }
        System.out.println(list1);

    }

}
