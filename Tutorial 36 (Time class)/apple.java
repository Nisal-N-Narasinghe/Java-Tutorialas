public class apple {
    public static void main(String[] args) {

        banana bnObj = new banana();
        System.out.println(bnObj.standardTime());// without passin values

        bnObj.setTime(5, 45, 7);
        System.out.println(bnObj.standardTime());
    }
}
