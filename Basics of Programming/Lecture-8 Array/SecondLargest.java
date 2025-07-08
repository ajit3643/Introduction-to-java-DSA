public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 12, 43, 9, 56, 74, 10, 3, 18 };
        int max1 = arr[0];
        int max2 = max1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }

        }
        System.out.println("Second largest element is : " + max2);

    }
}
