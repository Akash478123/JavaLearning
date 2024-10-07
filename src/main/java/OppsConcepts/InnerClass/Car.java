package OppsConcepts.InnerClass;

public class Car {

    void drive(){
        System.out.println("Yes!! you Can drive the car");
    }
class Engine {
    void engineCC(String cc) {
        System.out.println("You have to Drive " + cc + " Engine");
    }

    class Acc{
        void spark(){
            System.out.println("Engine Start!!!");
        }
    }
}

}


class rc{
    public static void main(String[] args) {
        Car c=new Car();
        Car.Engine E =c.new Engine();
       Car.Engine.Acc a= E.new Acc();
        E.engineCC("1000CC");
        a.spark();
        c.drive();
    }
}
