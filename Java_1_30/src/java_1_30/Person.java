package java_1_30;

public class Person {
	// インスタンスフィールドを定義

	String name;
	int age;
	double height;

	// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセット（double型）
	double weight;

	// インスタンス合計数カウントのための値
	static int total = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// インスタンスを作成するたびに増加
		total++;
	}

	// 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	public double Bmi() {
		// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
		double bmi = this.weight / (this.height * this.height);
		return bmi;
	}

	// 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	public void Print() {

		// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.Bmi() + "です");
	}
}
