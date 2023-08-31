package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	private static void Hello(String name,int num) {
		System.out.println("「Hello " + name + " " + num + "」");
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void Arithmetic(int a, int b) {
		System.out.println(a * b);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	private static void printNum(int[] numBox) {
		for(int i : numBox) {
			System.out.println(i);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	private static void Arithmetic(double a, double b) {
		System.out.println(a + b);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	private static int[] intBox(int num){
		Random rand = new Random();
		
		int[] randomBox = new int[num];
		for(int i = 0; i < num; i ++) {
			randomBox[i] = rand.nextInt(100)+1;
			System.out.println(randomBox[i]);
		}
		return randomBox;
	}
	
	

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	private static double printAve(int[] intBox) {
		int sum = 0;
		for(int n : intBox) {
			sum += n;
		}
		double ave = (double)sum / (double)intBox.length;
		System.out.println(ave);
		return ave;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	private static boolean Check(double value) {
		System.out.println(value >= 50);
		return (value >= 50);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		System.out.println("***** Q1 *****\n");
		Hello("JavaSE", 11);

		System.out.println("\n***** Q2 *****\n");
		Arithmetic(5,7);
		
		System.out.println("\n***** Q3 *****\n");
		int[] numBox = {3, 5, 10, 12, 0, 13, 57, 98, 123, 3, -5};
		printNum(numBox);
		
		System.out.println("\n***** Q4 *****\n");
		
		Arithmetic(2.55,7.45);
		
		System.out.println("\n***** Q5 & Q6 & Q7 *****\n");
		Check(printAve(intBox(10)));
		
		
	}
}
