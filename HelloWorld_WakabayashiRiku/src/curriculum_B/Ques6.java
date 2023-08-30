package curriculum_B;

// スキャナーと乱数のためのimport
import java.util.Random;
import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {

		// scannerの初期化
		Scanner sc = new Scanner(System.in);

		// 乱数
		Random rand = new Random();

		// テレビとディスプレイを表示したかどうかのチェック用
		boolean tvDisp = false;

		/***** 入力処理 *****/
		// 入力させて、
		String input = sc.nextLine();
		// 入力させたものを「、」で区切って配列に入れていく
		String[] homeApps = input.split("、");

		/***** 出力処理 *****/
		// 拡張for文で配列内すべてを処理する
		for (String n : homeApps) {
			switch (n) {
			case "パソコン":
				// 0～11の乱数を出して
				int last = rand.nextInt(11);
				// それを11から引いたものを出力
				System.out.println("パソコンの残り台数は" + (11 - last) + "台です");
				// 改行
				System.out.println();
				// break
				break;
			case "冷蔵庫":
				last = rand.nextInt(11);
				System.out.println("冷蔵庫の残り台数は" + (11 - last) + "台です");
				System.out.println();
				break;
			case "扇風機":
				last = rand.nextInt(11);
				System.out.println("扇風機の残り台数は" + (11 - last) + "台です");
				System.out.println();
				break;
			case "洗濯機":
				last = rand.nextInt(11);
				System.out.println("洗濯機の残り台数は" + (11 - last) + "台です");
				System.out.println();
				break;
			case "加湿器":
				last = rand.nextInt(11);
				System.out.println("加湿器の残り台数は" + (11 - last) + "台です");
				System.out.println();
				break;

			// テレビとディスプレイは同ケースで処理
			case "テレビ":
			case "ディスプレイ":
				last = rand.nextInt(11);
				/*
				 * すでに出力していた場合は出力しない
				 * また、printlnだと出力しない場合に改行だけ残ってしまうので、printで処理して、
				 * 出力されるときに改行するようにエスケープシーケンスを入れておく
				 */
				System.out.print(tvDisp == true ? "" : "テレビの残り台数は" + (11 - last) + "台です\n\n");
				last = rand.nextInt(11);
				System.out.print(tvDisp == true ? "" : "ディスプレイの残り台数は" + (11 - last) + "台です\n\n");
				// 出力済み（true）に変更
				tvDisp = true;
				break;
			// 指定の商品でない場合
			default:
				System.out.println("『 " + n + " 』は指定の商品ではありません");
				System.out.println();
			}
		}
		// スキャナー閉じる
		sc.close();
	}

}
