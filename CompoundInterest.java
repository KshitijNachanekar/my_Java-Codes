import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("No. of times interest is compounded per year: ");
        int n = scanner.nextInt();

        System.out.print("Enter no. of years: ");
        double t = scanner.nextDouble();

        double r = rate / 100;
        double amount = principal * Math.pow((1 + r / n), n * t);
        double interest = amount - principal;

        System.out.printf("Compound Interest: %.2f\n", interest);
        System.out.printf("Total Amount: %.2f\n", amount);

        scanner.close();
    }
}
