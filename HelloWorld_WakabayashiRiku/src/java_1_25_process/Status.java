package java_1_25_process;

import java.util.Random;

public class Status {
	// ステータス名
	private String statusName;
	// ステータスの値
	private int statusValue;
	// 乱数のインスタンス
	Random rand = new Random();
	
	// ステータスを表示させる　親クラス
	public Status(String statusName) {
		// ステータス名のセッター呼び出し
		setStatusName(statusName);
		// 値のセッター呼び出し
		setStatusValue();
		System.out.println(this.statusName + ":" + this.statusValue);
	}
	// ステータス名　セッター
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	// 値のセッター
	public void setStatusValue() {
		this.statusValue = rand.nextInt(1000);
	}

}
