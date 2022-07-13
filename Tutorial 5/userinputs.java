//Getting user inputs

import java.util.Scanner; // import scanner to getting user inputs

public class userinputs {
    public static void main(String[] args) {
        //create scanner variable
        Scanner animals = new Scanner(System.in); //"animals" is a random variable name

        //System.out.println(animals.next()); //print first word wiche user input
        System.out.println(animals.nextLine()); //Print whole line wiche user input
    }

}