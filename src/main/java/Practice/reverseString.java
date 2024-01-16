package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.next();
        char arry[] =s.toCharArray();
        int l=0,r= arry.length-1;
        char c;

        while(l<r)
        {
            c=arry[l];
            arry[l]=arry[r];
            arry[r]=c;
            l++;
            r--;
        }
        for (int i=0;i<arry.length;i++){
            System.out.print(arry[i]);

        }

    }
}
