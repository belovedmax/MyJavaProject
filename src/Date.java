public class Date {
    private int day;
    private int month;
    private int year;

    private static final int[] daysPerMonth = { 0,31,28,31,30,31,30,31,31,30,31,30,31};
// for invalid data in month
    public Date (int day, int month,int year){
        if (month <=0 || month >=12)
            throw new IllegalArgumentException("month" +month + "must be 1-12" );

        //to check if the 2nd month is a leap year
        if(day<=0 || (day> daysPerMonth[month] && !(month==2 && day==29)))
            throw new IllegalArgumentException("day" + day+"out of range for the specific month and year");

        if(month==2 && day ==29 && !(year %400 ==0 || year % 4==0 && year %100 !=0))
            throw new IllegalArgumentException("day" +day + "out of range for this year");

        this.month=month;
        this.day =day;
        this.year= year;

        System.out.printf("data object construction for data $s%n", this );
    }
    public String toString(){
        return String.format("%d/%d/%d", month,day,year);

    }

}
