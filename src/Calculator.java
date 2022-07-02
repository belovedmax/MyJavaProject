import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double p1 = 2.98;
        double p2 = 4.50;
        double p3 = 9.98;
        double p4 = 4.49;
        double p5 = 6.87;
        double total =0;
      Scanner input = new Scanner(System.in);
        System.out.println("Enter product number 1,2,3,4,5 or -1 to end:");
        int product = input.nextInt();

        while (product != -1){
            System.out.println("Enter product quantity");
            int quantity = input.nextInt();

            switch (product){
                case 1:
                    double price = p1 * quantity;
                    System.out.printf("pls pay $%.2f of purchased Bread %n", price);
                    total += price;
                    break;

                    case 2:
                         price = p2 * quantity;
                        System.out.printf("pls pay $%.2f of purchased Chocolate %n", price);
                        total += price;
                        break;
                case 3:
                    price = p3 * quantity;
                    System.out.printf("pls pay $%.2f of purchased Cream %n", price);
                    total += price;
                    break;

                case 4:
                    price = p4 * quantity;
                        System.out.printf("pls pay $%.2f of purchased Wipes %n", price);
                    total += price;
                    break;
                case 5:
                    price = p5* quantity;
                    System.out.printf("pls pay $%.2f of purchased Butter %n", price);
                    total += price;
                    break;
            }
            System.out.println("Enter product number 1,2,3,4,5 or -1 to end:");
             product = input.nextInt();

        }
        System.out.printf("Total is %.2f%n", total);
        System.out.println("Thanks for shopping with us");
    }
}
