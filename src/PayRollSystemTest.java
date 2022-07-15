public class PayRollSystemTest {

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("king", "johnson", "2345-245-664", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "234-2354-654", 16.76, 40);
        CommissionEmployeeAbstract commissionEmployee = new CommissionEmployeeAbstract("lilian", "mark", "234-567-3432", 10000, 0.7);
        BasePlusCommissionEmployeeAbstract basePlusCommissionEmployee = new BasePlusCommissionEmployeeAbstract("Henry", "Gabriel", "3645-343-6564", 1500, 0.09, 300);

        System.out.println("Employee Processed Individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        EmployeeAbstractSuperclass[] employee = new EmployeeAbstractSuperclass[4];

        employee[0] = salariedEmployee;
        employee[1] = hourlyEmployee;
        employee[2] = commissionEmployee;
        employee[3] = basePlusCommissionEmployee;

        System.out.printf("Employee processed polymorphically: %n%n");

        for (EmployeeAbstractSuperclass currentEmployee : employee) {
            System.out.println(currentEmployee);

            if(currentEmployee instanceof BasePlusCommissionEmployeeAbstract){

                BasePlusCommissionEmployeeAbstract basePlusCommissionEmployeeAbstract= (BasePlusCommissionEmployeeAbstract) currentEmployee; basePlusCommissionEmployeeAbstract.setBaseSalary(1.10 * basePlusCommissionEmployeeAbstract.getBaseSalary());

                System.out.printf("New Base salary with 10%% increase is: $%,.2f%n", basePlusCommissionEmployeeAbstract.getBaseSalary());
            }
                System.out.printf("Earned $%,.2f%n%n", currentEmployee.earnings());
            }
        for(int j  =0;j< employee.length; j++)
            System.out.printf("Employee %d is %s%n", j, employee[j].getClass().getName());
        }
    }
