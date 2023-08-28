package curriculum_A;

public class Ques1_13 {

	public static void main(String[] args) {

		// ***** Ques1 *****

		// バイト型
		byte num_byte;

		// 短整数型
		short num_short;

		// 整数型
		int num_int;

		// 長整数型
		long num_long;

		// 短精度浮動小数点数型
		float num_float;

		// 倍精度浮動小数点数型
		double num_double;

		// 文字型
		char char1;

		// 文字列型
		String str;

		// ブーリアン型
		boolean boo;

		// ***** Ques2 *****

		// それぞれを初期化

		num_byte = 0;

		num_short = 0;

		num_int = 0;

		num_long = 0;

		num_float = 0;

		num_double = 0;

		char1 = 0;

		str = "";

		boo = false;

		// ***** Ques3 *****

		// それぞれに指定の値を代入

		num_byte = 10;

		num_short = 100;

		num_int = 1000;

		num_long = 10000;

		num_float = 9.5f;

		num_double = 10.5;

		char1 = 'a';

		str = "ハロー";

		boo = true;

		
		
		
		// ***** Ques4 *****
		System.out.println("***** Ques4 *****");

		// 上記変数を用いて指定の値をコンソール出力

		// 11110
		System.out.println(num_long + num_int + num_short + num_byte);

		// 20
		// そのままだと20.0になるので(int)をつけて整数に型変換
		System.out.println((int) (num_float + num_double));

		// a ハロー true
		// 空白を文字列として結合
		System.out.println(char1 + " " + str + " " + boo);

		// 11130 数字をすべて足す
		// 足した結果を指数に変換
		System.out.println((int) (num_long + num_int + num_short + num_byte + num_float + num_double));

		// 10000000000 少数以外の数字を全てかける
		System.out.println(num_long * num_int * num_short * num_byte);

		// 10.5割る100
		System.out.println(num_double / num_short);

		// 10引く100
		System.out.println(num_byte - num_short);

		System.out.println();

		
		
		
		// ***** Ques5 *****
		System.out.println("***** Ques5 *****");

		// 元コードは、文字列(20)と指数(23)を足そうとしているのが原因
		// 23も文字列として宣言することで、文字として結合できるようになる

		String num = "20";

		// 文字列として宣言
		String num1 = "23";

		// 文字列結合
		System.out.println("ハローJAVA" + (num + num1));

		System.out.println();

		// ***** Ques6 *****
		System.out.println("***** Ques6 *****");
		/*
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』の情報を
		 *　変数として、フォーマットのように出力
		 */

		// 名前
		String name = "山田太郎";
		// 年齢
		int age = 18;
		// 身長
		double height = 170.5;
		// 体重
		double weight = 62.2;
		// 食べ物
		String food = "寿司";
		
		
		//出力
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");

		
		
		System.out.println();
		
		// ***** Ques7 *****
		System.out.println("***** Ques7 *****");
		
		// Ques6の変数を用いてBMIを出力
		
		// BMI：体重/身長の二乗
		double bmi = ( weight / ((height / 100) * (height / 100)));
		// printf()で表示桁数を調整、￥ｎで改行
		System.out.printf("BMIは%.1fです\n",bmi);
		
		System.out.println();
		
		
		// ***** Ques8 *****
		System.out.println("***** Ques8 *****");
		
		// Ques6で宣言した変数に再代入して
		
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		bmi = ( weight / ((height / 100) * (height / 100)));
		
		// 再度コンソール出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.printf("BMIは%.1fです\n",bmi);
		
		System.out.println();
		
		

		// ***** Ques9 *****
		System.out.println("***** Ques9 *****");
		
		// Ques8の、年齢、身長、体重に和算で自己代入して改めて出力
		
		age += age;
		height += height;
		weight += weight;
		bmi =  weight / ((height / 100) * (height / 100));
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.printf("BMIは%.2fです\n",bmi);
		
		System.out.println();
		
		
		
		// ***** Ques10 *****
		System.out.println("***** Ques10 *****");
		
		// Ques8で利用した年齢が２５歳以上ならTrue＊if文はつかわない
		
		// Ques8の値に直す
		age = 24;
		// 条件式をそのまま入れることで真偽判定を出力
		System.out.println(age >= 25);
		
		
		System.out.println();
		
		
		
		// ***** Ques11 *****
		System.out.println("***** Ques11 *****");
		
		// Ques8で利用した【年齢・身長・体重】を文字列に変換して結合
		
		// Ques8の値に直す
		height = 168.5;
		weight = 64.2;
		
		// 文字列型に型変換
		String ageS = String.valueOf(age);
		String heightS = String.valueOf(height);
		String weightS = String.valueOf(weight);
		
		// 結合して出力
		System.out.println(ageS + heightS + weightS);
		
		
		System.out.println();
		
		// ***** Ques12 *****
		System.out.println("***** Ques12 *****");
		
		// Ques11で変換した年齢・身長を整数型にして変換して出力
		
		System.out.println(Integer.parseInt(ageS));
		// double型を経由してからint型へ変換
		System.out.println((int)Double.parseDouble(heightS));
		
		
		System.out.println();
		
		// ***** Ques13 *****;
		System.out.println("***** Ques13 *****");
		
		// Ques12で変換した年齢・身長で、年齢が２５もしくは身長が160以上であればTrueを出力
		System.out.println(age == 25 || height >= 160);
		
		
	}

}
