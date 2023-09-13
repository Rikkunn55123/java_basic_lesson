package java_1_27;

import java.util.Scanner;

public class Input {
	// コンソール入力の指示、処理をする
	public static String[] Introduce() {
		System.out.println("コンソールに入力してください");

		// 入力を受け取る
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// 「,」で区切って配列にしたものを返す
		String[] inputBox = input.split(",");

		return inputBox;
	}

}
