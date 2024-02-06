package practice;

public class PracticeWhile {

	public static void main(String[] args) {
		int num = 100; // 初期値設定

		while (num > 0) { // numが0より大きい場合、ブロック内の処理が繰り返される
			num--; // 1ずつ引いていく処理

			System.out.println(num); // 変数numを表示
		}

	}

}
