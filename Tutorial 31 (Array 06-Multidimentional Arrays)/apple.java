public class apple {
    public static void main(String[] args) {

        // Create a multidimensional array
        int num[][] = { { 1, 2, 3, 4, 5 }, { 11, 21, 3, 42, 53 }, { 21, 22, 23, 24, 25 } };
        int num2[][] = { { 1, 2, 3, 4, 5 }, { 11, 21, 42, 53 }, { 21, 22, 23, 24, 25 }, { 12 } };

        System.out.println(num[2][3]); // Display the value of 2,3 index
        System.out.println(num.length); // Display the length of the array
        System.out.println(num2[2].length); // Display the length of the 3rd row
        System.out.println(num2[3].length); // Display the length of the 4th row

        // Display values in num array
        System.out.println(" ");
        System.out.println("num array");
        for (int row = 0; row < num.length; row++) {
            for (int column = 0; column < num[row].length; column++) {
                System.out.print(num[row][column] + "\t");
            }
            System.out.println(" ");

        }

        // Display values in num2 array
        System.out.println(" ");
        System.out.println("num2  array");
        for (int row = 0; row < num2.length; row++) {
            for (int column = 0; column < num2[row].length; column++) {
                System.out.print(num2[row][column] + "\t");
            }
            System.out.println(" ");

        }

        // call method to display num array values
        System.out.println(" ");
        System.out.println("num array");
        displayArrayValues(num);

        // call method to display num2 array values
        System.out.println(" ");
        System.out.println("num2 array");
        displayArrayValues(num2);

    }

    // create a method to return the array values
    public static void displayArrayValues(int y[][]) {

        for (int row = 0; row < y.length; row++) {
            for (int column = 0; column < y[row].length; column++) {
                System.out.print(y[row][column] + "\t");
            }
            System.out.println(" ");

        }
    }
}
