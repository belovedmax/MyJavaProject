public class CommissionEmployeeAbstract extends  EmployeeAbstractSuperclass{
    private double grossSale;
    private double commissionRate;

    public CommissionEmployeeAbstract(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if(commissionRate<=0.0 || commissionRate>=1.0)
            throw new IllegalArgumentException(" commission can be o");

        if(grossSale<0.0)
            throw new IllegalArgumentException("Gross Sales ca not be 0");

        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {
        if(grossSale<0.0)

            this.grossSale = grossSale;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate>=1.0)
            throw new IllegalArgumentException("commission rate must be >0.0 and <1.0");
        this.commissionRate = commissionRate;
    }
    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSale();
    }
     @Override
    public String toString(){

        return String.format( "%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSale(),
                "commission rate", getCommissionRate());
     }
}
