public class apple {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 65, 64, 12, 15, 78 };

        int sum = 0;

        // Enhanced for loop
        for (int i : num) {
            sum += i;
        }
        System.out.println("Sum of num array: " + sum);
    }
}
