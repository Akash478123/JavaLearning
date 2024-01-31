package OppsConcepts;

public class person {
    String name;
    Long PhNo;
    int age;
    double salary;
    String email;

person()
{
    name="Akash";
}
    person(String n)
    {
        this.name=n;
    }


void sleep()
{
    System.out.println("sleep");
}

void getDetails(long ph){
    System.out.println("Name is ----> "+ this.name);
    System.out.println("Phone Number is ----> "+ this.PhNo);
}
}