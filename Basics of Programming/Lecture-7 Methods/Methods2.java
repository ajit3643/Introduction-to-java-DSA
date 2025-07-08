import java.util.*;

public class Methods2 {

    public static int sum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = sum(a, b, c);
        System.out.println("Sum of three numbers: " + sum);

        sc.close();
    }

}
