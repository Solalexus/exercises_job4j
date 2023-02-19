package headfirstjava.different;

public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = false;
        t.playTape();
        if (t.canRecord) {
            t.recordTape();
        }
    }
}
