import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner perfect = new Scanner(System.in);
        System.out.println("enter number 1- 1000");
         long num = perfect.nextInt();
       int sum = 0;
       int i = 1;
       while (i <= num/2){
           if (num % i ==0){
               sum= sum + i;}
               ++i;
           }
           if(sum == num){
               System.out.println(num+  " is  perfect ");
           }
           else
               System.out.println(num+  "  is not perfect ");


    }
}
