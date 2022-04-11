package day24_lists.Replit;

public class Soru3_polindrom {
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
        System.out.println(input);
        String str=""+input;

        input.reverse();
        String tersstr=""+input;
        System.out.println(input);

        if (str.equalsIgnoreCase(tersstr)){
            System.out.println(str+ " cumlesi bir Plindrom'dur");
        }else System.out.println(str+ " cumlesi Plindrome degildir");











    }
}
