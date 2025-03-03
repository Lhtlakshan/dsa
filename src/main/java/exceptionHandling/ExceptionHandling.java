package exceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try{
            divide(4,0);
        }catch(ArithmeticException ex){
            System.out.println("Arithmetic Exception " + ex.getMessage());
        }catch(Exception ex){
            System.out.println("Exception "+ex.getMessage());
        }finally {
            System.out.println("This will always execute"); //always execute
        }
    }

    static int divide(int a, int b) throws ArithmeticException{ // throws use to declare an exception
        if(b==0){
            throw new ArithmeticException("please do not divided by 0"); // use to throw an exception
        }
        return a/b;
    }
}
