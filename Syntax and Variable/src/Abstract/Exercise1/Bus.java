package Abstract.Exercise1;

public class Bus extends Vehicle {

    @Override
    void Start() {
        System.out.println(" The brand of the Bus is "+getBrand());
        System.out.println(" The Speed of this Bus is "+getSpeed());

    }

    @Override
    void Stop() {
        System.out.println(" We've reached where we should stop from, Thank you.");
    }
}
