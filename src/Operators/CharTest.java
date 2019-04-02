package Operators;
//练习14：编写一个接收两个字符串参数的方法，用各种布尔值比较关系操作这两个字符串
public class CharTest {
	static void f(boolean b){
		if(b)
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	static void charf(String s1, String s2){
		f(s1 == s2);
		f(s1.equals(s2));
		f(s2.equals(s1));
		f(s1 != s2);
//		f(!s1);
//		f(!s2);
//		f(s1 && s2);
//		f(s1 || s2);
//		f(s1 & s2);
//		f(s1 | s2);
//		f(s1 ^ s2);
//		f(~s1);
//		f(~s2);
//		s1 &= s2;
//		s1 |= s2;
//		s1 ^= s2;
	}
	
	
	public static void main(String[] args) {
		String s1 = "one";
		String s2 = "two";
		charf(s1,s2);
	}
}
