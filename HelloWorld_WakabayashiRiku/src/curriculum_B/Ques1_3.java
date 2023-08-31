package curriculum_B;

import java.util.Optional;
// scanner,randomを使うためのクラスをインポート
import java.util.Random;
import java.util.Scanner;

public class Ques1_3 {

	public static void main(String[] args) {

		// scannerの初期化
		Scanner sc = new Scanner(System.in);

		// 名前を入力させる
		String name = sc.nextLine();
		// optional宣言
		Optional<String> value = Optional.ofNullable(name);

		/****** 文字数のチェック ******/

		// nullの時、または０文字以下の場合
		if (value.isEmpty() || name.length() <= 0) {
			System.out.println("「名前を入力してください」");
			// 処理を中止
			sc.close();
			return;
			// 10文字を超えた場合
		} else if (name.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
			// 処理を中止
			sc.close();
			return;
		}

		/***** 正規表現チェック *****/

		// 半角英数字にマッチするかの真偽判定
		if (name.matches("^[A-Za-z0-9]+$")) {
			System.out.println("ユーザー名「" + name + "」を登録しました");

			// マッチしない場合は
		} else {
			System.out.println("「半角英数字のみで名前を入力してください」");
			// 処理を中止
			sc.close();
			return;
		}

		/****** じゃんけんの処理 ******/

		// じゃんけんの回数をカウントする変数
		int total = 0;
		// じゃんけんでユーザーが勝利したかの判定用変数
		boolean win = false;

		/***** ユーザーが負けている間くり返す *****/
		while (!win) {

			//対戦回数を１増加
			total++;

			// ユーザーの手を入力させる
			int userHand = sc.nextInt();

			// 相手の手を選ぶための乱数を用意
			Random rand = new Random();
			// じゃんけんの手は3つなので、0～2の範囲で
			int compHand = rand.nextInt(3);

			// じゃんけんの手を出力
			System.out.println(name + "の手は「" + (userHand == 0 ? "グー" : userHand == 1 ? "チョキ" : "パー") + "」");
			System.out.println("相手の手は「" + (compHand == 0 ? "グー" : compHand == 1 ? "チョキ" : "パー") + "」");

			/****** じゃんけんの結果の処理 ******/

			// ユーザーと相手の数値を文字列結合して、その結果で分岐
			String result = Integer.toString(userHand) + Integer.toString(compHand);
			switch (result) {
			/***** 負けた時 *****/
			// グー
			case "02":
				System.out.print("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！\n");
				break;
			// チョキ
			case "10":
				System.out.print("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");
				break;
			// パー
			case "20":
				System.out.print("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
				break;
			/***** あいこの時 *****/
			case "00":
			case "11":
			case "22":
				System.out.println("DRAW あいこ もう一回しましょう！");
				break;
			/***** 勝ったとき *****/
			default:
				win = true;
				break;
			}

		}

		// 繰り返しを抜けたとき＝勝利したとき
		System.out.println("やるやん。");
		System.out.println("次は俺にリベンジさせて");
		System.out.println();
		// total：総対戦数を出力
		System.out.println("勝つまでにかかった合計回数は" + total + "回です");

		// スキャナー閉じる
		sc.close();
	}

}
