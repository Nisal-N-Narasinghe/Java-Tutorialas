
import javax.swing.JOptionPane;

public class apple {

    public static void main(String[] args) {

        String yourName = JOptionPane.showInputDialog("Enter your Name: ");
        String yourFood = JOptionPane.showInputDialog("Enter your favourite food: ");

        banana bananaObj = new banana(yourName, yourFood);

        // bananaObj.getFoodName(yourfood);
        bananaObj.displayName();

    }

}
