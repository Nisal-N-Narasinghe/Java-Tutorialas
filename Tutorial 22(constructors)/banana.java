import javax.swing.JOptionPane;

public class banana {

    private String name; // create a private variable for the Name
    private String foodName; // create a private variable for the food name

    // create constructor
    public banana(String pname, String fdName) {
        name = pname; // assign the name to the private variable
        foodName = fdName; // assign the food name to the private variable
    }

    /*
     * // creat a method to get the food name
     * public void getFoodName(String fdname) {
     * foodName = fdname; // assign the food name to the private variable
     * }
     */

    // create a method to return the name
    public String setName() {
        return name;
    }

    // create a method to return the food name
    public String setFoodName() {
        return foodName;
    }

    // create a method to display the food name
    public void displayName() {
        JOptionPane.showMessageDialog(null, setName() + " your favourite food is " + setFoodName());
        // System.out.println("Your favourite food is " + setName());
    }

}