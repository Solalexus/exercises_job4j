package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l == null && r == null || l.charAt(1) == r.charAt(r.length() - 1)
                && r.charAt(1) == r.charAt(l.length() - 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String l = "check";
        System.out.println(l.charAt(2));
    }
}
