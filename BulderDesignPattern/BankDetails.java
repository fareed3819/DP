package BulderDesignPattern;

public class BankDetails {
    private String accountNumber;
    private String ifsc;

    public BankDetails(String accountNumber, String ifsc) {
        this.accountNumber = accountNumber;
        this.ifsc = ifsc;
    }

    @Override
    public String toString() {
        return "BulderDesignPattern.BankDetails{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ifsc='" + ifsc + '\'' +
                '}';
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIfsc() {
        return ifsc;
    }
}
