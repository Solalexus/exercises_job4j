package tregulov;

public class One {
    public static final double PI = 3.14;

    static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    static void div(int d, int e) {
        System.out.println("Целое частное =  " + d / e + ", Остаток = " + d % e);
    }
}
