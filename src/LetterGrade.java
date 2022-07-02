import java.util.Scanner;
public class LetterGrade {
    public static void main(String[] args) {

        int total = 0;

        int acount = 0;
        int bcount = 0;
        int ccount = 0;
        int dcount = 0;
        int fcount = 0;
        int gradecounter = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your desired scores from 1-100");
        int grade = input.nextInt();

        while (grade != -1)
        {
            total += grade;
            ++gradecounter;


            switch (grade / 10)
            {
                case 9:
                case 10:
                    ++acount;
                    break;
                case 8:
                    ++bcount;
                    break;
                case 7:
                    ++ccount;
                    break;
                case 6:
                    ++dcount;
                    break;
                default:
                    ++fcount;
                    break;

            }

            System.out.println("%Enter your desired scores from 1-100");
            grade = input.nextInt();

        }

        System.out.printf("%n Grade result: %n ");
        if (gradecounter != 0)
        {
            double average = (double) total / gradecounter;
            System.out.printf("The sum of %d grades is %d :",gradecounter, total);
            System.out.printf("The average of the inputted number is %.2f :", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "the number of student with each grade :" ,
                    "A = ", acount,
                    "B = ", bcount,
                    "C = " ,ccount,
                    "D = ", dcount,
                    "F = ", fcount);
        }
        else
            System.out.println("no grade were enter");
    }

    }

