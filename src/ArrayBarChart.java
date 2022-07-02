public class ArrayBarChart {
    public static void main(String[] args) {

        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade distribution");

        for (int c = 0; c < array.length; c++)
        {
            if(c == 10)
            System.out.printf("%5d: ",100);
            else
                System.out.printf("%02d- %02d:" ,c *10, c *10 + 9);
            for (int stars = 0; stars < array[c]; stars++)
                System.out.print("*");
            System.out.println();
        }

    }
}