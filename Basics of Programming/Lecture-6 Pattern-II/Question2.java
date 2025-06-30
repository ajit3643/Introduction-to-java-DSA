import java.util.*;

public class Question2 {
	public static void main(String[] args) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			char startChar = (char) ('A' + N - i);

			for (char ch = startChar; ch <= 'A' + N - 1; ch++) {
				System.out.print(ch);
			}

			System.out.println();
		}
		sc.close();

	}
}