class Car {

    String brand;
    String model;
    String color;
    int speed;

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    void startCar() {
        System.out.println("Car is started.");
    }

    void stopCar() {
        System.out.println("Car is stopped.");
    }

    void accelerate() {
        speed = speed + 20;
        System.out.println("Car speed is now " + speed + " km/h");
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "Toyota";
        c1.model = "Corolla";
        c1.color = "White";
        c1.speed = 60;

        c1.displayCar();
        c1.startCar();
        c1.accelerate();
        c1.stopCar();
    }
}