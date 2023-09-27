package java_1_33;

public class Vehicle {

	// 問1 インスタンスフィールドownerを定義
	private String owner;

	// 問3 Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return this.owner;
	}
}
