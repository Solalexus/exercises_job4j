package headfirstjava.different;

import java.util.*;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0, "����");
        a.add(1, "����");
        a.add(2, "���");
        a.add(3, "���");
        printAl(a);
        a.remove(2);
        if (a.contains("���")) {
            a.add("������");
        }
        printAl(a);
        if (a.indexOf("������") != 4) {
            a.add(4, "4.2");
        }
        printAl(a);
        printAl(a);
    }

    public static void printAl(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
