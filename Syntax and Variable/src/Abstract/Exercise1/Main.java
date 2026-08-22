package Abstract.Exercise1;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vehicle car = new Car();
        Vehicle moto = new Motorcycle();
        Vehicle bus = new Bus();

        int choir;

        while (true){
            System.out.println(" WELCOME TO VEHICLE SYSTEM");
            System.out.println(" 1. Car");
            System.out.println(" 2. Motorcycle");
            System.out.println(" 3. Bus");
            choir= scan.nextInt();
            scan.nextLine();
            switch (choir){

                case 1:
                    System.out.println(" Enter the brand of your Car");
                    String carBrand=scan.nextLine();
                    car.setBrand(carBrand);
                    System.out.println(" Enter the speed that you're working on ");
                    double carSpeed= scan.nextDouble();
                    car.setSpeed(carSpeed);
                    car.Start();
                    car.Stop();
                    car.aceralate();
                    break;
                case 2:
                    System.out.println(" Enter the brand of your Motorcycle");
                    String motorBrand= scan.nextLine();
                    moto.setBrand(motorBrand);
                    System.out.println(" Enter the speed that you're driving on");
                    double motoSpeed= scan.nextDouble();
                    moto.setSpeed(motoSpeed);
                    moto.Start();
                    moto.Stop();
                    moto.aceralate();
                    break;

                case 3:
                    System.out.println(" Enter the brand of the Bus");
                    String busBrand= scan.nextLine();
                    bus.setBrand(busBrand);
                    System.out.println(" Enter the speed of your Bus");
                    double busSpeed= scan.nextDouble();
                    bus.setSpeed(busSpeed);
                    bus.Start();
                    bus.Stop();
                    bus.aceralate();
                    return;

            }
        }
    }
}
