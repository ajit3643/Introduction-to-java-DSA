
import java.util.*;

public class Question2 {
	public static void main(String[] args)

	{
		// write your code !!!
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();

		}
		sc.close();

	}
}
