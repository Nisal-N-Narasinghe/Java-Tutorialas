public class apple {
    public static void main(String[] args) {
        int num[] = { 12, 34, 45, 46, 47, 48, 49, 50, 51, 52 };

        // call to change method
        change(num);

        // Display values afetr method called
        for (int i : num) {
            System.out.println(i);
        }
    }

    public static void change(int x[]) {
        for (int i = 0; i < x.length; ++i) {
            x[i] += 10; // add 10 to all elements in the array
        }
    }
}
