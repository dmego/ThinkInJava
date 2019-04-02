package Object;

//练习9：展示自动包装功能对所有基本类型和包装器都起作用
public class AutoboxTest{
    public static void main(String[] args){
        boolean b = false;
        char c = 'x';
        byte t = 8;
        short s = 16;
        long l = 64;
        float f = 0.32f;
        double d = 0.64;

        Boolean B = b;
        System.out.println("boolean b = " + b + ", Boolean B = " + B);
        Character C = c;
        System.out.println("char c = " + c + ", Character C = " + C);
        Byte T = t;
        System.out.println("byte t = " + t + ", Byte T = " + T);
        Short S = s;
        System.out.println("short s = " + s + ", Short S = " + S);
        Long L = l;
        System.out.println("long l = " + l + ", Long L = " + L);
        Float F = f;
        System.out.println("float f = " + f + ", Float F = " + F);
        Double D = d;
        System.out.println("double d = " + d + ", Double D = " + D);
    }
}