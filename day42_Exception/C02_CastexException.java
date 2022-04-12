package day42_Exception;

public class C02_CastexException {
    public static void main(String[] args) {

        int sayi=10;

        //String str=sayi;  CTE

        Object str3="java cok guzel";
        String str4=(String) str3;
        System.out.println(str4);


        Object sayi2=20;

        String str2=(String) sayi2; //Explicit Narrowing
                                    //ClassCastException

        System.out.println(str2);

    }
}
