package OppsConcepts.Class_Constructor;

import OppsConcepts.Class_Constructor.person;

public class usingClass {
    public static void main(String[] args) {
        person p =new person();
        p.email = "akash.@gmail.com";
        System.out.println(p.email);
        p.getDetails();
        person p2 =new person("Panner");
        p2.getDetails();
        System.out.println("----------------------------------");
        person p3 =new person("Sameer",20000,20,889954445);
        p3.getDetails();
        person p4 =new person("Sanjay",40000,30,889954445);
        p4.getDetails();
    }
}
