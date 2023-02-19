package ru.job4j.condition;

public class Task76 {
    public static void sameNumAmount(int num) {
       /* String numbers = String.valueOf(num);
        int counter = 1;
        for (int i = 0; i < numbers.length() - 1; i++) {
            if (numbers.codePointAt(i) == numbers.codePointAt(i+1)) {
                counter++;
            }
        }
        System.out.println(counter == 1 ? 0 : counter);
    }*/

        int counter = 0;
        int fig1 = num / 100;
        int fig2 = num % 100 / 10;
        int fig3 = num % 10;
        if (fig1 == fig3 && fig2 == fig3) {
            counter = 3;
        } else if (fig1 == fig2 || fig1 == fig3 || fig2 == fig3) {
            counter = 2;
        }
        System.out.println(counter);
    }
}
