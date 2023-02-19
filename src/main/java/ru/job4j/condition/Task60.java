package ru.job4j.condition;

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        String out;
        if (a == b && a == c) {
            out = "Все равны";
        } else if (a != b && a != c && b != c) {
            out = "Равных нет";
        } else if (a == b) {
            out = b > c ? "Первое и второе равны, третье меньше" : "Первое и второе равны, третье больше";
        } else if (a == c) {
            out = b > c ? "Первое и третье равны, второе больше" : "Первое и третье равны, второе меньше";
        } else {
            out = b > a ? "Второе и третье равны, первое меньше" : "Второе и третье равны, первое больше";
        }
        System.out.println(out);
    }
}
