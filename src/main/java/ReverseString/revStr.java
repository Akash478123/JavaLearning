package ReverseString;

import java.util.Scanner;

public class revStr {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        revedStr(str);

    }

    private static void revedStr(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rs = String.valueOf(sb.reverse());
        System.out.println("when string is revered "+ rs);

        if(rs.equals(str) )
        {
            System.out.println(rs + " is palindrome");
        }
        else {
            System.out.println(rs + " is not palindrome");
        }

    }


}
