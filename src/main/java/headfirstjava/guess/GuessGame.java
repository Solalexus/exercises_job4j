package headfirstjava.guess;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player(); p2 = new Player(); p3 = new Player();
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        boolean p1ipRight = false; boolean p2ipRight = false; boolean p3ipRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("� ��������� ����� �� 0 �� 9...");

        while (true) {
            System.out.println("�����, ������� ����� �������, - " + targetNumber);
            p1.guess(); p2.guess(); p3.guess();
            guessp1 = p1.number;
            System.out.println("������ ����� ������, ��� ��� " + guessp1);
            guessp2 = p2.number;
            System.out.println("������ ����� ������, ��� ��� " + guessp2);
            guessp3 = p3.number;
            System.out.println("������ ����� ������, ��� ��� " + guessp3);

            if (guessp1 == targetNumber) {
                p1ipRight = true;
            }
            if (guessp2 == targetNumber) {
                p2ipRight = true;
            }
            if (guessp3 == targetNumber) {
                p2ipRight = true;
            }
            if (p1ipRight || p2ipRight || p3ipRight) {
                System.out.println("� ��� ���� ����������!");
                System.out.println("������ ����� ������?" + p1ipRight);
                System.out.println("������ ����� ������?" + p2ipRight);
                System.out.println("������ ����� ������?" + p3ipRight);
                System.out.println("����� ����");
                break;
            } else {
                System.out.println("������ ������ ����������� ��� ���.");
            }
        }
    }
}
