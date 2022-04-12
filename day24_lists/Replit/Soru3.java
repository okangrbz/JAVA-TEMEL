package day24_lists.Replit;

public class Soru3 {
    public static void main(String[] args) {
        /*
        Write a java program which accept a sentence as parameter, than reverses sentence by
        using StringBuilder and checks if sentence is palindrome
         or not (without case sensitivity).Use StringBuilder.

Input :

I love Java.

Output:

Reversed sentence : avaJ evol I. It is not a palindrome"
         */


        StringBuilder input = new StringBuilder("I love Java.");
        String str=input.toString();
        System.out.println(str);

        input.reverse();
        String tersstr=input.toString();
        System.out.println(tersstr);


        if (str.equalsIgnoreCase(tersstr)){
            System.out.println(tersstr+" cumlesi bir palindromdur");
        }else System.out.println(tersstr+ " cumlesi bir palindrrom degildir");



    }
}
