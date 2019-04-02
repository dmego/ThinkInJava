package Object;

//练习3: ATypeName
public class ATNTest{
    public static void main(String[] args){
        class ATypeName{
            int i;
            double d;
            boolean b;
            void show(){
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }

        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.73783;
        a.b = true;
        a.show();
    }
}