public class SumOfOddInt {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 15; ++i) {
            if (i % 2 != 0) {
                System.out.printf("this is an odd number:%d %n", i);
                sum += i;
                ++i;

            }
        }  System.out.printf("this the sum %d", sum);

    }
}