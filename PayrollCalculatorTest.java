import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

public class PayrollCalculatorTest {

    @Test
    public void testCalculateGrossPayRegularHours() {
        assertEquals(671.20, PayrollCalculator.calculateGrossPay(40), 0.01, "Gross pay should be correct for regular hours");
    }

    @Test
    public void testCalculateGrossPayOvertimeHours() {
        assertEquals(933.66, PayrollCalculator.calculateGrossPay(45), 0.01, "Gross pay should be correct for overtime hours");
    }

    @Test
    public void testCalculateNetPayNoDependents() {
        double netPay = PayrollCalculator.calculateNetPay(40, 0);
        assertTrue(netPay > 0, "Net pay should be positive for no dependents and regular hours");
    }

    @Test
    public void testCalculateNetPayWithDependents() {
        double netPay = PayrollCalculator.calculateNetPay(40, 3);
        assertTrue(netPay > 0, "Net pay should be positive for dependents and regular hours");
    }
}
