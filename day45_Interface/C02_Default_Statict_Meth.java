package day45_Interface;

public class C02_Default_Statict_Meth implements I01_Default_Static{

    /*
    Bir interface de default veya static olarak tanimlanan ve bodysi olan
    methodlarin override edilmesi mecburi degildir.
    Eger statict olarak tanimlanmissa zaten ovirride edemeyiz
     */



    @Override
    public void method1() {
        System.out.println("child class method 1");

    }



    public static void main(String[] args) {
        I01_Default_Static.method3();

    //Interface de statict olarak tanimlanan methodlara
    //statict yontemlerle ulasilabilir

        C02_Default_Statict_Meth obj=new C02_Default_Statict_Meth();
        obj.method1();//child class
        obj.method2();//Parent Interface den gelecek
        //obj.method3(); eski class larda statict bir uyeye statict olmayan yollarla da
        //ulasabiliridk
        //ancak Interface icerisinde statict olarak tanimlanan
        //method a statict olmayan yontemlerle ulasilamaz

    }

}
