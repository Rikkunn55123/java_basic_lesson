package curriculum_B;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {

		// 教科を配列として代入
		String[] subjects = { "英語", "数学", "理科", "社会" };

		// スキャナー初期化
		Scanner sc = new Scanner(System.in);
		// 入力メッセージ表示
		System.out.println("生徒の人数を入力してください（２人以上)：");
		// 生徒の人数を取得
		int numPeople = sc.nextInt();

		// 生徒の人数分の、教科の数ずつ値を持つ配列を作成
		int[][] tests = new int[numPeople][subjects.length];

		/***** 点数入力処理 *****/

		// 「このプログラムの実行は1回以上行われるようにしてください」なのでdo whileで繰り返し処理を行う
		int num = 0;
		do {
			// 教科数だけくり返す
			for (int i = 0; i < subjects.length; i++) {
				// 一人につき教科分だけ入力させる
				System.out.println((num + 1) + "人目の『" + subjects[i] + "』の点数を入力してください ：");
				tests[num][i] = sc.nextInt();
			}
			// カウンター変数を増加
			num++;
			// これを人数分行う
		} while (num < numPeople);

		/***** 個人の平均点出力処理 *****/
		int j = 0;
		do {
			// 合計用変数
			int sumPers = 0;
			// i人目のテストの点すべてに対して
			for (int n : tests[j]) {
				// 合計に足していき
				sumPers += n;
			}
			// テスト科目数　4で合計を割った値を出力
			double avePers = (sumPers / 4.00);
			// 小数点以下２ケタで指定
			System.out.printf("%s人目の平均点は%.2fです。\n", (j + 1), avePers);

			//カウンター増加
			j++;
			// 人数分くり返す
		} while (j < numPeople);

		/***** 科目の平均点処理 *****/

		// 全体合計用の変数
		int sumTotal = 0;

		// 科目数だけ繰り返す
		for (int k = 0; k < subjects.length; k++) {

			// 科目ごとの合計用変数
			int sumSubjects = 0;

			// 人数分くり返す
			for (int l = 0; l < numPeople; l++) {
				// 科目ごとに人数分の点数が足される
				sumSubjects += tests[l][k];
				// 合計用変数にも足す
				sumTotal += tests[l][k];
			}
			// 科目ごとの平均点を出して出力
			double ave = (double) sumSubjects / (double) numPeople;
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[k], ave);

		}
		// 全体合計から、平均を出力
		double aveTotal = ((double) sumTotal / (double) subjects.length) / (double) numPeople;
		System.out.printf("全体の平均点は%.2f点です。", aveTotal);
		// スキャナー閉じる
		sc.close();

	}
}
