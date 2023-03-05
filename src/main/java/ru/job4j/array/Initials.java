package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
       return fio[0] + " " + fio[1].toCharArray()[0] + "." + fio[2].toCharArray()[0] + ".";
    }
}
