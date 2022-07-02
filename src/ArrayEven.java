public class ArrayEven {
    public static void main(String[] args) {

        int []array = new int[10];

        for(int c=0; c< array.length; c++)
            array[c] = 2 +2 *c;
        System.out.printf("%s%8s%n" ,"index" ,"value");

        for(int c=0; c< array.length; c++)
            System.out.printf("%5d%8d%n",c, array[c]);
    }
}
