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
		this.country = "日本";
		this.food = "寿司";
		this.category = "和食";

	}

	// 文章表示メソッド
	public void Hello() {

		// カレンダーのインスタンス作成
		Calendar ca = Calendar.getInstance();
		// 指定されたフォーマットでインスタンス作成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");

		// 呼び出し元が持つ情報を入れながら文章表示
		System.out.println("こんにちは！ここは" + this.country + "です！");
		System.out.println("この" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.category + "です");
		// フォーマットを用いて時間表示
		System.out.println(sdf.format(ca.getTime()));
	}
}