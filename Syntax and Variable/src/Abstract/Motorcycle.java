package Abstract;

public class Motorcycle extends Vehicle{


    @Override
    void Start() {
        System.out.println(" The brand of this Motorcycle is "+getBrand());
        System.out.println(" This Motorcycle is walking on the speed of "+getSpeed());
    }

    @Override
    void Stop() {
        System.out.println(" This the end of our walk for today, Thank you.");
    }
}
