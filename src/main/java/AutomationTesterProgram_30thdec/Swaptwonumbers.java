package AutomationTesterProgram_30thdec;

import java.util.Scanner;

public class Swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap");
        System.out.println("Value of A is "+a);
        System.out.println("Value of B is "+b);

        sc.close();
    }
}
