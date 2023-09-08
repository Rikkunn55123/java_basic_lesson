package java_1_25_main;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/
import java_1_25_process.StatusExt;
import java_1_25_process.User;

public class Java_1_25_main {

	public static void main(String[] args) {
		
		// 名前を入力させるメソッド
		if (User.Introduce() == false) {
			return;
		}
		
		// 各項目のインスタンスを作成
		StatusExt hp = new StatusExt("HP");
		StatusExt mp = new StatusExt("MP");
		StatusExt at = new StatusExt("攻撃力");
		StatusExt sp = new StatusExt("素早さ");
		StatusExt def = new StatusExt("防御力");
		// 最後の一文表示
		User.Departure();
	}

}
