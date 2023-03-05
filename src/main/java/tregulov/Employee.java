package tregulov;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    Employee(int id, String surname, int age, double salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    private Employee(String surname, int age, double salary, String department) {
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public void showId() {
        System.out.println(id);
    }

    public void showAge() {
        System.out.println(age);
    }

    public void showSalary() {
        System.out.println(salary);
    }

    double multiplySalary() {
        return salary * 2;
    }
}
