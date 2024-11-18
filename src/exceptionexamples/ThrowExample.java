package exceptionexamples;

public class ThrowExample{
    public static void simple(){
        System.out.println("Inside the Sample Method before throwing Exception");
        int a =10;
        if(a==10){
            throw new RuntimeException("define by me ");
        }
        System.out.println("a value is :" +a);
    }

    public static void main(String[] args) {
        try {
            ThrowExample.simple();
        }catch(Exception e){
            System.out.println("Exception occured : "+e.getMessage());
        }
    }

}
