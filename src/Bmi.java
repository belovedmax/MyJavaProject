import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight;
        int height;
        System.out.println("Enter your weight");
        weight = input.nextInt();

        System.out.println("Enter your height");
        height = input.nextInt();
        int ibm = (weight / height * height);
        if (ibm < 18.5)
            System.out.printf("%d you are underweight", ibm);

        if (ibm > 18.5 && ibm  < 24.9)
            System.out.printf("%d you are Normal", ibm);

        if (ibm > 25 && ibm  < 29.9)
            System.out.printf("%d you are overweight", ibm);

        if (ibm > 30)
            System.out.printf("%d you are obese", ibm);



    }
}