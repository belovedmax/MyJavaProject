public class Counter {
    public static void main(String[] args) {
        int x;
        int total = 0;
        for (x = 1; x <= 30; x +=2)
            total += x;
        System.out.printf("total is %d:", total);
    }
}
