package OppsConcepts.staticDemo;

public class staticDemo {
    static int a=20;
    int b=10;

    static void add(){
//        System.out.println(a+b);
    }
      void addition(){
        System.out.println(a+b);
    }
}

class rc{
    public static void main(String[] args) {
        staticDemo s= new staticDemo();
        s.addition();
    }
}
