import javax.swing.JOptionPane;

public class apple {

    public static void main(String[] args) {

        mango mangoObj = new mango();

        String yourfood = JOptionPane.showInputDialog("Enter your favourite food: ");

        mangoObj.getFoodName(yourfood);
        mangoObj.displayName();
    }

}
