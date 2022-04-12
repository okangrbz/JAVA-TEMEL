package day41_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)   {
    /*
    bir code yazilirken olasi exceptionlar on gorulup
    exception olusutugunda java nin ne yapmasini istedigimiz
    belirtilmelidir.

    1-Eger exception olusutugunda codun calismaya devam etmesini istemiyorsak
        method isminin yanina olusabilecek exception i declare edebiliriz throws yazariz
    2-Eger exception olussada codun calismasina devam etmesini istiyorsak
        sorun olusturabilecek code try catch bulogunun icine alir
        try buloguna sorun cikabilecek codu
        catch bloguna olusabilecek excepyion u olasi exception durumunda
        javanin ne pyapmak istedigini yazabiliriz
     */


        String dosyaYolu="src/day41_exception/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
