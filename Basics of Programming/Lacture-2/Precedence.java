public class Precedence {

    public static void main(String[] args) {
        // int num1 = 8;
        // int num2 = 9;
        // int num3 = 6;

        // float average = (num1 + num2 + num3) / 3f;
        // System.out.println("Average = " + average);

        int a = 10;
        a = ((a - 5) / (3 + 6)) * a;
        System.out.println(a);
    }
}