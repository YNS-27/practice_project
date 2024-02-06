package practice;

public class PracticeDoWhile {

	public static void main(String[] args) {
		int num = 100; // 初期値設定

		do {
			System.out.println(num); // 変数numを表示

			num--; // 1ずつ引いていく処理
		} while (num >= 0); // numが0以上の場合、ブロック内の処理が繰り返される

	}

}
