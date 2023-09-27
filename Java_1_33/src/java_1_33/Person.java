package java_1_33;

public class Person {
	public static int count = 0;
	public String firstName;
	// 問１ インスタンスフィールドにlastName追加
	public String lastName;
	public int age;
	public double height, weight;

	Person(String firstName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 問2 引数にlastNameを追加して、コンストラクタをオーバーロード
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		//  問3 lastNameのフィールドの値をセット
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	// 問6 Personクラスにインスタンスメソッド「buy」を定義
	public void buy(Car car) {
		// 問7 buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセット
		car.setOwner(this.fullName());

		// 問8 さらに、「〇〇が購入しました」と出力する処理を追加
		System.out.println(car.getOwner() + "が購入しました。");
	}

	// 問9 引数の型が異なるbuyメソッドを定義
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました。");
	}
}
