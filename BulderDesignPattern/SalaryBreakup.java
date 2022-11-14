package BulderDesignPattern;

public class SalaryBreakup {
    private final double basic;
    private final double hra;
    private final double directAllowances;
    private final double indirectAllowances;
    private final double pfContribution;
    private final double specialAllowances;
    private final double gross;
    private final double net;
    private final double incomeTax;
    public SalaryBreakup(SalaryBreakupBuilder salaryBuilder){
        this.basic = salaryBuilder.basic;
        this.hra = salaryBuilder.hra;
        this.directAllowances = salaryBuilder.directAllowances;
        this.indirectAllowances = salaryBuilder.indirectAllowances;
        this.pfContribution = salaryBuilder.pfContribution;
        this.specialAllowances = salaryBuilder.specialAllowances;
        this.gross = compute(salaryBuilder, "gross");
        this.net = compute(salaryBuilder,"net");
        this.incomeTax = computeTax(salaryBuilder);
    }
    private double compute(SalaryBreakupBuilder salaryBuilder, String componentType) {
        double gross = salaryBuilder.basic+salaryBuilder.hra+salaryBuilder.directAllowances+salaryBuilder.indirectAllowances
                +salaryBuilder.pfContribution+salaryBuilder.specialAllowances+computeTax(salaryBuilder);

        if("gross".equals(componentType)){
            return gross;

        }else if("net".equals(componentType)){
            return gross - computeTax(salaryBuilder)-salaryBuilder.pfContribution;
        }
        return gross;
    }
    private double computeTax(SalaryBreakupBuilder salaryBuilder) {
        //some logic for tax computation
        return 12500;
    }

    @Override
    public String toString() {
        return "BulderDesignPattern.SalaryBreakup" +"\n" +
                "-------------"+"\n"+
                "=> basic=" + basic +"\n" +
                "=> hra=" + hra +"\n" +
                "=> directAllowances=" + directAllowances +"\n" +
                "=> indirectAllowances=" + indirectAllowances +"\n" +
                "=> pfContribution=" + pfContribution +
                "=> specialAllowances=" + specialAllowances +"\n" +
                "=> gross=" + gross +"\n" +
                "=> net=" + net +"\n" +
                "=> incomeTax=" + incomeTax +"\n";
    }
}
