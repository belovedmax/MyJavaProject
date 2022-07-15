public class CommissionEmployee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,String socialSecurityNumber,double grossSale,double commissionRate){
        if(grossSale<0.0)
            throw new IllegalArgumentException("Gross Sale must be greater or equal is 0");
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be >0.0 < 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public void setGrossSale(double grossSale){
        if( grossSale < 0.0)
            throw new IllegalArgumentException("Gross Sale must be >= 0.0 ");
        this.grossSale = grossSale;
    }

    public double getGrossSale(){
        return grossSale;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and 1.0");
         this.commissionRate = commissionRate;
    }

    public double getCommissionRate(){
        return commissionRate;
    }
    public double earnings(){
        return commissionRate * grossSale;
    }
public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f","commission employee" ,firstName, lastName, "social security number", socialSecurityNumber, "gross sales",grossSale,"commission rate", commissionRate);
}
}
