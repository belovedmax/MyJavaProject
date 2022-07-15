public class Polymorphism {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("james", "kings", "234-4423-457", 10000, 0.07);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("juliet", "Bob", "454-4678-908", 3000, 0.03, 600);

        System.out.printf("%s %s: %n%n%s%n%n", "call CommissionEmployee's toString with subclass", "reference to subclass object", commissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object",basePlusCommissionEmployee.toString() );

        BasePlusCommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;

        System.out.printf("%s %s:%n%n%s%n","Call BasePlusCommissionEmployee's toString with superclass", "reference to subclass object", commissionEmployee2.toString());
    }
}