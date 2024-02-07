package OppsConcepts.Implements;

public class imple implements Acc,breaks {

    @Override
    public void increment(int i) {
        System.out.println("Increment By " + i);
    }

    @Override
    public void decrement(int i) {
        System.out.println("Decrement By " + i);


    }

    @Override
    public void applyBreaks(Boolean did) {

        if (did == true) {
            System.out.println("breaks applied!!!");
        } else {
            System.out.println("breaks Not applied !!!");
        }

    }

}

