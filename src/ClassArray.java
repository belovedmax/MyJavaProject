import java.util.Arrays;
public class ClassArray {
    public static void main(String[] args) {
        double[] doubleArray = new double[]{8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.println("arrange");

        for (double value : doubleArray)
            System.out.println(value);

            int[] filledIntArray = new int[10];
            Arrays.fill(filledIntArray, 7);
            displayArray(filledIntArray, "fillIntArray");

            int[] intArray = {1, 2, 3, 4, 5, 6};
            int[] intArrayCopy = new int[intArray.length];

            System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
            displayArray(intArray, "intArray");
            displayArray(intArrayCopy, "intArrayCopy");

            boolean b = Arrays.equals(intArray, intArrayCopy);
            System.out.printf("%n%n intArray %s intArrayCopy%n", (b ? "==" : "!="));

            b = Arrays.equals(intArray, filledIntArray);
            System.out.printf("intArray %s filledIntArray%n", (b ? "==" : "!="));

            int location = Arrays.binarySearch(intArray, 5);

            if (location >= 0)
                System.out.printf("found 5 at the element %d in intArray", location);
            else
                System.out.println("5 not in Array");

            location = Arrays.binarySearch(intArray, 8763);

            if (location >= 0)
                System.out.print("found 8763 at element %d in intArray");
        }

        private static void displayArray ( int[] array, String description)
        {
            System.out.printf("%n%s:", description);
            for (int value : array)
                System.out.printf("%d ", value);
        }

    }