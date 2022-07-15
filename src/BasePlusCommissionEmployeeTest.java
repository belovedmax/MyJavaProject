public class BasePlusCommissionEmployeeTest {
        public static void main(String[] args) {
            BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("James","King", "245-34-4567",10000, 0.04,300);

            System.out.println("Employee info obtained by get methods:");
            System.out.printf("%n%s %s%n", "first name is:", employee.getFirstName());
            System.out.printf("%s%n %s%n","lst name is", employee.getLastName());
            System.out.printf("%s %s%n","Social security is", employee.getSocialSecurityNumber());
            System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSale());
            System.out.printf("%s %.2f%n","Commission Rate is", employee.getCommissionRate());
            System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

            employee.setBaseSalary(1000);

            System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString",employee);
        }
    }


