package curriculum_B;

// scanner,randomを使うためのクラスをインポート
import java.util.Random;
import java.util.Scanner;

public class Ques1_3 {

	public static void main(String[] args) {

		// scannerの初期化
		Scanner sc = new Scanner(System.in);

		// 名前を入力させる
		String name = sc.nextLine();

		/****** 文字数のチェック ******/

		// 10文字を超えた場合
		if (name.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
			// 処理を中止
			sc.close();
			return;

			// 名前がnull もしくは０文字以下の場合
		} else if (name == null || name.length() <= 0) {
			System.out.println("「名前を入力してください」");
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
		int total = 1;
		// じゃんけんでユーザーが勝利したかの判定用変数
		boolean win = false;

		/***** ユーザーが負けている間くり返す *****/
		while (!win) {

			// ユーザーの手を入力させる
			int userHand = sc.nextInt();

			// 入力された整数に対応する出力
			switch (userHand) {
			case 0:
				System.out.println(name + "の手は「グー」");
				break;
			case 1:
				System.out.println(name + "の手は「チョキ」");
				break;
			case 2:
				System.out.println(name + "の手は「パー」");
				break;
			// 0,1,2以外が入力されたらスキップして再入力させる
			default:
				continue;
			}

			// 相手の手を選ぶための乱数を用意
			Random rand = new Random();
			// じゃんけんの手は3つなので、0～2の範囲で
			int compHand = rand.nextInt(2);

			// 相手の手を出力する処理
			switch (compHand) {
			case 0:
				System.out.println("相手の手は「グー」");
				break;
			case 1:
				System.out.println("相手の手は「チョキ」");
				break;
			case 2:
				System.out.println("相手の手は「パー」");
			}
			System.out.println();

			/****** じゃんけんの結果の処理 ******/

			// ユーザーと相手の手が同じ(あいこの場合)
			if (userHand == compHand) {
				System.out.println("DRAW　あいこ　もう一回しましょう！");
				//対戦回数を１増加
				total++;

			} else {
				// ユーザーの手ごとに処理
				switch (userHand) {

				//　0：グーの時
				case 0:
					// 相手がチョキの時
					if (compHand == 1) {
						// 勝利判定
						win = true;
						// 負けた時
					} else {
						System.out.println("俺の勝ち！");
						System.out.println("負けは次につながるチャンスです！");
						System.out.println("ネバーギブアップ！");
						// 対戦数増加
						total++;
					}
					// breakを入れる
					break;
				// 1：チョキの時
				case 1:
					// 相手がパーなら
					if (compHand == 2) {
						// 勝利判定
						win = true;
						// そうでないなら
					} else {
						System.out.println("俺の勝ち！");
						System.out.println("たかがじゃんけん、そう思ってないですか？");
						System.out.println("それやったら次も、俺が勝ちますよ");
						// 対戦数増加
						total++;
					}
					// breakを入れる
					break;
				// 2：パーの時
				case 2:
					// 相手がグーなら
					if (compHand == 0) {
						// 勝利判定
						win = true;
						// そうでないなら
					} else {
						System.out.println("俺の勝ち！");
						System.out.println("なんで負けたか、明日まで考えといてください。");
						System.out.println("そしたら何かが見えてくるはずです");
						// 対戦数増加
						total++;
					}
				}
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
