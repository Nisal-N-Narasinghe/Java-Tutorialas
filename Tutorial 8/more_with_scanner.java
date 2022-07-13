import java.util.Scanner;

public class more_with_scanner {
    public static void main(String args[]) {

        Scanner myvari = new Scanner(System.in); // create scanner variable
        // int number = myvari.nextInt(); //assign scanner variable value to number this
        // method use if user input is integer
        // float number = num.nextFloat(); //assign scanner variable value to number
        // this method use if user input is float
        String name = myvari.nextLine(); // assign scanner variable value to name variable this method use if user input
                                         // is string
        // System.out.println("Number: " + number);
        System.out.println("My name is " + name);
    }
}
