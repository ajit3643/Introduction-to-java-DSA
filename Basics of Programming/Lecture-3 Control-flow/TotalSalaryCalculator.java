import java.util.Scanner;

public class TotalSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);

        int allow;
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double hra = 0.20 * basic;
        double da = 0.50 * basic;
        double pf = 0.11 * basic;

        double totalSalary = basic + hra + da + allow - pf;

        int finalSalary = (int) Math.round(totalSalary);

        System.out.println(finalSalary);

        sc.close();
    }
}
