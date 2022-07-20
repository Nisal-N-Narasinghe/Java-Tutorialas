import javax.swing.JOptionPane;

public class mango {

    private String foodName; // create a private variable for the food name

    // creat a method to get the food name
    public void getFoodName(String fdname) {
        foodName = fdname; // assign the food name to the private variable
    }

    // create a method to return the food name
    public String setName() {
        return foodName;
    }

    // create a method to display the food name
    public void displayName() {
        JOptionPane.showMessageDialog(null, "Your favourite food is " + setName());
        // System.out.println("Your favourite food is " + setName());
    }

}
