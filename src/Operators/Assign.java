package Operators;
//练习2：创建一个包含一个float域的类，展示别名机制
class Tube{
	float level;
}

public class Assign {
	public static void main(String[] args) {
		Tube t1 = new Tube();
		Tube t2 = new Tube();
		t1.level = 0.9f;
		t2.level = 0.47F;
		System.out.println("1: t1.level = "+ t1.level+", t2.level = "+ t2.level);
		t1 = t2; //将引用t2赋值给引用t1,此时引用t1指向的对象变成了引用t2指向的对象
		System.out.println("2: t1.level = "+ t1.level+", t2.level = "+ t2.level);
		t1.level = 0.5f; //通过t1改变对象的值，从t2.level的值可以看出t2是t1的别名
		System.out.println("3: t1.level = "+ t1.level+", t2.level = "+ t2.level);
	}
}
