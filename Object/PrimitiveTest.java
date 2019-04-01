//练习1：验证Java默认执行了初始化
public class PrimitiveTest{
    int a;
    char b;

    public static void main(String[] args){
        PrimitiveTest pr = new PrimitiveTest();
        System.out.println("a="+pr.a);
        System.out.println("b="+pr.b);
    }
    
}