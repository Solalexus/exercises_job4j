package tregulov;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(45, "Ivanov", 29, 125.560, "economy");
        Employee emp2 = new Employee(56, "Petrov", 33, 205.320, "sale");
        System.out.println(emp1.multiplySalary());
        System.out.println(emp2.multiplySalary());
    }
}
 