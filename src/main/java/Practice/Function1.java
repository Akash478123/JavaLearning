package Practice;

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter any 2 number");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sum(a,b);
        System.out.println("addition is :"+c);

    }

    static int sum(int a , int b){
        return a+b;
    }
}
