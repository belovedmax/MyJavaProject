public class BasePlusCommissionEmployeeAbstract extends CommissionEmployeeAbstract{
    private double baseSalary;

    public BasePlusCommissionEmployeeAbstract(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate,double baseSalary) {

        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
        if(baseSalary<0.0)
            throw new IllegalArgumentException("Base Salary must not be 0");
        this.setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("Base salary can be 0");
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s %s: %s: $%,.2f", "base-salaried", super.toString(),

                "Base salary",getBaseSalary());
    }
}
