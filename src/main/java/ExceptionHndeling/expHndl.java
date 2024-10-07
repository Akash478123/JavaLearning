package ExceptionHndeling;

public class expHndl {
    public static void main(String[] args) {
        try
        { int a= 20,b=0,c=a/b;
            System.out.println(c);

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Thank you");
    }

}
