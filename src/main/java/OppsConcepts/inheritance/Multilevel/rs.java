package OppsConcepts.inheritance.Multilevel;

public class rs {
    public static void main(String[] args) {
        son s=new son();
        Grandfather s1=new son();
        father f=new father();
        f.printDetails("_House");
        f.printDetails("_Home",2);

        s.printDetails();
        f.printDetails();
        Grandfather g=new Grandfather();
        g.printDetails();

        Grandfather gf = new father();
        gf.printDetails();
        Grandfather gf1 = new father();



    }
}
