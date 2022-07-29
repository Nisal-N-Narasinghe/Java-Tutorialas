public class apple {
    public static void main(String[] args) {
        int num[] = { 1, 13, 14, 16, 27, 89, 100 };
        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            sum += num[i]; // sum = sum + num[i]
        }
        System.out.println("Sum of the num array: " + sum);
    }
}
