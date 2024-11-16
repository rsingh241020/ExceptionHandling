package exceptionexamples;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Inside Try Block");
            int arr[] ={4,3,2,3,2};
            System.out.println("Arr 6th element is "+arr[6]);
            int b = 10/0;
            System.out.println("B value is "+b);
            System.out.println("end of the try block");

        }catch (ArithmeticException e){
            System.out.println("Exception Occur"+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception Occur :"+e2.getMessage());
        }
        System.out.println("After Multiple Exception/catch Blocks");

    }
}
