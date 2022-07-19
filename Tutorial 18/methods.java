public class methods {
    public static void main(String[] args) {

        // call the method
        firstmethod();

        /*
         * Second method is not a static method,
         * so we need to create a object to call the second method
         */

        methods nisalObj = new methods(); // class_name<space>object_name = new<space>class_name<space>
        nisalObj.secondmethod(); // call to non static method

    }

    // Create a method
    public static void firstmethod() {
        System.out.println("First method");
    }

    public void secondmethod() {
        System.out.println("second method");
    }

}
