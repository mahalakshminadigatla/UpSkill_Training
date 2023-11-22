import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate Compound Interest
        double compoundInterest = principal * (Math.pow(1 + rate / 100, time)) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);

       // sc.close();
    }
}
