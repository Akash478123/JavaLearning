package OppsConcepts.inheritance.Multilevel;

public class father extends Grandfather{
    Grandfather g = new Grandfather();
    void printDetails(int c){
        System.out.println("father");
    }

    void printDetails(String a){
        System.out.println("father"+a);
    }

    void printDetails(String a,int b){
        System.out.println("father"+a+b);
    }
}
