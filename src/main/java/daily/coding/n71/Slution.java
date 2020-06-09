package daily.coding.n71;

public class Slution {

	private static int rand5() {
		int number = rand7();
		while (number > 5) {
			number = rand7();
		}
		return number;
	}

	// 1 ~ 7
	private static int rand7() {
		int val = (int) (Math.random() * 7) + 1;
		return val;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(rand5());
		}
	}

}
