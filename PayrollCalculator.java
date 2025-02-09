public class PayrollCalculator {
    private static final double HOURLY_RATE = 16.78;
    private static final double OVERTIME_MULTIPLIER = 1.5;
    private static final int REGULAR_HOURS = 40;
    private static final double SOCIAL_SECURITY_TAX = 0.06;
    private static final double FEDERAL_INCOME_TAX = 0.14;
    private static final double STATE_INCOME_TAX = 0.05;
    private static final double UNION_DUES = 10.0;

    public static double calculateGrossPay(double hoursWorked) {
        if (hoursWorked > REGULAR_HOURS) {
            return (REGULAR_HOURS * HOURLY_RATE) + ((hoursWorked - REGULAR_HOURS) * HOURLY_RATE * OVERTIME_MULTIPLIER);
        } else {
            return hoursWorked * HOURLY_RATE;
        }
    }

    public static double calculateNetPay(double hoursWorked, int numberOfDependents) {
        double grossPay = calculateGrossPay(hoursWorked);
        double insuranceRate = (numberOfDependents >= 3) ? 35.00 : 15.00;
        double socialSecurity = grossPay * SOCIAL_SECURITY_TAX;
        double federalTax = grossPay * FEDERAL_INCOME_TAX;
        double stateTax = grossPay * STATE_INCOME_TAX;
        return grossPay - (socialSecurity + federalTax + stateTax + UNION_DUES + insuranceRate);
    }

    public static double getHourlyRate() {
        return HOURLY_RATE;
    }
}
