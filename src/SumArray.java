public class SumArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for(int c=0; c< array.length; c++)
            sum += array[c];
        System.out.printf("total: %d%n", sum);


    }
}
