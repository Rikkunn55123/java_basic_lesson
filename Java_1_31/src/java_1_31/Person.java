package java_1_31;

class Person {
	public String name;
	public int age;
	public double height;
	public double weight;

	// 問1 クラスフィールドを定義
	public static int count;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 問2 コンストラクタ内で1増加
		count++;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	// 問4 クラスメソッドを定義
	public static void printCount() {
		// 問5 countを使って合計人数を出力
		System.out.println("合計" + count + "人です");
	}
}