package practice;

public class PracticeFor {

	public static void main(String[] args) {
		int sum = 0; // 初期値設定
		
		for (int num = 1; num <= 100; num++) { // numが100以下の場合、ブロック内の処理が繰り返される
			sum += num; //演算子の左辺と右辺を足してその値を左辺に設定する処理

		}
		System.out.println(sum); // 変数sum（総和）を表示

	}

}
