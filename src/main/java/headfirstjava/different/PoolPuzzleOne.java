package headfirstjava.different;

public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {                   //здесь либо x<1 либо x<4
            System.out.print("a");       //выполняется всегда, без условия
            if (x < 1) {                 //постоянная
                System.out.print(" ");
            }
            System.out.print("n");       //выполняется всегда, без условия
            if (x > 1) {                  //варианты - x>1, x>0, x>3, x<1, x<4
                System.out.print(" oyster");
                x += 2;                       //варианты - x=x+1, x=x+2, x=x-2, x=x+2
            }
            if (x == 1) {                       //постоянная
                System.out.print("noys");
            }
            if (x < 1) {                  //варианты - x>1, x>0, x>3, x<1, x<4
                System.out.print("oise");
            }
            System.out.println("");           //выполняется всегда, без условия
            x += 1;                          //варианты - x=x+1, x=x+2, x=x-2, x=x+2
        }
    }
}
