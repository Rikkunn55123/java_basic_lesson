package curriculum_B;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {

		// スキャナー初期化
		Scanner sc = new Scanner(System.in);
		// 入力メッセージ表示
		System.out.println("生徒の人数を入力してください（２人以上)：");
		// 生徒の人数を取得
		int numPeople = sc.nextInt();

		// 生徒の人数分の、4個ずつ値を持つ配列を作成
		int[][] tests = new int[numPeople][4];

		// 「このプログラムの実行は1回以上行われるようにしてください」なのでdo whileで繰り返し処理を行う
		int num = 0;
		do {
			System.out.println((num + 1) + "人目の『英語』の点数を入力してください ：");
			// num人目の一つ目の値
			tests[num][0] = sc.nextInt();

			System.out.println((num + 1) + "人目の『数学』の点数を入力してください ：");
			// num人目の二つ目の値
			tests[num][1] = sc.nextInt();

			System.out.println((num + 1) + "人目の『理科』の点数を入力してください ：");
			// num人目の三つ目の値
			tests[num][2] = sc.nextInt();

			System.out.println((num + 1) + "人目の『社会』の点数を入力してください ：");
			// num人目の四つ目の値
			tests[num][3] = sc.nextInt();
			// 改行
			System.out.println();
			// カウンター変数を増加
			num++;
			// これを人数分行う
		} while (num < numPeople);

		/***** 個人の平均点出力処理 *****/
		int i = 0;
		do {
			// 合計用変数
			int sumPers = 0;
			// i人目のテストの点すべてに対して
			for (int n : tests[i]) {
				// 合計に足していき
				sumPers += n;
			}
			// テスト科目数　4で合計を割った値を出力
			double avePers = (sumPers / 4.00);
			// 小数点以下２ケタで指定
			System.out.println((i + 1) + "人目の平均点は" + String.format("%.2f", avePers) + "点です。");
			//カウンター増加
			i++;
			// 人数分くり返す
		} while (i < numPeople);

		/***** 科目の平均点処理 *****/

		// 合計用変数を宣言
		int sumEng = 0;
		int sumMath = 0;
		int sumSci = 0;
		int sumSoci = 0;

		// 人数分くり返す
		for (int n = 0; n < numPeople; n++) {
			
			//　n人目のテスト結果を科目ごとに足す
			sumEng += tests[n][0];
			sumMath += tests[n][1];
			sumSci += tests[n][2];
			sumSoci += tests[n][3];
		}
		// 全員分の合計を、人数で割る
		double aveEng = ((double) sumEng / (double) numPeople);
		double aveMath = (((double) sumMath / (double) numPeople));
		double aveSci = ((double) sumSci / (double) numPeople);
		double aveSoci = ((double) sumSoci / (double) numPeople);
		
		// 出力
		System.out.println("英語の平均点は" + String.format("%.2f", aveEng) + "点です。");
		System.out.println("数学の平均点は" + String.format("%.2f", aveMath) + "点です。");
		System.out.println("理科の平均点は" + String.format("%.2f", aveSci) + "点です。");
		System.out.println("社会の平均点は" + String.format("%.2f", aveSoci) + "点です。");
		// 科目ごとの平均点を足して、科目数で割って全体の平均点を出力
		System.out.println("全体の平均点は" + String.format("%.2f", ((aveEng + aveMath + aveSci + aveSoci) / 4)) + "点です。");
		
		// スキャナー閉じる
		sc.close();
	}

}
