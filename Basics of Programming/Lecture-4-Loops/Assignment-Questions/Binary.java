import java.util.*;

public class Binary {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();

		int placeValue = 1;
		int answer = 0;

		while (binary > 0) {
			int lastDigit = binary % 10;
			answer += lastDigit * placeValue;
			placeValue = placeValue * 2;

			binary = binary / 10;
		}
		System.out.println(answer);

		sc.close();

	}
}
