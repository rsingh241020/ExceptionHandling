package exceptionexamples;

public class NullPointerExceptionExample {
    public static void main(String[] args) {


        try {
            String msg1 = "Hii ROhit";
            String msg2 = null;
            System.out.println("Length of the msg1" + msg1.length());
            System.out.println("Length of the msg2" + msg2.length());

        } catch (NullPointerException e2) {
            System.out.println("Exception occured" + e2.getMessage());
        }
    }
}