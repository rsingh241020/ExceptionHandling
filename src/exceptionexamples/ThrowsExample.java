package exceptionexamples;

public class ThrowsExample {
    public static void sample() throws InterruptedException, IllegalAccessException {
        System.out.println("Inside sample method");
        int a=40;
        if(a ==10){
            throw new ArithmeticException("a value is 10 and it is a uncheked Exception");
        }
        if(a==20){
            throw new InterruptedException("a vlaue is 20 and it is is a cheked Exception");
        }
        if(a==30){
            throw new NullPointerException("a value is 30 and it is Unchecked Exception");
        }
        if(a==40){
            throw new IllegalAccessException("a value is 40 and it is Checked Exception");
        }
    }
    public static void main(String[] args) {
        try {
            ThrowsExample.sample();
        }catch (Exception e){
            System.out.println("Exception Occurred"+e.getMessage());
        }
    }
}
