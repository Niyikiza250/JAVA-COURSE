package Interface.Exercise2;

public class Main {
    static void main(String[] args) {


        SmartDevice light = new Light();
        SmartDevice fan = new Fan();
        SmartDevice ac = new AcCondition();

        Adjustable fan1= new Fan();
        Adjustable Ac =new AcCondition();

        light.turnOn();
        light.turnOff();

        fan.turnOn();
        fan.turnOff();
        fan1.increaseLevel();
        fan1.decreaseLevel();

        ac.turnOn();
        ac.turnOff();
        Ac.increaseLevel();
        Ac.decreaseLevel();
    }
}
