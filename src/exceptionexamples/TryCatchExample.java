package exceptionexamples;

public class TryCatchExample {
    public static void main(String[] args) {
        //this class show the example of the exceptions unhandled case
        int a = 10;
        int res =0;
        try {
            // Code to Monitor
            System.out.println("inside the try Block before Exception Occur .");

            res = a / 0;
            System.out.println("Inside the try block after Exception Occurs");
        }
        catch(ArithmeticException e){
            //handle the Exception
            System.out.println("Exception Occurs"+e.getMessage());
        }
        System.out.println("A value is " +a);
        System.out.println("B value is " +res);
    }
}
