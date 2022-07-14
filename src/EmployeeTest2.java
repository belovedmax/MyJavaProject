public class EmployeeTest2 {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation : %d%n",
        EmployeeInfo.getCount());

        EmployeeInfo e1 = new EmployeeInfo("susan", "Baker");
        EmployeeInfo e2 = new EmployeeInfo("Bob", "Blue");

        System.out.printf("%nEmployee after instantiation :%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via EmployeeInfo.getCount(): %d%n", EmployeeInfo.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());


    }

}
