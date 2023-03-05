package tregulov;

public class Two {
    double square(double r) {
        return One.multiply(One.PI, r, r);
    }

    static double lengthRound(double r) {
        return One.multiply(One.PI, 2, r);
    }

    void info(double r) {
        System.out.println("Радиус равен: " + r);
        System.out.println("Площадь круга равна: " + square(r));
        System.out.println("Длина окружности равна: " + lengthRound(r));
    }

    public static void main(String[] args) {
        Two two = new Two();
        System.out.println(One.multiply(5, 8, 3));
        One.div(43, 3);
        System.out.println(One.multiply(23, 7, 8.3));
        One.div(55, 47);
        two.info(56);
    }
}
