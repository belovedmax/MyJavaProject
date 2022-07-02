import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int grade;
        System.out.println("kindly enter your grade:");
        Scanner input = new Scanner(System.in);
       grade = input.nextInt();
        if (grade>=60)
            System.out.println("you score above average, passed");
        else {
            System.out.println("you failed,and required to sit again for the exam");
        }
    }
}
