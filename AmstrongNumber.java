public class AmstrongNumber {
	public static void main(String[] args) {

		int num = 371, actualNumber, r = 0, result = 0;
		actualNumber = num;

		while (actualNumber != 0) {
			r = actualNumber % 10;
			result = result + r * r * r;
			actualNumber = actualNumber / 10;
		}

		if (result == num) {

			System.out.println(num + "::number is amstrong number");
		} else {
			System.out.println(num + "::number is not amstrong number");
		}

	}
}
