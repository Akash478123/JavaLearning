package Practice;

import javax.swing.text.Style;
import java.util.Scanner;

public class palindromeWithStingBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder s = new StringBuilder(sc.next());
        String orgstr = new String(s.toString());
        String rvstr = new String(s.reverse());
        if (orgstr.equals(rvstr)){
            System.out.println(orgstr+ " is a palindrome");
        }
        else {
            System.out.println(orgstr+ " is not palindrome");
        }
    }
}
