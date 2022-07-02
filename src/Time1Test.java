

public class Time1Test {
    public static void main(String[] args) {
        Time1 time= new Time1();

        displayTime("after time object is created",time);
        System.out.println();
        time.setTime(13,27,6);
        displayTime("after calling setTime", time);
        System.out.println();

        try{
            time.setTime(69,90,66);
        }
        catch (IllegalArgumentException e){
            System.out.printf("exceptional case: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid", time);
    }

    private static void displayTime(String header, Time1 t) {
        System.out.printf("%%nUniversal time : %s%n",header,t.toUniversalString(),t.toString());
    }
}
