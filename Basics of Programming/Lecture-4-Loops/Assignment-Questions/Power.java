import java.util.*;

public class Power {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();

		int result = 1;

		if (n == 0 && x == 0) {
			result = 1;
		} else {
			for (int i = 1; i <= n; i++) {
				result = result * x;
			}
		}
		System.out.println(result);

		sc.close();

	}
}