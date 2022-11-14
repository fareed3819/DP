package BulderDesignPattern;

public class Payslip {
    private Employee employee;
    private SalaryBreakup salaryBreakup;

    public Payslip(Employee employee, SalaryBreakup salaryBreakup) {
        this.employee = employee;
        this.salaryBreakup = salaryBreakup;
    }

    @Override
    public String toString() {
        return "BulderDesignPattern.Payslip{" +
                "employee=" + employee +
                ", salaryBreakup=" + salaryBreakup +
                '}';
    }

    public Employee getEmployee() {
        return employee;
    }

    public SalaryBreakup getSalaryBreakup() {
        return salaryBreakup;
    }
}
