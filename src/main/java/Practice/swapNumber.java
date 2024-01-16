package Practice;

public class swapNumber {
    public static void main(String[] args) {
        swap(2,3);
        swap(11,86);
        swap(11435634534l,8345345346l);





    }
    static void swap(long a , long b)
    {
        long temp=a;
        a=b;
        b=temp;
        System.out.println("a vlaue--> "+a);
        System.out.println("b vlaue--> "+b);

    }
}
