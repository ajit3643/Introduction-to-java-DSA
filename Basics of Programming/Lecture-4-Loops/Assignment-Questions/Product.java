import java.util.*;

public class Product {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int choice = sc.nextInt();

		if (choice == 1) {
			int sum = 0;
			for (int i = 1; i <= number; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		} else if (choice == 2) {
			int product = 1;
			for (int j = 1; j <= number; j++) {
				product = product * j;
			}
			System.out.println(product);
		} else {
			System.out.println("-1");
		}

		sc.close();

	}
}
