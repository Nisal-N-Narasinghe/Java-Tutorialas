import javax.swing.JOptionPane;

public class joptionpane {
    
    
    public static void main(String args[]) {
        
            String name = JOptionPane.showInputDialog("Hi , My name is Acer. What is your name?");

            JOptionPane.showMessageDialog(null, "I love you " + name);
    }
}
