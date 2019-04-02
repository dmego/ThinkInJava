package Operators;
//练习5：创建一个Dog类，包含两个String 域
class Dog{
	String name;
	String says;
	
	void show(){
		System.out.println("Dog name is:"+name+",Dog say :"+says);
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.name = "spot";
		d1.says = "Ruff!";
		d2.name = "scruffy";
		d2.says = "Wruf!";
		d1.show();
		d2.show();
	//----------------------------------------
	//练习6：创建一个新的Dog索引，并对其赋值为spot对象，测试用 == 和 equals() 方法来比较所有所有结果
		Dog d3 = new Dog();
		System.out.println("d1 == d3: "+(d1 == d3));
		System.out.println("d1 equals d3: "+(d1.equals(d3)));
		System.out.println("d3 equals d1: "+(d3.equals(d1)));
		d3 = d1;
		System.out.println("d1 == d3: "+(d1 == d3));
		System.out.println("d1 equals d3: "+(d1.equals(d3)));
		System.out.println("d3 equals d1: "+(d3.equals(d1)));
	}
	

}
