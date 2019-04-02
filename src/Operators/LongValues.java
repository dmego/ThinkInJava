package Operators;
//练习8：展示用十六进制和八进制操作long值
public class LongValues {

	public static void main(String[] args) {
		long n1 = 0xffff; //十六进制
		long n2 = 077777; //八进制
		System.out.println(Long.toBinaryString(n1));
		System.out.println(Long.toBinaryString(n2));
	}

}
