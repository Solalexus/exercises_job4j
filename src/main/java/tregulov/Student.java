package tregulov;

public class Student {
    int idcard;
    String name;
    String surname;
    int year;
    int math;
    int economy;
    int language;
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st1.name = "Павел ";
        st1.surname = "Иванов";
        st1.math = 4;
        st1.economy = 3;
        st1.language = 5;
        int average1 = (st1.math + st1.economy + st1.language) / 3;

        st2.name = "Сергей ";
        st2.surname = "Петров";
        st2.math = 5;
        st2.economy = 5;
        st2.language = 3;
        int average2 = (st2.math + st2.economy + st2.language) / 3;

        st3.name = "Алексей ";
        st3.surname = "Сергеев";
        st3.math = 3;
        st3.economy = 3;
        st3.language = 3;
        int average3 = (st3.math + st3.economy + st3.language) / 3;

        System.out.println(st1.name + st1.surname + "-средняя оценка-" + average1);
        System.out.println(st2.name + st2.surname + "-средняя оценка-" + average2);
        System.out.println(st3.name + st3.surname + "-средняя оценка-" + average3);

    }
}
