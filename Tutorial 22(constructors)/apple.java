
import javax.swing.JOptionPane;

public class apple {

    public static void main(String[] args) {

        banana bananaObj = new banana();

        String yourfood = JOptionPane.showInputDialog("Enter your favourite food: ");

        bananaObj.getFoodName(yourfood);
        bananaObj.displayName();
    }

}
