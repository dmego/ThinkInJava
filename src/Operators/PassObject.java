package Operators;
//练习3：创建一个包含一个float域的类，展示方法调用时的别名机制
class Box{
	float a;
}

public class PassObject {
	//参数是对象，参数在传递过程中按值传递的是对象的引用
	//也就是说在方法内的操作会改变对象的值
	static void f(Box b){
		b.a = 0.43f;
	}
	public static void main(String[] args) {
		Box box = new Box();
		box.a = 0.34f;
		System.out.println("1: box.a = "+box.a);
		f(box);
		System.out.println("2: box.a = "+box.a);
	}
}
