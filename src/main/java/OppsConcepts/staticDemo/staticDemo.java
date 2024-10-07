package OppsConcepts.staticDemo;

public class staticDemo {
    static int a=20;
    static int c=20;
    int b=10;

    static int add(){
       return a+c;
    }
      void addition(){
        System.out.println(a+b);
    }
}

class rc{
    public static void main(String[] args) {
        System.out.println(staticDemo.a);
        int n = staticDemo.add();
        System.out.println(n);
    }
}
