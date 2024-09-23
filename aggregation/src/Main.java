public class Main {
    public static void main(String[] args) {


        Employee emp1 = new Employee("ABC", 28);
        Employee emp2 = new Employee("PQR", 18);
        Employee emp3 = new Employee("XYZ", 11);

        Department department = new Department("IT");
        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);
        department.displayDepartmentInfo();
    }
}