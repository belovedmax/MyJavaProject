public class Mii {
    public static void main(String[] args) {
        int row =10;
        while (row >=10)
        {
            int column = 1;
            while (column<=10)
            {
                System.out.println(row %2==1? "<" : ">");
                ++column;
            }--row;
            System.out.println();
        }

    }
}
