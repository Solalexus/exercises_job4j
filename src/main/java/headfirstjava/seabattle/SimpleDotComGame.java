package headfirstjava.seabattle;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] location = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(location);
        boolean isAlive = true;
        while (isAlive = true) {
            String guess = helper.getUserInput("������� �����");
            String result = theDotCom.checkUserSelf(guess);
            numOfGuesses++;
            if (result.equals("�������")) {
                isAlive = false;
                System.out.println("��� �������������" + numOfGuesses + "�������(�)");
            }
        }
    }
}
