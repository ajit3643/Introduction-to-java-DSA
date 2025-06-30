import java.util.*;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your cutoff marks:");
        float marks = sc.nextFloat();
        System.out.println("Enter your GPA: ");
        float gpa = sc.nextFloat();
        System.out.println("Enter your stars: ");
        int stars = sc.nextInt();

        if (marks >= 65 && (gpa >= 3.5 || stars >= 3)) {
            System.out.println("Congratulations! You are eligible for scholarship!");
        } else {
            System.out.println("We are sorry. You are not eligible for scholarship!");
        }

        sc.close();
    }

}
