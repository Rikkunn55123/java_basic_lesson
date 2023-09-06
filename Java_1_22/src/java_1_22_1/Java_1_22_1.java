package java_1_22_1;

// 処理用パッケージ、クラスのインポート
import java_1_22_2.Java_1_22_2;

public class Java_1_22_1 {

	public static void main(String[] args) {
		/*
		 
		下記がコンソールに出力されるように作成してください
		
			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です
		
		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。
			
		*/

		
		// 処理用クラスのインスタンス作成
		Java_1_22_2 object = new Java_1_22_2();
		// インスタンスでメソッド呼び出し
		object.Hello();
	}

}
