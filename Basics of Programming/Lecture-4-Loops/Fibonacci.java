public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 10;
        System.out.println(a + " ");
        System.out.println(b + " ");

        while (count > 0) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

            count--;

        }
    }
}
