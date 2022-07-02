import java.util.Scanner;
public class ClassQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter =0;
        System.out.println("enter grade or -1 to quit:");
        int grade = input.nextInt();

        while (grade != -1)
        {
            total = total+grade;
            gradeCounter = gradeCounter +1;
            System.out.println("enter grade or -1 to quit:");
            grade = input.nextInt();
        }
       if (gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;

            System.out.printf("%nTotal of the %d grade enter is %d%n", gradeCounter,total);
            System.out.printf("class average is %.2f%n", average);
        }
        else
        System.out.println("no grade were entered");
    }
}
