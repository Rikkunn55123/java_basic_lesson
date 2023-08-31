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
		for (String inputThing : homeApps) {
			
			// 残り台数を0～11で出す
			int last = rand.nextInt(12);
			
			//入力されたものそれぞれに対して
			switch (inputThing) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + last + "台です");
				// 改行
				System.out.println();
				// break
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + last + "台です");
				System.out.println();
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + last + "台です");
				System.out.println();
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + last + "台です");
				System.out.println();
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + (last) + "台です");
				System.out.println();
				break;

			// テレビとディスプレイは同ケースで処理
			case "テレビ":
			case "ディスプレイ":
				/*
				 * すでに出力していた場合は出力しない
				 */
				System.out.print(tvDisp == true ? "" : "テレビの残り台数は" + last + "台です\n\nディスプレイの残り台数は" + (11 - last) + "台です\n\n");
				// 出力済み（true）に変更
				tvDisp = true;
				break;
			// 指定の商品でない場合
			default:
				System.out.println("『 " + inputThing + " 』は指定の商品ではありません");
				System.out.println();
				break;
			}
		}
		// スキャナー閉じる
		sc.close();
	}

}
