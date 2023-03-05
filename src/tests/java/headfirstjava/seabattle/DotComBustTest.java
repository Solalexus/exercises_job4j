package headfirstjava.seabattle;

import java.util.ArrayList;

class DotComBustTest {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        int[] loc = {2, 3, 4};
        ArrayList<String> location = new ArrayList<>();
        location.add("4");
        location.add("5");
        location.add("6");
        dot.setLocationCells(location);
        String userGuess = "5";
        String result = dot.checkUserSelf(userGuess);
        String testResult = "Неудача";
        if (result.equals("Попал")) {
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}