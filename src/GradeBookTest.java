public class GradeBookTest {
    public static void main(String[] args) {
        int [] gradeArray = {87,68,94,100,83,78,85,91,76,87};
        GradeBook myGradeBook = new GradeBook("csc 201 introduction tot java programming",gradeArray);
        System.out.printf("Welcome to the grade book for %n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }

}
