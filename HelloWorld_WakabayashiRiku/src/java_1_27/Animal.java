package java_1_27;

// 動物のクラス
public class Animal {
	// フィールドに各要素を定義
	private String name;
	private double height;
	private int speed;
	private String sciName;

	// コンストラクタ　各項目ごとに配列にしたものを引数にする
	Animal(String[] animalBox) {
		// 各要素のセッター呼び出し
		setName(animalBox[0]);
		setHeight(animalBox[1]);
		setSpeed(animalBox[2]);
		setSciName(animalBox[0]);

	}

	// 名前のセッター
	public void setName(String name) {
		this.name = name;
	}

	// 体長のセッター
	public void setHeight(String height) {
		this.height = Double.parseDouble(height);
	}

	// 速度のセッター
	public void setSpeed(String speed) {
		this.speed = Integer.parseInt(speed);
	}

	// 学名のセッター
	public void setSciName(String name) {
		// 動物名から学名を当てはめる、無い場合は「不明」をセット
		switch (name) {
		case "ライオン":
			this.sciName = "バンテラ　レオ";
			break;
		case "ゾウ":
			this.sciName = "ロキソドンタ・サイクロティス";
			break;
		case "パンダ":
			this.sciName = "アイルロポダ・メラノレウカ";
			break;
		case "チンパンジー":
			this.sciName = "パン・トゥログロディテス";
			break;
		case "シマウマ":
			this.sciName = "チャップマンシマウマ";
			break;
		default:
			this.sciName = "不明";
			break;
		}
	}

	// 出力用メソッド
	public void Show() {
		System.out.println("動物名：" + this.name);
		System.out.println("体長：" + this.height + "m");
		System.out.println("速度：" + this.speed + "km/h");
		System.out.println("学名：" + this.sciName);
		// 改行
		System.out.println();
	}
}
