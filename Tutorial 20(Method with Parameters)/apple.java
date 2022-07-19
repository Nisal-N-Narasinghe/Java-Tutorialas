public class apple {

    public static void main(String[] args) {

        apple appleObj = new apple();
        appleObj.sendMessage("Nisal"); // pass argument value in bracket
        appleObj.sendMessage("Narasinghe"); // pass argument value in bracket

    }

    public void sendMessage(String name) { // "String name" is a argument
        System.out.println("Hello, " + name + "!");

    }

}
