public class HourlyEmployee extends EmployeeAbstractSuperclass{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0)
            throw new IllegalArgumentException("wage can not be 0");
        this.setWage(wage);

        if (hours<0)
            throw new IllegalArgumentException("hour can not be 0");
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("wage can not be 0");
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours<0)
            throw new IllegalArgumentException("hour can not be 0");
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if(getHours() <= 40)
        return getWage()*getHours();
        else
            return 40*getWage() + (getHours() -40) *getWage()*1.5;
        //commission of 1.5 extra on over 40hrs work
    }
    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                 super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }

}
