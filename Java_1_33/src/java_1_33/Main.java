package java_1_33;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		Person.printCount();

		// 問4 MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に設定、Personクラスのインスタンスからフルネームを取得し、ownerにセット
		Car car = new Car();
		car.setOwner(person1.fullName());

		Bicycle bicycle = new Bicycle();
		// 問4 Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定、Personクラスのインスタンスからフルネームを取得し、ownerにセット
		bicycle.setOwner(person2.fullName());

		// 問5 ownerをコンソールに出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		// 問10 Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成
		person1.buy(car);
		person2.buy(bicycle);
	}

}
