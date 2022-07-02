public class InitArray {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3,}, {4, 5, 6}};
        int[][] array2 = {{1, 2,}, {3}, {4, 5, 6}};

        System.out.println("values of First array ");
        outputArray(array1);
        System.out.println("value of second array");
        outputArray(array2);
    }

    private static void outputArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++)
                System.out.printf("%d ", array[row][column]);
            System.out.println();
        }
    }
}