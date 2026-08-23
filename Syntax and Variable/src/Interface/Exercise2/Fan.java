package Interface.Exercise2;

public class Fan implements SmartDevice,Adjustable{

    @Override
    public void increaseLevel() {
        System.out.println("  The fan level increased");
    }

    @Override
    public void decreaseLevel() {
        System.out.println(" The fan level Decreased\n\n");
    }

    @Override
    public void turnOn() {
        System.out.println(" The fan has Turned On");
    }

    @Override
    public void turnOff() {
        System.out.println(" The fan has Turned Off");
    }
}
