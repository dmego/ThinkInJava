package Operators;
//练习4：编写一个计算速度的程序，使用的距离和时间都是常量
public class VelocityTester {
	static float velocity(float d, float t){
		if(t == 0) 
			return 0f;
		return d/t;
	}
	
	public static void main(String[] args) {
		float d = 100.43f;
		float t = 5.3f;
		System.out.println(velocity(d, t));
	}

}
