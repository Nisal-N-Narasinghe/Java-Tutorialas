public class apple {
    public static void main(String[] args) {
        secondMeth(2, 3, 4, 6, 7); // pass value
    }

    public static void secondMeth(int... numbers) { // creatr variable length argument
        int total = 0;

        for (int y : numbers) // for loop for calculate the total of the entered values
            total += y;

        System.out.println("average: " + total / numbers.length); // Display the average of the total
    }
}
