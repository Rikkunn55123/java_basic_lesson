package curriculum_B;

public class Ques5 {

	public static void main(String[] args) {
		
		// 	iが1～9までループしている中で、
		for (int i = 1; i <= 9; i++) {
			// nが1～20までループ
			for (int n = 1; n <= 20; n++) {
				// 3桁の0埋め
				String iPadd = String.format("%03d", i);
				String nPadd = String.format("%03d", n);
				String ans = String.format("%03d", (i * n));
				
				
				// nが20のときは、
				if (n == 20) {
					// 区切りの線を出力せずに改行
					System.out.println(nPadd + " * " + iPadd + " = " + ans);
					System.out.println();
					
				} else {
					System.out.print(nPadd + " * " + iPadd + " = " + ans + " || ");
				}
			}
		}

	}

}
