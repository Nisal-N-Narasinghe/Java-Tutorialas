
//import randome randome number generator class
import java.util.Random;

public class apple {
    public static void main(String[] args) {

        Random rand = new Random(); // create object for randome number generator

        int number; // ceate variable for get numbers from generator

        // "forloop" for how many times to generate random numbers
        for (int i = 0; i < 10; i++) {

            number = rand.nextInt(5);

            System.out.println(number);

        }
    }
}
