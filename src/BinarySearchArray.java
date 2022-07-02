import java.util.Arrays;
public class BinarySearchArray {

    public static void main(String[] args) {

        int[] array = {2,4,9,5,8,6};
        int key = 9;
        int result = Arrays.binarySearch(array,key);
        if (result < 0)
            System.out.println("not in the element");
        else
            System.out.println(result);

    }

}
