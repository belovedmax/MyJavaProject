public class GradeBook {
    private String courseName;
    private final int[] grades;

    public GradeBook(String courseName, int [] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {

        return courseName;
    }

    public void processGrades() {
        outputGrades();
        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());
        outputBarchart();
    }

    public int getMinimum() {
        int lowGrade = grades[0];

        for (int grade : grades) {
            if (grade < lowGrade)
                lowGrade = grade;
        }
        return lowGrade;
    }

    public int getMaximum() {
        int highGrade = grades[0];
        for (int grade : grades) {
            if (grade > highGrade)
                highGrade = grade;
        }
        return highGrade;
    }

    private double getAverage() {
        int total = 0;
        for (int grade : grades)
            total += grade;
        return (double) total / grades.length;
    }

    public void outputBarchart() {

        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade distribution");

        for (int c = 0; c < array.length; c++)
        {
            if(c == 10)
                System.out.printf("%5d: ",100);
            else
                System.out.printf("%02d- %02d:" ,c *10, c *10 + 9);
            for (int stars = 0; stars < array[c]; stars++)
                System.out.print("*");
            System.out.println();
        }
    }
    public void outputGrades() {
        System.out.printf("the grade are : %n%n");
        for (int student = 0; student < grades.length; student++)
            System.out.printf("student %2d: %3d%n", student + 1, grades[student]);
    }
}
