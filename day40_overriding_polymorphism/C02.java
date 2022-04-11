package day40_overriding_polymorphism;

public class C02 extends C01{

    /*
    @Override notasyonu overriden (overrid edilmis method) ile overriding methodu birbirine baglar
    dolayisiyla farkinda olunmadan overriden method silinirse veya
    signaure degistirilirse bu iliski bozulacagi icin java CTE verir

    Notasyon kullanilmazsa java bunlarin iliskisini bilir ama
    overriden method silinirse sesini cikarmaz
     */


    private void method4(){
        System.out.println("Parent method 4");
        //Prarent class'daki provat methoda
        //child class dan ulasmamiz mumkun olmadigindan
        //java bu iki metmodu
        //TAMAMEN FARKLI IKI METHOD olarak kabul eder
        //@Override kullanmak istersek kabul etmez CTE hatasi verir
    }

    @Override
    protected String method3(){
        //Covariant icin yazili
        return "java";
    }

    @Override
    public void method2() {
        System.out.println("child method 2");
    }

    public static void main(String[] args) {


        C02 obj = new C02();

        obj.method1();//Parent method 1
        obj.method2();//child method 2

        System.out.println("");

        C01 obj2 = new C02();

        obj2.method1();//Parent method 1
        obj2.method2();//child method 2

        System.out.println("");

        C01 obj3 = new C01();

        obj3.method1();//Parent method 1
        obj3.method2();//parent method 2

    }
}
