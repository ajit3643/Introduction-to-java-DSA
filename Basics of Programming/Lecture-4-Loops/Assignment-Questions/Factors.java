import java.util.*;

public class Factors {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean factors = false;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
				factors = true;

			}
		}
		if (!factors) {
			System.out.println("-1");
		}
		sc.close();

	}
}