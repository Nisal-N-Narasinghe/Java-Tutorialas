public class apple {
    public static void main(String[] args) {
        secondMeth(2, 3, 4, 6, 7);
    }

    public static void secondMeth(int... numbers) {
        int total = 0;

        for (int y : numbers)
            total += y;

        System.out.println("average: " + total / numbers.length);
    }
}
