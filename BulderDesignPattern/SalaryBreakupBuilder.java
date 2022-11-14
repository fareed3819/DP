package BulderDesignPattern;

public class SalaryBreakupBuilder {
    public double basic;
    public double hra;
    public double directAllowances;
    public double indirectAllowances;
    public double pfContribution;
    public double specialAllowances;
    public double gross;
    public double net;
    public double incomeTax;
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
