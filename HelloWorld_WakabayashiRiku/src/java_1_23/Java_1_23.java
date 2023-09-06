package java_1_23;

public class Java_1_23 {
	/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
	public static void main(String[] args) {
		// インスタンス作成
		Animal animal = new Animal("ライオン", 2.1, 80);
		// 出力用メソッドに、ゲッターで値を渡して出力
		animal.printProfile(animal.getName(), animal.getHeight(), animal.getSpeed());
	}

}
