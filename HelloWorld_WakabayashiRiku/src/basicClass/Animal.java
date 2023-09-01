package basicClass;

// フォーマットと、日付に関するインポート
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		// ドッグのインスタンス作成
		//引数の無い方
		Dog dog1 = new Dog();
		//  名前出力
		System.out.println(dog1.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// 引数を持たせる
		Dog dog2 = new Dog(10);
		// 数を出力
		System.out.println(dog2.numAnimal);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// カレンダーのインスタンス
		Calendar calendar = Calendar.getInstance();
		// 出力形式の指定
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// カレンダーから現在の時間を取得して、指定した形式を用いて出力
		System.out.println(sdf.format(calendar.getTime()));
	}

}
