class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7,7,1949);
        Date hire = new Date(3,6,1988);
        Employee employee= new Employee("Maxwell", "John", birth,hire);
        System.out.println(employee);
    }
}
