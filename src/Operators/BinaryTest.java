package Operators;
//练习10：编写一个具有两个常量值的程序，用位运算操作符结合他们计算
public class BinaryTest {
	public static void main(String[] args) {
		int i = 1 + 4 + 16 + 64;
		int j = 2 + 8 + 32 + 128;
		System.out.println("i = "+ Integer.toBinaryString(i));
		System.out.println("j = "+ Integer.toBinaryString(j));
		System.out.println("i & j = "+ Integer.toBinaryString(i & j));
		System.out.println("i | j = "+ Integer.toBinaryString(i | j));
		System.out.println("i ^ j = "+ Integer.toBinaryString(i ^ j));
		System.out.println("~i = "+ Integer.toBinaryString(~i));
		System.out.println("~j = "+ Integer.toBinaryString(~j));
	}
}
