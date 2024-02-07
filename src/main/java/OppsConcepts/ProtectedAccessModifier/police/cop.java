package OppsConcepts.ProtectedAccessModifier.police;

public class cop {
    public String Name;
    protected String Address;
    protected String phone;
    private String a;

    protected void protectedT(){
        System.out.println("protected");
    }
    public void publicT(){
        System.out.println("public");
    }
    private void privateT(){
        System.out.println("public");
    }
}
