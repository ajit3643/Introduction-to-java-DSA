public class ArrayTraverse {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 7, 6, 5, 3, 4, 5, 6, 7, 8 };
        System.out.println(arr.length);

        // In for loop - It gives the index!
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // for ecah
        // It gives the value!
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
