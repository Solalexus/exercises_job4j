package tregulov;

public class Student {
    int id;
    String name;
    String surname;
    int course;
    int math;
    int economy;
    int language;

    Student() { }

    Student(int id1, String name1, String surname1, int course1, int math1, int economy1, int language1) {
        id = id1;
        name = name1;
        surname = surname1;
        course = course1;
        math = math1;
        economy = economy1;
        language = language1;
    }

    Student(int id2, String name2, String surname2, int course2) {
        this(id2, name2, surname2, course2, 0, 0, 0);
    }
}

class StudentTest {
        int averageArithmetic(Student st) {
        int average = (st.math + st.economy + st.language) / 3;
        System.out.println(st.name + st.surname + " - средняя оценка - " + average);
        return average;
    }

    public static void main(String[] args) {
        StudentTest studentTest = new StudentTest();

        Student st1 = new Student();
        Student st2 = new Student(100, "Sergey ", "Ivanov", 2);
        Student st3 = new Student(101, "Pavel ", "Petrov", 4, 3, 5, 5);

        st1.name = "Павел ";
        st1.surname = "Иванов";
        st1.math = 4;
        st1.economy = 3;
        st1.language = 5;
        studentTest.averageArithmetic(st1);

        st2.math = 5;
        st2.economy = 5;
        st2.language = 3;
        studentTest.averageArithmetic(st2);

        studentTest.averageArithmetic(st3);
    }
}
