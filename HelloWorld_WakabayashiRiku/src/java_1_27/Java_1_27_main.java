package java_1_27;

import java.util.ArrayList;
import java.util.List;

public class Java_1_27_main {

	/*
	 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */
	
	public static void main(String[] args) {
		
		// Introduceの戻り値を変数に
		String[] inputed = Input.Introduce();
		
		// Animalのインスタンス用配列
		List<Animal> animals = new ArrayList<Animal>();
		
		// inputedの要素の数だけくり返す　＝　入力された動物の数だけくり返す
		for(int i = 0; i < inputed.length; i ++) {
			// 動物ごとに分けられた配列の各要素を、さらに各項目ごとに配列にする
			String[] animalBox = inputed[i].split(":");
			// その配列を引数にして、Animalインスタンス作成
			animals.add(new Animal(animalBox));
		}
		// 作ったインスタンスすべてで
		for(Animal n : animals) {
			// 出力用メソッドを使用
			n.Show();
		}
	}

}
