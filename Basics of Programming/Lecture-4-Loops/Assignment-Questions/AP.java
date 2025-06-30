import java.util.*;

public class AP {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int n = 1;
		int i = 0;
		while (i < number) {
			int t = 3 * n + 2;
			if (t % 4 != 0) {
				System.out.print(t + " ");
				i++;
			}
			n++;
		}

		sc.close();

	}
}
