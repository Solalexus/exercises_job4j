package shildt;

public class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Факториал 3 равен: " + factorial.fact(3));
        System.out.println("Факториал 4 равен: " + factorial.fact(4));
        System.out.println("Факториал 5 равен: " + factorial.fact(5));
    }
}
