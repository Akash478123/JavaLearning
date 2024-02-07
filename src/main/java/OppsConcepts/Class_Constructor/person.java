package OppsConcepts.Class_Constructor;

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
    person(String Nam,double sal,int age,long phNo )
    {
       this.name=Nam;
       this.salary=sal*3;
        this.age=age+2;
        this.PhNo=phNo;

    }


void sleep()
{
    System.out.println("sleep");
}

void getDetails(){
    System.out.println("Name is ----> "+ this.name);
    System.out.println("Phone Number is ----> "+ this.PhNo);
    System.out.println("Salary is ----> "+ this.salary);
    System.out.println("Age is ----> "+ this.age);

}
}