
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your Name: ");
        String sci = JOptionPane.showInputDialog("Enter your science marks: ");
        float science = Float.parseFloat(sci);
        String mth = JOptionPane.showInputDialog("Enter your maths marks: ");
        float maths = Float.parseFloat(mth);
        // System.out.println("Enter your science marks: ");
        // Scanner sci = new Scanner(System.in);
        // System.out.println("Enter your maths marks: ");
        // Scanner mth = new Scanner(System.in);
        // float science = sci.nextFloat();
        // float maths = mth.nextFloat();

        if (maths >= 75 && science >= 75) {
            JOptionPane.showMessageDialog(null, name + " your Grade is A");
        } else if (maths >= 65 && science >= 65) {
            JOptionPane.showMessageDialog(null, name + " your Grade is B");
        } else if (maths >= 55 && science >= 55) {
            JOptionPane.showMessageDialog(null, name + " your Grade is C");
        } else if (maths >= 45 && science >= 45) {
            JOptionPane.showMessageDialog(null, name + " your Grade is D");
        } else if ((maths < 45 && maths > 0 && science < 45 && science > 0)) {
            JOptionPane.showMessageDialog(null, name + ", uba fail machn");
        } else {
            JOptionPane.showMessageDialog(null, name + " Invalid Input.. Please enter valid marks..");
        }

    }

}
