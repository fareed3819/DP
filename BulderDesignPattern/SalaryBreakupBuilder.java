package BulderDesignPattern;

public class SalaryBreakupBuilder {
    double basic;
    double hra;
    double directAllowances;
    double indirectAllowances;
    double pfContribution;
    double specialAllowances;
    double gross;
    double net;
    double incomeTax;
//    StringBuilder sb = new StringBuilder();
    public SalaryBreakupBuilder(double basic, double pfContribution){
        this.basic = basic;
        this.pfContribution = pfContribution;
    }

    public SalaryBreakupBuilder setDa(double da){
        this.directAllowances = da;
        return this;
    }
    public SalaryBreakupBuilder setHra(double hra){
        this.hra = hra;
        return this;
    }
    public SalaryBreakupBuilder setSpecialAllowances(double specialAllowances){
        this.specialAllowances = specialAllowances;
        return this;
    }
    public SalaryBreakupBuilder setGross(double gross){
        this.gross = gross;
        return this;
    }
    public SalaryBreakupBuilder setNet(double net){
        this.net = net;
        return this;
    }
    public SalaryBreakupBuilder setIncomeTax(double tax){
        this.incomeTax = tax;
        return this;
    }

    public SalaryBreakup build(){
        return new SalaryBreakup(this);
    }
}
