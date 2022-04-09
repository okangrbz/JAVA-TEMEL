package day39_overriding;

public class OverridingChild extends OverridingParent{

    public void method1(){
        System.out.println("child class method1");

    }

    public static void main(String[] args) {


        /*
        Bir obj olusuturulurken data turu ve constracteur ayni classdan secilmisse
        java direk o classa gider hem variable hem de method icin o classda varsa kullanir
        yoksa o class in parentlarina bakar
         */
        OverridingChild ob1=new OverridingChild();
        ob1.method1();//child class method1
        ob1.method2();//parent class method2

        OverridingParent ob3=new OverridingParent();
        ob3.method2();//parent class method2
        ob3.method1();//parent class method2


        /*
        Eger data turu parent, constracteur chil classdan secildiyse
        variablelerde yukaridaki sekilde calisma devam eder
        Ancak Methodlar icin data turunun oldugu classdaki method
        child class tarafindan overrid edilmismi diye control etmemiz gerekir
        Eger child classlarda bu method overrid edilmisse overrid olan method calisir
         */

        OverridingParent ob2=new OverridingChild();
        ob2.method2();//parent class method2
        ob2.method1();//child class method1

    }

}
