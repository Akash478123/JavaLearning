package OppsConcepts;

public class usingClass {
    public static void main(String[] args) {
        person p =new person();
        p.email = "akash.@gmail.com";
        System.out.println(p.email);
        p.getDetails(23443534523l);
        person p2 =new person("Panner");
        p2.getDetails(34453243l);

    }
}
