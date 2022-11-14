package BulderDesignPattern;

public class PayrollDepartment {
    public static void main(String[] args) {

        BankDetails bankDetailsEmp1 = new BankDetails("07791010056567","KKBK671178");
        SalaryBreakup salaryBreakup = new SalaryBreakupBuilder(10000,1800).setDa(20000).setHra(2000).build();
        Employee employee1= new Employee("101","123454545",bankDetailsEmp1, 0);
        Payslip payslip = new Payslip(employee1,salaryBreakup);
        generatePayslip(payslip);

        BankDetails bankDetailsEmp2 = new BankDetails("07791010056890","KKBK671178");
        SalaryBreakup salaryBreakup2 = new SalaryBreakupBuilder(20000,1800).setDa(20000).setHra(2000).build();
        Employee employee2= new Employee("102","1234547878",bankDetailsEmp2, 0);
        Payslip payslip2 = new Payslip(employee2,salaryBreakup2);
        generatePayslip(payslip2);
    }

    private static void generatePayslip(Payslip payslip) {
        // some logic to generate payslip
        System.out.println("EMPID =>" + payslip.getEmployee().getEmpId() + "\n" + "BANK ACCOUNT =>" + payslip.getEmployee().getBankDetails().getAccountNumber());
        System.out.println(payslip.getSalaryBreakup());
        System.out.println("-----------------------------------------------------------------");

    }
}