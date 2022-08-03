public class apple {

    public static void main(String[] args) {

        // call first method
        firstmethod("Nisal", 22);
        // call second method
        System.out.println(secondmethod(5, 22));
        // ceate an array
        int num[] = { 1, 2, 3, 4, 5, 6, 7 };
        // call third method
        System.out.println(sumOfNumber(num));

    }

    // no return any value
    public static void firstmethod(String name, int age) {

        System.out.println("Your first name is " + name + " your age is " + age);
    }

    // return integer value
    public static int secondmethod(int a, int b) {
        int ans = a + b;

        return ans;
    }

    // create method to get sum of num array
    public static int sumOfNumber(int number[]) {

        int total = 0;

        for (int y : number) {
            total += y;
        }
        return total;
    }
}
