package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void AbstractMethod();
    /*
    Abstract methodlar child classlarin mutlaka override etmesi gereken methodlaradir.
    dolayisyla hic bir zaman direk caliustirlmazlar
    ve bu sebeple method badisine ihtiyac yoktur.

    Bir class in veya methodun abtract olup olmadigini anlayabilir miyiz°
    abtract yaziyorsa abtracttir, yazmiyorsa abstract degildir
    (abstract olmayan classlara concrete(somut) class/method denir)

    Abstract methodlar bady ye sahip olamaz
    concrete methodlar ise method bady si olmadan olusuturlamaz
     */

}
