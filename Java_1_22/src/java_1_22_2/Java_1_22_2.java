package java_1_22_2;

// フォーマットと時間に関するクラスのインポート
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Java_1_22_2 {
	// 国、食べ物、料理カテゴリーのフィールド
	String country;
	String food;
	String category;

	// コントラスタ
	public Java_1_22_2() {
		// 指定された要素を代入
		country = "日本";
		food = "寿司";
		category = "和食";

		// 文章を表示するメソッド呼び出し　引数にthisで情報を渡す
		Hello(this.country, this.food, this.category);

	}

	// 文章表示メソッド
	public void Hello(String country, String food, String category) {

		// カレンダーのインスタンス作成
		Calendar ca = Calendar.getInstance();
		// 指定されたフォーマットでインスタンス作成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");

		// 引数で渡された情報を入れながら文章表示
		System.out.println("こんにちは！ここは" + country + "です！");
		System.out.println("この" + food + "はうまい");
		System.out.println(food + "は" + category + "です");
		// フォーマットを用いて時間表示
		System.out.println(sdf.format(ca.getTime()));
	}
}