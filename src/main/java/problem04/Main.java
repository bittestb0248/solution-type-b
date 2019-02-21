package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 랜덤으로 강과 다리 생성
		System.out.println(Main.getRandomString(20));
		String p=Main.getRandomString(20);
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("엔터를 입력");
			scan.nextLine();
			System.out.println(p);
			System.out.println("주사위 생성");
			System.out.println((int)(Math.random()*4)+1);
			
			
		} while (true);
		
	}
	// 랜덤 문자열 생성
	private static String getRandomString(int length) {
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();

		String chars[] = "#,o".split(",");

		for (int i = 0; i < length; i++) {
			buffer.append(chars[random.nextInt(chars.length)]);
		}
		return buffer.toString();
	}
}