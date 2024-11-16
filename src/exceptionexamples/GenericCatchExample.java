package exceptionexamples;

public class GenericCatchExample {
    public static void main(String[] args) {
        try{
            System.out.println("Inside Try Block");
            int arr[] ={4,3,2,3,2};
            System.out.println("Arr 6th element is "+arr[3]);
            int b = 10/0;
            System.out.println("B value is "+b);
            System.out.println("end of the try block");

        }catch (Exception e){
            System.out.println("Exception Occur"+e.getMessage());
        }
    }
}
