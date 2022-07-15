public class BasePlusCommissionEmployeeExtends  extends CommissionEmployeeProtected{

    private double baseSalary;

    public BasePlusCommissionEmployeeExtends(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate,double baseSalary) {

        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);

        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary can not be less 0");

        this.baseSalary = baseSalary;}

    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base Salary must be >= 0.0");
        this.baseSalary = baseSalary;}

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double earnings(){
        return baseSalary + (commissionRate + grossSale);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSale, "commission rate", commissionRate,
                "base salary", baseSalary);


    }
}