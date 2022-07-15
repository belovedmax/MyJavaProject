public class SalariedEmployee extends EmployeeAbstractSuperclass {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {

        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary < 0)
            throw new IllegalArgumentException("weekly Salary can not be 0");
        this.setWeeklySalary(weeklySalary);

    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("weekly salary can not be 0");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}
