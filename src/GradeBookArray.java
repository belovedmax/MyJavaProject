public class GradeBookArray {
    public class GradeBook {
        private String courseName;
        private final int[][] grades;

        public GradeBook(String courseName, int [][] grades) {
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
            System.out.printf("n%s %d%n%s %d%n%n", "%Lowest grade is:", getMinimum(),"Highest grade is:",getMaximum());
            outputBarchart();
        }

        public int getMinimum() {
            int lowGrade = grades[0][0];

            for (int[] studentGrades : grades) {
                for (int grade : studentGrades) {


                    if (grade < lowGrade)
                        lowGrade = grade;
                }
            }
            return lowGrade;
        }

        public int getMaximum() {
            int highGrade = grades[0][0];

            for (int[] studentGrades : grades) {
                for (int grade : studentGrades) {
                    if (grade > highGrade)
                        highGrade = grade;
                }
            }

                return highGrade;

        }
        private double getAverage(int [] setOfGrades) {
            int total = 0;
            for (int grade : setOfGrades)
                total += grade;
            return (double) total / setOfGrades.length;
        }

        public void outputBarchart() {

           int [] frequency = new int[11];
           for(int[] studentGrades:grades){
               for (int grade : studentGrades)
                   ++frequency[grade / 10];
           }

            System.out.println("Grade distribution");

            for (int count = 0; count <frequency.length; count++){
                if(count == 10)
                    System.out.printf("%5d: ",100);
                else
                    System.out.printf("%02d- %02d:" ,count *10, count *10 + 9);

                for (int stars = 0; stars < frequency[count]; stars++)
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

}
