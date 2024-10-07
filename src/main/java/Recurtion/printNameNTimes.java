package Recurtion;

import java.util.Scanner;

public class printNameNTimes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printName(1,n);
    }

    static void printName(int i, int n)
    {
        if(i>n)
        {
            return;
        }
        i++;
        System.out.println("akash");
        printName( i,n);
    }
}
