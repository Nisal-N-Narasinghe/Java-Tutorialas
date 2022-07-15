
import javax.swing.JOptionPane;

public class switch_statement {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your Name: ");
        String ag = JOptionPane.showInputDialog("Enter your age: ");

        switch (ag) {
            case "12":
                JOptionPane.showMessageDialog(null, name + " is a baby");
                break;
            case "14":
                JOptionPane.showMessageDialog(null, name + " is a teenager");
                break;
            case "18":
                JOptionPane.showMessageDialog(null, name + " is a adult");
                break;
            case "20":
                JOptionPane.showMessageDialog(null, name + " is not a teenager");
                break;
            case "60":
                JOptionPane.showMessageDialog(null, name + " is a retired person");
                break;
            default:
                JOptionPane.showMessageDialog(null, name + " Invalid Input.. Please enter ..");

        }

    }

}
