import java.util.*;

public class Methods1 {

    public static void square(int n) {
        int result = n * n;
        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        square(n);
        sc.close();

    }

}
