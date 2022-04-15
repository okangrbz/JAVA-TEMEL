package day43_garbage_abstractClass;

public abstract class C04 {


    /*
    bir abstract classda abstract veya concrete method7lar bulunabilir
    Child Class7lar abstract methodlari override etmesi mecburi iken
         concrete methodlarin overridde edilmesi OPTIONELDIR
     */
    public  abstract void abstractMethod1();
    public abstract void AbstractMethod2();

    public void concrete(){
        System.out.println("C04 concrete method");
    }

    public static void concreteStatic(){
        System.out.println("C04 concrete methodstaticMethod");
    }

    public static void main(String[] args) {
        /*
        Abstract classlar consracteur a sahiptir
        ancak abstrac claslardan objet olusuturlamaz

        Abstract classlar objet barindirmayan
        sadece child classlar icin
        UYULMASI SART OLAN veya OPTIONEL brakilan
        ozellikleri tanimladigimiz bir depo clasi gibidir
         */
        //C04 obj=new C04;

        System.out.println("bu class abstracttir");
        concreteStatic();
    }

}
