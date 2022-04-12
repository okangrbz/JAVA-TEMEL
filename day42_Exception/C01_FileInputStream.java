package day42_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu="src/day41_exception/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read())!=-1) {
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }    catch (IOException e) {
            e.printStackTrace();

        }

        /*
        Alti kirmizi cizili her code CTE degildir
        Java syntax hatalarini derleme esnasinda (compile) farkeder ve altini cizer
        biz bu gune kadar tamamini CTE diyorduk ancak
        exception ile birlikte Compile Time Exception kavrami da hayatimiza girdi
         */
        /*
        Exceptionlar icinde parent child iliskisi vardir
        Eger bir code icin birden fazla exception olusumu ihtimali varsa
        oncelikle olasi exceptionlar parent child iliskisi olup olmadigina bakariz
        Eger parent chil diliskisi yoksa istedigimiz kadar catch olusturabiliriz.

        Eger parent child isliskisi varsa sadece parent exception i yazabiliriz
        veya ikisini de yazmak istersek once parent i sonra child i yazmaliyiz

        */

    }
}
