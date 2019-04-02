package Operators;

import java.util.Random;

//练习7：模拟抛硬币的过程
public class CoinTest {

	public static void main(String[] args) {
		Random rand = new Random();
		int coin = rand.nextInt();
		System.out.println(coin);
		if(coin % 2 == 0)
			System.out.println("正面");
		else
			System.out.println("反面");

	}

}
