//练习8：无论创建某个特定类的多少个对象，这个类中的某个特定的static域只有一个实例
class StaticTest{
    static int i = 47;
} 

class Incrementable{
    static void increment(){
        StaticTest.i++;
    }
}

public class OneStaticTest{
    public static void main(String[] args){
        System.out.println("StaticTest.i = "+ StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i = "+ st1.i);
        System.out.println("st2.i = "+ st2.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("After sf.increment() called: ");
        System.out.println("st1.i = "+ st1.i);
        System.out.println("st2.i = "+ st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment() called: ");
        System.out.println("st1.i = "+ st1.i);
        System.out.println("st2.i = "+ st2.i);

        st1.i = 3;
        System.out.println("After st1.i = 3");
        System.out.println("st1.i = "+ st1.i);
        System.out.println("st2.i = "+ st2.i);
        StaticTest st3 = new StaticTest();
        System.out.println("st3.i = " +st3.i);
        
    }
}