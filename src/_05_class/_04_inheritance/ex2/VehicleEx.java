package _05_class._04_inheritance.ex2;

public class VehicleEx {
    public static void main(String[] args) {
        // Bus 객체 생성 및 출력
        Bus myBus = new Bus("Hyundai", "City Bus", 2022, 30);
        System.out.println("\n==== Bus 정보 ====");
        System.out.println(myBus);
        myBus.start();
        myBus.carryPassengers();
        myBus.stop();

        // Car 객체 생성 및 출력
        Car myCar = new Car("Toyota", "Camry", 2023, true);
        System.out.println("\n==== Car 정보 ====");
        System.out.println(myCar);
        myCar.start();
        myCar.park();
        myCar.stop();

        // Motorcycle 객체 생성 및 출력
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "A");
        System.out.println("\n==== Motorcycle 정보 ====");
        System.out.println(myMotorcycle);
        myMotorcycle.start();
        myMotorcycle.wheelie();
        myMotorcycle.stop();
    }
}
