package ru.job4j.headfirstjava;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "пузырь пива";
        while (beerNum > 0) {
            word = condition(word, beerNum);
            out(word, beerNum);
            beerNum--;
            if (beerNum > 0) {
                word = condition(word, beerNum);
                System.out.println(beerNum + " " + word + "пива на стене");
                System.out.println();
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }

    private static String condition(String word, int beerNum) {
        if ((beerNum > 4 && beerNum < 21) || beerNum % 10 > 4 || beerNum % 10 == 0) {
            word = "бутылок ";
        } else if (beerNum % 10 == 1) {
            word = "бутылка ";
        } else {
            word = "бутылки ";
        }
        return word;
    }

    private static String out(String word, int beerNum) {
        System.out.println(beerNum + " " + word + "пива на стене");
        System.out.println(beerNum + " " + word + "пива");
        System.out.println("Возьми одну");
        System.out.println("Пусти по кругу");
        return word;
    }
}
