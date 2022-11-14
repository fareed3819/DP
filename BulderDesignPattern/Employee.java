package BulderDesignPattern;

import BulderDesignPattern.BankDetails;

public class Employee {
    private String empId;
    private String uan;
    private BankDetails bankDetails;
    private int lop; // loss of pay

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

    public String getUan() {
        return uan;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

    public int getLop() {
        return lop;
    }
}
