package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import sub.Prefecture;

/*
	
0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
	都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
	都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

	都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/

public class Main {

	public static void main(String[] args) {

		// 指定の配列を用意する
		String[] prefectureBox = new String[11];
		prefectureBox[0] = "北海道:札幌市:83424";
		prefectureBox[1] = "青森県:青森市:9646";
		prefectureBox[2] = "岩手県:盛岡市:15275";
		prefectureBox[3] = "宮城県:仙台市:7282";
		prefectureBox[4] = "秋田県:秋田市:11638";
		prefectureBox[5] = "山形県:山形市:9323";
		prefectureBox[6] = "福島県:福島市:13784";
		prefectureBox[7] = "茨城県:水戸市:6097";
		prefectureBox[8] = "栃木県:宇都宮市:6408";
		prefectureBox[9] = "群馬県:前橋市:6362";
		prefectureBox[10] = "埼玉県:さいたま市:3798";

		// インスタンスを入れる配列を用意する
		List<Prefecture> prefectures = new ArrayList<Prefecture>();

		// 都道府県の数だけインスタンスを作成する
		for (int i = 0; i < prefectureBox.length; i++) {
			// 都道府県の情報ごとで区切ったものを
			String[] prefectureInfo = prefectureBox[i].split(":");
			//　引数としてインスタンスを作成し、格納していく
			prefectures.add(new Prefecture(prefectureInfo[0], prefectureInfo[1], prefectureInfo[2]));
		}

		// 数字の入力処理
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力して下さい :");
		String input = sc.nextLine();

		// NULLチェック　NULLの場合は処理を中止
		Optional<String> value = Optional.ofNullable(input);
		if (value.isEmpty() || input.length() <= 0) {
			System.out.println("数字を入力してください");
			// スキャナー閉じる
			sc.close();
			// 処理中止
			return;
		}

		// 昇順降順の入力処理
		System.out.println("昇順か降順か入力してください :");
		String order = sc.nextLine();

		// NULLチェック
		value = Optional.ofNullable(order);
		if (value.isEmpty() || order.length() <= 0) {
			System.out.println("「昇順」か「降順」を入力してください");
			// スキャナー閉じる
			sc.close();
			// 処理中止
			return;
		}

		// インスタンスの数だけ行う
		// 都道府県の情報と、ソート順を引数にして作った配列に格納されるインスタンスすべてに
		for (Integer n : Prefecture.Sort(input, order)) {
			// 表示メソッドを使用
			prefectures.get(n).Show();
		}
		// スキャナー閉じる
		sc.close();
	}

}
