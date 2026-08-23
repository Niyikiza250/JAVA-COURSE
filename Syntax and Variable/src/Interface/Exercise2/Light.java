package Interface.Exercise2;

public class Light implements SmartDevice{

    @Override
    public void turnOn() {
        System.out.println(" The light turned On");
    }

    @Override
    public void turnOff() {
        System.out.println(" The light Turned Off\n\n");
    }
}
