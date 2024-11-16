package exceptionexamples;

public class ArrayOutOfBoundExample {
    public static void main(String[] args) {
        try {
            int Arr[] = {2, 3, 2, 3};
            System.out.println(Arr.length);
            System.out.println(Arr[2]);
            System.out.println(Arr[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occur "+e.getMessage());
        }
    }

}
