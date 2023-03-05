package tregulov;

public class Overloaded {
    int sum() {
        int sum = 0;
        System.out.println(sum);
        return sum;
    }

    int sum(int a) {
        int sum = a;
        System.out.println(sum);
        return sum;
    }

    int sum(int b, int c) {
        int sum = b + c;
        System.out.println(sum);
        return sum;
    }

    int sum(int d, int e, int f) {
        int sum = d + e + f;
        System.out.println(sum);
        return sum;
    }

    int sum(int g, int h, int i, int j) {
        int sum = g + h + i + j;
        System.out.println(sum);
        return sum;
    }
}

class Adds {
    public static void main(String[] args) {
        Overloaded over = new Overloaded();
        over.sum();
        over.sum(3);
        over.sum(2, 3);
        over.sum(5, 7, 18);
        over.sum(4, 0, 3, 11);
    }
}
