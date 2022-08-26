public class apple {
    public static void main(String[] args) {

        banana bnObj = new banana();
        System.out.println(bnObj.standardTime());// without passin values

        bnObj.setTime(14, 45, 7);
        System.out.println(bnObj.standardTime()); // call standard time method
        System.out.println(bnObj.regularTime()); // call regular time method

    }
}
