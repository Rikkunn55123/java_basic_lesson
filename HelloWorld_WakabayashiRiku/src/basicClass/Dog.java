package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	public String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	public int numAnimal;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// 引数なしのコンストラクタ
	Dog() {
		// 「犬」を代入
		name = "犬";
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	// 引数に整数を持つコンストラクタ
	Dog(int num) {
		// 引数を代入
		numAnimal = num;
	}
}
