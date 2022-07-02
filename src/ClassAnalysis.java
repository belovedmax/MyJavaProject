import java.util.Scanner;
public class ClassAnalysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failure = 0;
        int studentCounter = 1;
        while (studentCounter <= 10) {   //data for 10 students
            System.out.println("Enter 1 for pass or 2 for fail:");
            int result= input.nextInt();
            if (result == 1)
                passes +=1;
                        else
                            failure +=1;
                        studentCounter= studentCounter+1;
        }
        System.out.printf("passed %d%n failed %d%n", passes ,failure);
        if (passes>8)
            System.out.println("bonus for Teacher");
        else
            System.out.println("teacher needs to put more effort");
    }
}