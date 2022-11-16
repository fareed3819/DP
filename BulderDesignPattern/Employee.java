package BulderDesignPattern;


public class Employee {
    private final String empId;
    private final String uan;
    private final BankDetails bankDetails;
    private final int lop; // loss of pay

    public Employee(String empId, String uan, BankDetails bankDetails, int lop) {
        this.empId = empId;
        this.uan = uan;
        this.bankDetails = bankDetails;
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "BulderDesignPattern.Employee{" +
                "empId='" + empId + '\'' +
                ", uan='" + uan + '\'' +
                ", bankDetails=" + bankDetails +
                ", lop=" + lop +
                '}';
    }

    public String getEmpId() {
        return empId;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

}
