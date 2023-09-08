package java_1_25_process;

import java.util.Optional;
import java.util.Scanner;

public class User {
	public static boolean Introduce() {
		Scanner sc = new Scanner(System.in);
		String userName;
		// 名前を入力させる
		System.out.println("名前を入力：");
		userName = sc.nextLine();
		
		// nullチェックのためのoptionalクラス使用
		Optional<String> value = Optional.ofNullable(userName);
		
		// 空欄かnullならfalseを返す
		if (value.isEmpty() || userName.length() <= 0) {
			System.out.println("名前を入力してください");
			sc.close();
			return false;
		} else {
			// 名前表示
			System.out.println("こんにちは「" + userName + "」さん");
			System.out.println("ステータス");

			sc.close();
			return true;
		}
	}
	// 最後の一文
	public static void Departure() {
		System.out.println("さあ冒険に出かけよう！");
	}
}