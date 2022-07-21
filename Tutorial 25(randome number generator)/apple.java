
//import randome randome number generator class
import java.util.Random;

public class apple {
    public static void main(String[] args) {

        Random rand = new Random(); // create object for randome number generator

        int number; // ceate variable for get numbers from generator

        System.out.println("Generate numbers ");
        // "forloop" for how many times to generate random numbers
        for (int i = 0; i < 10; i++) {

            /*
             * getting random number bellow 5 from generator and assign it to number
             * variable
             */
            number = rand.nextInt(5);
            System.out.println(number);// display the values assigned to the number variable

        }

        System.out.println(" ");
        System.out.println("Generate number = number + 1 ");
        for (int j = 0; j < 10; j++) {

            /*
             * getting random number bellow 5 from generator and assign it to
             * number = number + 1
             */
            number = 1 + rand.nextInt(5);
            System.out.println(number);// display the values assigned to the number variable

        }
    }
}
