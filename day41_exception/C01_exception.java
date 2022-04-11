package day41_exception;

public class C01_exception {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;
        try {
            c=a/b;
        } catch (Exception e) {
            //Burada yazdigimiz e javanin exception u atayacagi obj
            //Exception ise olusan exceptionun turudur
            System.out.println(e.getMessage());
            System.out.println(e.toString());

        }

        System.out.println(c);

    }
}
