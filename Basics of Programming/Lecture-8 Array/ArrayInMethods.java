public class ArrayInMethods {
    public static void increment(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 2;
        }

        for (int i : arr) {
            System.out.println(i + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        increment(arr);
        System.out.println();
        for (int i : arr) {
            System.out.println(i + " ");
        }

    }
}
