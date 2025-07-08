import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter the value at " + i + " index ");
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print("Array: " + arr[j] + " ");
        }

        sc.close();
    }
}
