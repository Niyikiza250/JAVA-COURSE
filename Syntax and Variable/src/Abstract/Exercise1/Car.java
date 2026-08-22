package Abstract.Exercise1;

public class Car extends Vehicle {

    @Override
    void Start() {
        System.out.println(" The brand this car is "+getBrand());
        System.out.println(" This car is walking on the speed of "+getSpeed());
    }

    @Override
    void Stop() {
        System.out.println(" Hello to you passengers we have reached at the destination");
    }
}
