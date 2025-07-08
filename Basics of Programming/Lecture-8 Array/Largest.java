import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > largest) {
                largest = arr[i];

            }
        }
        System.out.println("Largest element in given Array : " + largest);
        sc.close();

    }
}
