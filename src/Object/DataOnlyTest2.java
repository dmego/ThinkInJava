package Object;

//练习5
public class DataOnlyTest2{
    public static void main(String[] args){
        class DataOnly{
            int i;
            double d;
            boolean b;
            void show(){
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }

        DataOnly data = new DataOnly();
        data.i = 234;
        data.d = 2.345212;
        data.b = true;
        data.show();
    }
}