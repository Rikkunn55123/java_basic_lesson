package curriculum_B;

public class Ques4 {

	public static void main(String[] args) {

		// iが1～9までループする中で、
		for (int i = 1; i <= 9; i++) {
			// nを1～9までループさせる
			for (int n = 1; n <= 9; n++) {
				// ２ケタ表示の０埋めを設定
				String iPadd = String.format("%02d", i);
				String nPadd = String.format("%02d", n);
				String ans = String.format("%02d", (i * n));

				// nが９のとき、
				if (n == 9) {
					// 区切りの線を出力せずに、改行を行う
					System.out.println(iPadd + " * " + nPadd + " = " + ans);
					// 行ごとの間の空行
					System.out.println();
				} else {
					System.out.print(iPadd + " * " + nPadd + " = " + ans + " || ");
				}
			}
		}

	}

}
