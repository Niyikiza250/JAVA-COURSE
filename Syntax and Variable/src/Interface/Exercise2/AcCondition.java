package Interface.Exercise2;

public class AcCondition implements SmartDevice,Adjustable{

    @Override
    public void increaseLevel() {
        System.out.println(" The AC level has increased because of the high temperature detected");
    }

    @Override
    public void decreaseLevel() {
        System.out.println(" The AC level has Decreased because of the low temperature detected");
    }

    @Override
    public void turnOn() {
        System.out.println(" The AC has turned On because of the climate");
    }

    @Override
    public void turnOff() {
        System.out.println(" The Ac has turned Off because also the climate");
    }
}
