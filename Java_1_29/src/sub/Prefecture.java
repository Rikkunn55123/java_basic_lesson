package sub;

import java.util.Arrays;
import java.util.Collections;

public class Prefecture {
	// フィールドに、名前、県庁所在地、面積のための変数を宣言
	// 名前
	private String name;
	// 県庁所在地
	private String capital;
	// 面積
	private String area;

	// コンストラクタ
	public Prefecture(String name, String capital, String area) {
		// フィールド各要素のセッター
		setName(name);
		setCapital(capital);
		setArea(area);
	}

	// 名前のセッター
	public void setName(String name) {
		this.name = name;
	}

	// 県庁所在地のセッター
	public void setCapital(String capital) {
		this.capital = capital;
	}

	// 面積のセッター
	public void setArea(String area) {
		this.area = area;
	}

	// 情報表示用のメソッド
	public void Show() {
		// インスタンスにセットされた情報を表示
		System.out.println("都道府県名：" + this.name);
		System.out.println("県庁所在地：" + this.capital);
		System.out.println("面積：" + this.area + ".0km2");
		System.out.println();
	}

	// ソート用メソッド
	public static Integer[] Sort(String input, String order) {
		// 入力された数字をカンマで区切って配列にする
		String[] inputBox = input.split(",");
		// 上記配列をInteger型に変換するための配列
		Integer[] sortBox = new Integer[inputBox.length];

		// inputBoxの各要素をInteger型に変換してsortBoxに格納する
		for (int i = 0; i < inputBox.length; i++) {
			sortBox[i] = Integer.parseInt(inputBox[i]);
		}
		// 入力されたものが昇順なら
		if (order.equals("昇順")) {
			// 昇順にソートして
			Arrays.sort(sortBox);
			// 降順なら
		} else if (order.equals("降順")) {
			// 降順にソートして
			Arrays.sort(sortBox, Collections.reverseOrder());
		}
		// ソートされた配列を返す
		return sortBox;
	}
}
