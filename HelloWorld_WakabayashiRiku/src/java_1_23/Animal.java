package java_1_23;

public class Animal {
	// フィールドに必要な情報を宣言
	private String name;
	private double height;
	private int speed;

	// セッターで各情報をセット
	public void setProfile(String name, double height, int speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;
	}

	// 名前を返すゲッター
	public String getName() {
		return this.name;
	}

	// 体長を返すゲッター
	public double getHeight() {
		return this.height;
	}

	// 速度を返すゲッター
	public int getSpeed() {
		return this.speed;
	}

	// 出力用メソッド
	public void printProfile(String name, double height, int speed) {
		System.out.println("動物名：" + name);
		System.out.println("体長：" + height + "m");
		System.out.println("速度：" + speed + "km/h");
	}
}