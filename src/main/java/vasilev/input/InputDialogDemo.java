package vasilev.input;
import javax.swing.JOptionPane;

public class InputDialogDemo {
    public static void main(String[] args) {
        String text;
        text = JOptionPane.showInputDialog("Введите текст");
        JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n" + text);
    }
}
