import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {

        int [] array = new int[]{4,1,2,7,6,9,8,-1};
        Arrays.sort(array);
        System.out.println("arrange");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
