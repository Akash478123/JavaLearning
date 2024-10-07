package Recurtion;

public class Try01 {
    public static void main(String[] args) {

        rec();
    }
    static int count =0;
    static void rec() {

        if(count == 0100)
        {
            return;
        }
        count ++;
        System.out.println(1);
        rec();
    }
}

