package Operators;
//练习11：以一个最高有效为为1的二进制数开始，用有符号右移操作符对其进行右移
//直到所有的二进制位都被移出
public class RightShiftTest {

	public static void main(String[] args) {
		int h = 0x10000000;
		System.out.println(Integer.toBinaryString(h));
		for(int i = 0; i< 28; i++){
			h >>= 1;
			System.out.println(Integer.toBinaryString(h));
		}
	}
}
