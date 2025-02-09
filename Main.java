import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Payroll Program!");
        System.out.print("\nHow many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("How many children do you have? ");
        int numberOfDependents = scanner.nextInt();

        double grossPay = PayrollCalculator.calculateGrossPay(hoursWorked);
        double netPay = PayrollCalculator.calculateNetPay(hoursWorked, numberOfDependents);

        System.out.println("\nPayroll Stub:");
        System.out.printf("   Hours:   %.1f\n", hoursWorked);
        System.out.printf("    Rate:   %.2f $/hr\n", PayrollCalculator.getHourlyRate());
        System.out.printf("   Gross:   $ %.2f\n", grossPay);
        System.out.printf("\n     Net:   $ %.2f\n", netPay);
        System.out.println("\nThank you for using the Payroll Program!");
        scanner.close();
    }
}
