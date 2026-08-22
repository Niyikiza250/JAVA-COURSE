package Abstract;

public abstract class Vehicle {
        private String brand;
        private double speed;

    public void setBrand(String brand) {
        if (brand.matches("[a-zA-Z ]+")){
            this.brand = brand;
        }
        else {
            System.out.println(" The brand must be btn A-Z");
        }
    }

    public void setSpeed(double speed) {
        if (speed>0){
            this.speed = speed;
        }
        else {
            System.out.println(" The vehicle must be greater than 0");
        }
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    abstract void Start();
    abstract  void Stop();
    void aceralate(){
        System.out.println(" If you're Starting your vehicle you have to aceralate more");
        System.out.println(" if you're stoping your vehicle you must also stop to aceralate.");
    }


}
