import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // write your code logic here !!
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age >= 0 && age <= 4) {
            System.out.println("Infants");
        } else if (age >= 5 && age <= 12) {
            System.out.println("Children");
        } else if (age >= 13 && age <= 64) {
            System.out.println("Adults");
        } else if (age >= 60) {
            System.out.println("Seniors");
        }

        // Qusetion
        int x = 2;
        switch (x + 1) {
            case 1:
                System.out.println(1);
                break;
            case 1 + 1:
                System.out.println(2);
                break;
            case 2 + 1:
                System.out.println(3);
                break;
            default:
                System.out.println("Default");
        }

        int a = 10;
        int y = 20;
        int z = (a > y) ? a : (a < y) ? y : 0;
        System.out.println(z);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        // Check triangle existence
        if (X + Y > Z && X + Z > Y && Y + Z > X) {
            if (X == Y && Y == Z) {
                System.out.println("Equilateral");
            } else if (X == Y || Y == Z || X == Z) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Not a triangle");
        }

        sc.close();

    }
}
