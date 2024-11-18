package exceptionexamples;

public class FinallyExample {

    public static void main(String[] args) {

        try {
            int a = 10;
            int res = a / 10;
                System.out.println("Res is : " + res);
            } catch (Exception e) {
                System.out.println("Exception Occurred " + e.getMessage());
            } finally {
                System.out.println("Finally block Execution always");
            }
    }
}
