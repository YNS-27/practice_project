package practice;

public class PracticeIf {

	public static void main(String[] args) {
		for (int count = 1; count <= 100; count++) {
			if ((count % 3 == 0) && (count % 5 == 0)) { // 3の倍数かつ5の倍数
				System.out.println("FizzBuzz");

			} else if (count % 3 == 0) { // 3の倍数
				System.out.println("Fizz");

			} else if (count % 5 == 0) { // 5の倍数
				System.out.println("Buzz");

			} else {
				System.out.println(count);
			}
		}
	}

}
