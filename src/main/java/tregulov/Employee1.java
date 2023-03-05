package tregulov;

public class Employee1 {
    public static void main(String[] args) {
        Employee employee = new Employee(32, "Ivanov", 22, 50000, "IT");
        Employee employee1 = new Employee(33, "Petrov", 40, 70000);
        employee1.showId();
        employee1.showAge();
        employee1.showSalary();

        employee.showId();
        employee.showAge();
        employee.showSalary();

        System.out.println(employee.id + employee.age + employee.multiplySalary());
    }
}
