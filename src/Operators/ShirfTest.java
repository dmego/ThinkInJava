package Operators;
//练习12：以一个所有位都是1的二进制数开始，先左移它，然后用无符号右移操作符右移它，直到所有位都被移出
public class ShirfTest {
	public static void main(String[] args) {
		int h = -1;
		System.out.println(Integer.toBinaryString(h));
		h <<= 10; //左移10位
		System.out.println(Integer.toBinaryString(h));
		for(int i = 0; i<10; i++){
			h>>>=1;
			System.out.println(Integer.toBinaryString(h));
		}
	}
}
