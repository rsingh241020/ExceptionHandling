package exceptionexamples;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside First Try Block");
            int a = 10;
            int res = a / 2; // No ArithmeticException here
            System.out.println("a value is: " + a);
            System.out.println("Res value is: " + res);

            // First nested try block
            try {
                int arr[] = {4, 3, 4, 3};
                System.out.println("Array element at 2nd position: " + arr[2]); // Valid index
                System.out.println("Array element at 5th position: " + arr[5]); // Throws ArrayIndexOutOfBoundsException

                // Second nested try block
                try {
                    String str = null;
                    System.out.println("String length is: " + str.length()); // Throws NullPointerException
                } catch (NullPointerException e) {
                    System.out.println("3rd Catch Block");
                    System.out.println("Exception Occurred: " + e.getMessage());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("2nd Catch Block");
                System.out.println("Exception Occurred: " + e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println("1st Catch Block");
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }
}
