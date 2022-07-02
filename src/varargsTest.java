public class varargsTest {

    private static double average(double... number) {

        double total =0;
        for(double d : number)
            total +=d;

        return total/number.length;
    }
    public static void main(String[] args) {
        double d1 =10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;


        System.out.printf("D1 = %.1f%nD2 = %.1f%nD3 = %.1f%nD4 = %.1f%n", d1,d2,d3,d4);

        System.out.printf("%nAverage of d1 and d2: %.1f%n", average(d1,d2));
        System.out.printf("%nAverage of d1,d2,d3: %.1f%n", average(d1,d2,d3));
        System.out.printf("sum of d1 & d2: %.1f%n", d1+d2);
    }

}
