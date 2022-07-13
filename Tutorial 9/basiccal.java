import java.util.Scanner;

public class basiccal {
    public static void main(String args[]) {
        Scanner sum = new Scanner(System.in);
        double num1, num2, ans;

        // Input first value and store it
        System.out.println("Enter first number: ");
        num1 = sum.nextDouble();

        // Input second value and store it
        System.out.println("Enter second number: ");
        num2 = sum.nextDouble();

        ans = num1 + num2;

        System.out.println("Answer is: " + ans);

    }
}
